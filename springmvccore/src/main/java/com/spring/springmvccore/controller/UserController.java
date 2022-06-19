package com.spring.springmvccore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.spring.springmvccore.dto.User;

@Controller
public class UserController {

	@RequestMapping("registration")
	public String showRegistrationPage() {
		return "userRegistration";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap modelMap) {
		System.out.println(user);
		modelMap.addAttribute("user", user);
		return "regResult";
	}
}
