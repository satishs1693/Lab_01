package com.example.javawebtutor.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.example.javawebtutor.form.RegisterForm;

public class RegisterAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("Register Actyion : excute ");
		RegisterForm fm =(RegisterForm)form;
		String uname=fm.getUsername();
		String pwd = fm.getPassword();
		if (uname.equals("durga") && pwd.equals("soft"))
			return mapping.findForward("sucess");
		else
			return mapping.findForward("failure");
	}
}
