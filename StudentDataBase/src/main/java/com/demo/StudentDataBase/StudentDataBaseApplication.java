package com.demo.StudentDataBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.StudentDataBase.Entity.Student;
import com.demo.StudentDataBase.repo.StudentRepository;

@SpringBootApplication
public class StudentDataBaseApplication   
{
	public static void main(String[] args) {
		SpringApplication.run(StudentDataBaseApplication.class, args);
	}
	
}


// insert  Hardcode
/**
 * @SpringBootApplication public class StudentDataBaseApplication implements
 *                        CommandLineRunner {
 * 
 *                        public static void main(String[] args) {
 *                        SpringApplication.run(StudentDataBaseApplication.class,
 *                        args); }
 * 
 * 
 *                        //INSERT implements Command Line Runner
 * 
 * @Autowired private StudentRepository repo;
 * 
 * @Override public void run(String... args) throws Exception {
 * 
 * 
 *           Student s1= new Student(1,
 *           "arshid","sheikh","sheikh@123gmail.com"); repo.save(s1); Student
 *           s2= new Student(2, "bablu","mohammed","mohammed@123gmail.com");
 *           repo.save(s2); Student s3= new Student(3,
 *           "areesh","sheikh","sheikhmohammed@123gmail.com"); repo.save(s3);
 * 
 * 
 *           }
 * 
 * 
 * 
 * 
 *           }
 */
