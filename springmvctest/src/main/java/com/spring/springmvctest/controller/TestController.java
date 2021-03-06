package com.spring.springmvctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/test")
	public ModelAndView test() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("test");
		modelandview.addObject("id", "STUD01");
		modelandview.addObject("name", "Salmanul Farisy K");
		modelandview.addObject("programme", "MCA");
		modelandview.addObject("batch", "2020-2022");
		return modelandview;
	}
}
