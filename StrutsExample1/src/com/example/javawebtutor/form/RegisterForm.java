package com.example.javawebtutor.form;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class RegisterForm extends ActionForm {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
   @Override
public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {	
	   System.out.println("In Register valkidate Forma");
	   ActionErrors errs = new ActionErrors();
	   String flag = request.getParameter("vflag");
	   System.out.println("this is vflg satish please check this one"+flag);
	   if(flag.equals("false")) {
		   System.out.println("server side form validation is going on..");
	   if(username ==null || username.length()==0 ||username.equals("")) {
		errs.add("err1",new ActionMessage("my.un.err")) ;
	   }else {
		   char fchar=username.charAt(0);
		   if(!Character.isUpperCase(fchar) && !Character.isLowerCase(fchar)){
			   errs.add("err1", new ActionMessage("my.un.fchar"));
		   }
	   }
	   if(password ==null ||password.length()==0 || password.equals("")) {
		   errs.add("err2",new ActionMessage("my.pwd.err"));
	   }
	   System.out.println("errs obj size"+ errs.size());
	   }
	   return errs;
   }
}
