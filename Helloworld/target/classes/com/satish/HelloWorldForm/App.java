package com.satish.HelloWorldForm;

import javax.servlet.http.*;

import org.apache.struts.action.*;
import org.apache.struts.action.ActionForward;

import com.mkyong.common.HelloWorldForm;

/**
 * Hello world!
 *
 */
public class App extends Action
{

	
	@override
	public ActionForward execute(ActionForm form, ActionMapping mapping,
	            HttpServletRequest request, HttpServletResponse response)
	            throws Exception() {
		
		System.out.println("......SATISH>>>>>>>>>>>>>>>>>...");
		HelloWorldForm helloWorldForm = (HelloWorldForm) form;
		helloWorldForm.setMessage("Hello World! Struts");
		
		return mapping.findForward("success");

	}
	
	
	
}
