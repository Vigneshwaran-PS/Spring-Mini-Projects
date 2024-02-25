package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	StudentRepository repository;
	
	
	@Override
	public ModelAndView addStudent(Student student) {
		repository.save(student);
		return new ModelAndView();
	}
	
	@Override
	public ModelAndView getStudentById(int rollno) {
		Student student = repository.findById(rollno).get();
		ModelAndView mav = new ModelAndView("studentDetails.jsp");
		mav.addObject(student);
		return mav;
	}
	
	@Override
	public void deleteStudentById(int rollno) {
		repository.deleteById(rollno);
	}
	
	@Override
	public ModelAndView updateStudentById(int rollno) {
		Student student = repository.findById(rollno).get();
		return new ModelAndView("updateStudent.jsp");
	}
	
	@Override
	public ModelAndView updateStudent(Student student) {
		repository.save(student);
		return new ModelAndView("index.jsp");
	}
	
}
