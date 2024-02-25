package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	@Column
	private String name;
	@Column
	private String department;
	@Column
	private float cgpa;
	
	public Student() {
		
	}

	public Student(int rollno, String name, String department, float cgpa) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.department = department;
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", department=" + department + ", cgpa=" + cgpa + "]";
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	
	
}
