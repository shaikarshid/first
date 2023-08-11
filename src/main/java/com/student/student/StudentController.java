package com.student.student;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.ui.Model;

@Controller
public class StudentController {

    @Autowired
    Studentrepo repo;

    // Display
    @GetMapping("/")
    public String page(Model model) // model = to get the form details
    {
        model.addAttribute("student", new Student()); // toset the form details to the entitiy obj
        return "index";
    }

    // insert
    @PostMapping("/add")
    String studentData(@ModelAttribute Student student) // no need to model.addAttrited automatically to do above to
    // comments
    {
        repo.save(student);
        return "redirect:/";
    }

    // ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // fetch
    @GetMapping("/fetch")
    String fetchdata(Model model) {
        List<Student> findAll = repo.findAll();
        model.addAttribute("studentobj", findAll);

        return "fetch";
    }

    // detete
    @GetMapping("/delete/{id}")
    public String deletePerson(@PathVariable("id") int id) {
        repo.deleteById(id);
        return "redirect:/fetch";
    }

    // updateById page
      @GetMapping("/update/link/{id}")
      String editpage(@PathVariable("id")int id,Model model)
     {

           Student findid = repo.findById(id).get();
         model.addAttribute("student",findid );
        return "edit";
    }

    // after update details click submit
    @PostMapping("/update/submit/{id}")
    String updatestudent(@PathVariable("id") int id, @ModelAttribute Student  student ,Model model)
    { 
        //get the details from thhe batabase and set the entity
                 Student details = repo.findById(id).get();

                            details.setName(student.getName());
                            details.setAge(student.getAge());
                            details.setAddress(student.getAddress());

                          Student updatdetails = repo.save(details);
                            model.addAttribute("student", updatdetails);
     
            return"redirect:/fetch";

    }
}
