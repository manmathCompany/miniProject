package com.mn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mn.binding.Contact;
import com.mn.service.ContactService;


@Controller
public class ContactInfoController {

	@Autowired
	private  ContactService service;

	
	
	
	@GetMapping(value = "/form")
	public String show_form(Model model) {
		Contact c=new Contact();
		
		model.addAttribute("contact", c);
		return "form";
	}
	
	@PostMapping(value = "/form")
	public String handel_submitForm(@ModelAttribute Contact c,Model m) {
		
		
		
		boolean b=service.saveContact(c);
		String msg=null;
		if(b==true) {
			msg="Registered";
		}
		else msg="Not Registered";
		
		m.addAttribute("msg", msg);
		return "redirect:/register";
	}
	
	@RequestMapping(value="/register",method = RequestMethod.GET)
	public String register(Model m) {
		
		String msg="registered";
		m.addAttribute("msg", msg);
		return"register";
	}
	
	@RequestMapping("/getall")
	public String show_allContact(Model model) {
		List<Contact> list=service.getAllContacts();
		model.addAttribute("list", list);
		
		return "show_all";
	}
	
	@RequestMapping("/delete")
	public String delete(Model model,@RequestParam("contactId") Integer cid) {
		
		String s=service.deleteContact(cid);
		
		
		  List<Contact> list=service.getAllContacts();
		  
		  
		 
		model.addAttribute("list", list);
		return "show_all";
	}
	
	@RequestMapping("/edit")
	public String modifie(@RequestParam("contactId") Integer cid,Model model) {
		
		Contact c=service.getContactById(cid);
		
		model.addAttribute("contact", c);
		return "form";
	}
}
