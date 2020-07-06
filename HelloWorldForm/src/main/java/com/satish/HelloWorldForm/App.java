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
  
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)
	        throws Exception {
			
			HelloWorldForm helloWorldForm = (HelloWorldForm) form;
			helloWorldForm.setMessage("Hello World! Struts");
			
			return mapping.findForward("success");
		}
	
	
	
}
