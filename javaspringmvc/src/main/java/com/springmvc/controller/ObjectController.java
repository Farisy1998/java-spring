package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Salmanul Farisy K");
		emp.setSalary(12000);
		modelAndView.addObject("emp", emp);
		return modelAndView;
	}
}
