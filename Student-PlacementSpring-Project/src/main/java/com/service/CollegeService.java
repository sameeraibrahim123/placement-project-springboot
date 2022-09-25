package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.entities.College;
import com.repository.CollegeRepository;


@Service
@Transactional
@Component
public class CollegeService {
	
	@Autowired
	private CollegeRepository repo;

	public List<College> listAll() {
		return repo.findAll();
	}

	public College get(Integer id) {
		return repo.findById(id).get();
	}

	public void save(College college) {
		repo.save(college);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
