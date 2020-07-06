package com.example.javawebtutor.form;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;

public class HelloForm extends ActionForm {
	
	private String name;

	public HelloForm() {
		super();
		System.out.println("HeloooooooooooooooooI am  HelloForm Constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
