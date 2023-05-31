package com.demo.StudentDataBase.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.StudentDataBase.Entity.Student;
import com.demo.StudentDataBase.Service.StudentService;
import com.demo.StudentDataBase.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{

	private StudentRepository sturepo;/****/
	public StudentServiceImpl(StudentRepository sturepo) {
		super();
		this.sturepo = sturepo;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return sturepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) 
	{
		return sturepo.save(student);
	}


	@Override
	public void deleletStudentById(int id) {
		sturepo.deleteById(id);
		
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return sturepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return sturepo.save(student);
	}

	



}
