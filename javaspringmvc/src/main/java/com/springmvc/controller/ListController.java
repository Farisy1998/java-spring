package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Salmanul Farisy K");
		emp.setSalary(12000);

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Aiswarya K A");
		emp2.setSalary(13000);

		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("Aarathy P V");
		emp3.setSalary(14000);

		List<Employee> emps = new ArrayList<Employee>();
		emps.add(emp);
		emps.add(emp2);
		emps.add(emp3);

		modelAndView.addObject("emps", emps);
		return modelAndView;
	}
}
