package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamsController {

	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value = "sal", required = false, defaultValue = "0") double salary) {
		System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
		return new ModelAndView("userRegistration");
	}
}
