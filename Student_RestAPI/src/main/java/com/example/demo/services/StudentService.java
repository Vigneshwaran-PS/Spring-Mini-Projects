package com.example.demo.services;

import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Student;

public interface StudentService {
	public ModelAndView addStudent(Student student);
	public ModelAndView getStudentById(int rollno);
	public void deleteStudentById(int rollno);
	public ModelAndView updateStudentById(int rollno);
	public ModelAndView updateStudent(Student student);
}
