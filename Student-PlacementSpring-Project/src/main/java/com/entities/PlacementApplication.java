package com.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.controller.CertificateController;
import com.controller.CollegeController;
import com.controller.PlacementController;
import com.controller.StudentController;


@SpringBootApplication
public class PlacementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacementApplication.class, args);
		System.out.println("hi");
	}

}
