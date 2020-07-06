package com.satish.Lab6;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

@Controller
public class BooksController {

	public String getbooks(HttpSession Session)
	{
		System.out.println("Hii This is getbooks");
		List<Book> blist = new ArrayList<Book>();
		Book b1 = new Book(101, "java", "satish", 1000, "JLC");
		Book b2 = new Book(102, "java1", "satish", 1000, "JLC");
		Book b3 = new Book(103, "java1", "satish", 1000, "JLC");
		return "booksList";
	}
}
