package com.example.javawebtutor.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.example.javawebtutor.form.HelloForm;

public class HelloAction extends Action {
	
   @Override
public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	   
	   HelloForm helloForm = (HelloForm)form;
	   ActionForward fw = mapping.getInputForward();
	   
	   
	   if ( helloForm!= null && helloForm.getName().equalsIgnoreCase("satish") ) {
		   fw = mapping.findForward("sucess");
	   }else {
		   ActionErrors errs = new ActionErrors();
		   errs.add("",new ActionMessage("hello.msg.err"));
		   saveErrors(request, errs);
		   fw = mapping.findForward("fail");
	   }  
	return fw;
}
}
