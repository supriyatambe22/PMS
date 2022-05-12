package com.pms.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.entity.Student;
import com.pms.repository.StudentRepo;
import com.pms.service.StudentService;

@Service
public class StudentServiceImplementation   implements StudentService
{
	@Autowired
    StudentRepo studentRepo;
	
	@Override
	public void addStudent(Student student)
	{
 this.studentRepo.save(student);		
	}

	
	
	
	
	@Override
	public Student checkLogin(String email, String contact)
	{
		return studentRepo.findByStudentEmailAndStudentContact(email, contact);
	}

	
	
	
}
