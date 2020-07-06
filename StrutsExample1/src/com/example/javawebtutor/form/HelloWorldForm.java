package com.example.javawebtutor.form;
import org.apache.struts.action.ActionForm;
public class HelloWorldForm extends ActionForm {
private String hello = null;
public HelloWorldForm() {
super();
hello = "Hello Woqqqqqqqqqrld";
System.out.println("HHHHHHHHHHHHHHHHH111111111111111qqqqqqqqqqqqq");
}
public String getHello() {
return hello;
}
public void setHello(String hello) {
this.hello = hello;
}
}