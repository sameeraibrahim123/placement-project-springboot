package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.entities.Student;
import com.repository.StudentRepository;




@Service
@Transactional
@Component
public class StudentService {
	
	@Autowired
	 private StudentRepository repo;
	 
	 public List<Student> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(Student student) 
	 {
	 repo.save(student);
	 }
	 
	 public Student get(Integer id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }

}
