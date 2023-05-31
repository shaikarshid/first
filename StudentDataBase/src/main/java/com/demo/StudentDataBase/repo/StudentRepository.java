package com.demo.StudentDataBase.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.StudentDataBase.Entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>
{

}
