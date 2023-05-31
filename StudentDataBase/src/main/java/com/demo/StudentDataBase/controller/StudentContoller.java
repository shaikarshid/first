package com.demo.StudentDataBase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.StudentDataBase.Entity.Student;
import com.demo.StudentDataBase.Service.StudentService;

@Controller
public class StudentContoller 
{

	private StudentService serviceObj;             /**/
	public StudentContoller(StudentService serviceObj) {
		super();
		this.serviceObj = serviceObj;
	}


	//GET
	// handle method to handle  list student and return mode and view
	@GetMapping("/students")
	public String  listStudent(Model  model)
	{
		model.addAttribute("students",serviceObj.getAllStudents()); /* " refKey", ServiceObj. functioName */
		return "student";         //templates[students.html]
	}

	//ADDSTUDENTbUTTON
	@GetMapping("/students/new")
	public String createStudentForm(Model model)
	{
		// create student object to hold student found data
		Student student= new Student();
		model.addAttribute("student",student);
		return "createStudent";
	}

	//sAVE
	//handinling the form in create Student.html
	@PostMapping("/students")
	public String saveStudents(@ModelAttribute("student") Student student)
	{
		serviceObj.saveStudent(student);
		return "redirect:/students";  // again ListOfStudent met getMapping met haiso Students ko reagain bulana
	}



	//delete handle method 
	@GetMapping("/students/{id}")
	public String deleteStudents(@PathVariable int id)
	{
		serviceObj.deleletStudentById(id);
		return "redirect:/students";
	}

	//update BUTTON
	@GetMapping("/students/edit/{id}")
	public String editStudent(@PathVariable int id,Model model)
	{
		model.addAttribute("student", serviceObj.getStudentById(id));
		return "editStudent";
	}

	//UPDATE
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable int id,@ModelAttribute("student")Student student ,Model model)
	{
		//get Student from database by id
		Student existingStudent=serviceObj.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		//save update student obj
		serviceObj.updateStudent(existingStudent);
		return "redirect:/students";
	}
}
//localhost:8080/students