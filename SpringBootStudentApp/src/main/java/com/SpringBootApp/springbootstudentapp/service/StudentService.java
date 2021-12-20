package com.SpringBootApp.springbootstudentapp.service;

import java.util.List;

import com.SpringBootApp.springbootstudentapp.entity.*;

public interface StudentService {

	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student student);

	public void deleteById(int theId);

	public List<Student> searchBy(String name);
}
