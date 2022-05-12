package com.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.pms.entity.Student;

public interface StudentRepo  extends JpaRepository<Student,Integer>
{
public Student findByStudentEmailAndStudentContact(String email, String password);
}
