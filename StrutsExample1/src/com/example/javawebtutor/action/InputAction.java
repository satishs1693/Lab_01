package com.example.javawebtutor.action;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.example.javawebtutor.form.InputFrom;

public class InputAction extends Action{
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		InputFrom fm = (InputFrom)form;
		ActionForward fw = mapping.getInputForward();
		if( fm != null) {
		 String name = fm.getName();
		 System.out.println(name);
		 String ms   = fm.getMs();
		 String gen  = fm.getGender();
		 
		 String Add   =fm.getAddrs();
		 String []crs = fm.getCrs();
		 for (int i = 0; i < crs.length; i++) {
			//System.out.println(crs[i]);
			System.out.println("Courses are "+crs[i]);
		}
		 String []Hb = fm.getHb();
		 System.out.println("Hobies are "+Hb);
		 String qlfy =fm.getQlfy();
		 int age = fm.getAge();
		 System.out.println(age);
		 if ( age > 18) {
			 request.setAttribute("msg", "you are eligible for vote ");
		 }else {
			 request.setAttribute("msg", "you are not eligible for the vote");
		 }
		 request.setAttribute("name",name );
		 request.setAttribute("ms",ms);
		 request.setAttribute("gen",gen);
		 request.setAttribute("Add",Add);
		 request.setAttribute("crs",crs);
		 request.setAttribute("Hb",Hb);
		 request.setAttribute("qlfy",qlfy);
		 request.setAttribute("age",age);
		
		}else {
			System.out.println("I am here ");
		} 
		 fw=mapping.findForward("result");
		 System.out.println("I am here satiosh");
		 return fw;
	}

}
