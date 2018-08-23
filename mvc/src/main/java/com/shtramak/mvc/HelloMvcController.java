package com.shtramak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloMvcController {
	@RequestMapping("/")
	public String helloMvc() {
		return "hello";
	}

	@RequestMapping("showForm")
	public String showForm() {
		return "hello-form";
	}

	@RequestMapping("process")
	public String helloDude(@RequestParam("name") String name, Model model) {
		name = name.toUpperCase();
		model.addAttribute("message", name);
		return "hello-dude";
	}

	@RequestMapping("showStudentForm")
	public String studenForm(Model model) {
		return "student-form";
	}

}
