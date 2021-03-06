package com.spring.springmvcorm.user.controller;

import java.util.List;

import javax.enterprise.inject.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.springmvcorm.user.entity.User;
import com.spring.springmvcorm.user.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	@RequestMapping("regPage")
	public String shoRegPage() {
		return "userReg";
	}

	@RequestMapping(value = "saveReg", method = RequestMethod.POST)
	public String saveReg(@ModelAttribute("user") User user, ModelMap modelMap) {
		int result = service.save(user);
		modelMap.addAttribute("user", "User registered with id: " + result);
		return "userReg";
	}

	@RequestMapping("getUsers")
	public String getUsers(ModelMap map) {
		List<User> usersList = service.loadAll();
		map.addAttribute("users", usersList);
		for (User user : usersList) {
			System.out.println(user);
		}
		return "displayUsers";
	}

	@RequestMapping("validateEmail")
	public @ResponseBody String validateEmail(@RequestParam("id") int id) {
		User user = service.getUser(id);
		String msg = "";
		if (user != null) {
			msg = "User already exist with id: " + id;
		}
		return msg;
	}
}
