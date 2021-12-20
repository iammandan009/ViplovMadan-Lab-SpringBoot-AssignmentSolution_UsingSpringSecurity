package com.SpringBootApp.springbootstudentapp.service;

import com.SpringBootApp.springbootstudentapp.entity.*;
import com.SpringBootApp.springbootstudentapp.repository.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentrepository;

	@Override
	@Transactional
	public List<Student> findAll() {
		List<Student> students = studentrepository.findAll();
		return students;
	}

	@Override
	@Transactional
	public Student findById(int theId) {
		return studentrepository.findById(theId).get();
	}

	@Override
	@Transactional
	public void save(Student student) {
		studentrepository.save(student);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		studentrepository.deleteById(theId);
	}

	@Override
	@Transactional
	public List<Student> searchBy(String name) {
		List<Student> students = studentrepository.findByNameContainsAllIgnoreCase(name);
		return students;
	}

}
