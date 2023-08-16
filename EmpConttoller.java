package com.postman.insertAndFetch;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpConttoller {
    @Autowired
    EmployeeRepo repo;

    @PostMapping("/add")
    public Employee saveStudent(@RequestBody Employee employee) {
        System.out.println(employee);
        return repo.save(employee);
    }

    // @PostMapping("/add")
    // public Employee saveStudent() {
    // Employee employee = new Employee();
    // employee.setName("hardcode");
    // employee.setAge(22);
    // System.out.println(employee);
    // return repo.save(employee);
    // }

    @GetMapping("/fetch")
    public List<Employee> getall() {
        List<Employee> all = repo.findAll();
        System.out.println(all);
        return all;
    }

    @DeleteMapping("/delete/{id}")
    public String deleted(@PathVariable int id) {

        Optional<Employee> finded = repo.findById(id);
        if (finded.isPresent()) {
            repo.deleteById(id);
        } else {
            return "not found";
        }
        return "deletedd";
    }

    @PutMapping("update/{id}")
    public String update(@PathVariable("id") int id, @RequestBody Employee emp) {

        Optional<Employee> updateid = repo.findById(id);
        if (updateid.isPresent()) 
        {
            if(emp.getName()!=null)
            {
                updateid.get().setName(emp.getName());
            }
             if(emp.getAge()!=0)
            {
                updateid.get().setAge(emp.getAge());
            }
             repo.save(updateid.get());
        }
        else
        {
            return "not found";
        }
        return "uppdated"; 
     
 
    }
}
// http://localhost:8080/add
// http://localhost:8080/fetch