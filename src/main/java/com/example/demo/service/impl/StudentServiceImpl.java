package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentrepository;

	public StudentServiceImpl(StudentRepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentrepository.findAll();// find all methods returns the list of all the syudents
		
		
	}

	@Override
	public Student saveStudent(Student student) {
		return studentrepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return studentrepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentrepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentrepository.deleteById(id);
	}

}
