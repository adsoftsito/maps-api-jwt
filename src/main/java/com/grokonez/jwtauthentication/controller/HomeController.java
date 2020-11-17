package com.grokonez.jwtauthentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/auth")
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}

}