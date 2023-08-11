package com.student.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student 
{
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;//
    private String address;
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
    }




public Student(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
public Student()
{
    super();
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
    
    
}
