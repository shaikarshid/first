package com.demo.StudentDataBase.Service;

import java.util.List;

import com.demo.StudentDataBase.Entity.Student;


public interface StudentService 
{
	List<Student> getAllStudents();

	Student saveStudent(Student student);
	Student getStudentById(int id);
	Student updateStudent(Student student);

	void deleletStudentById(int id);

}
