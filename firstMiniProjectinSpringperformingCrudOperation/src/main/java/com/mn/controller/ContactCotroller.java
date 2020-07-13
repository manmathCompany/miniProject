package com.mn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mn.bo.ContactBO;

@Controller
public class ContactCotroller {

	@RequestMapping("/add")
	public String show_form(@ModelAttribute ContactBO bo,Model m) {
		bo=new ContactBO();
		
		m.addAttribute("obj", bo);
		return "contact";
	}
}
