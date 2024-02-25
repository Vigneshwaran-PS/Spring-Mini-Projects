package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;

@RestController
public class StudentController {

	
	@Autowired
	StudentService service;
	
	
	@GetMapping("/students")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index.jsp");
		return mav;
	}
	
	
	@PostMapping("addStudent")
	public ModelAndView addStudent(@ModelAttribute Student student) {
		ModelAndView mav = new ModelAndView("index.jsp");
		service.addStudent(student);
		return mav;
	}
	
	
	@GetMapping("getStudent")
	public ModelAndView getStudentById(@RequestParam int rollno) {
		return service.getStudentById(rollno);
	}
	
	
	@PostMapping("/deleteStudent")
	public ModelAndView deleteStudentById(@RequestParam int rollno) {
	    service.deleteStudentById(rollno);
	    return new ModelAndView("index.jsp");
	}
	
	@GetMapping("updateStudent")
	public ModelAndView updateStudentById(@RequestParam int rollno) {
		return service.updateStudentById(rollno);
	}
	
	
	@PostMapping("updateStudent")
	public ModelAndView updateStudent(@ModelAttribute Student student) {
		return service.updateStudent(student);
				
	}
}
