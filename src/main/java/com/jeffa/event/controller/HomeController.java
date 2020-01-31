package com.jeffa.event.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jeffa.event.service.JeffaEmailService;

import lombok.Data;


@Controller
@Data
class HomeController {

	final JeffaEmailService service;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("user","sample message from controller");
		//service.sendEmail();
		return "index";
	}

}
