package com.student.student;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepo  extends JpaRepository<Student,Integer>
{
    

}
