package com.mkyong.common;


import org.apache.struts.action.ActionForm;

import org.apache.struts.action.ActionServlet;

public class HelloWorldForm extends ActionForm{
	
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}