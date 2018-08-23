package com.shtramak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/form")
	public String studentForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}

	@RequestMapping("/studentProcess")
	public String studentProcess(@ModelAttribute("student") Student student) {
		String name = student.getName();
		student.setName(name.toUpperCase());
		return "student-confirm";
	}
}
