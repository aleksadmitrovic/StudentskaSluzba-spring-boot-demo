package com.demo.studentskaSluzba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.studentskaSluzba.student.Student;

@SpringBootApplication
@RestController
public class StudentskaSluzbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentskaSluzbaApplication.class, args);
	}
	
	@GetMapping
	public List<Student> hello() {
		List<Student> studenti= new ArrayList<>();
		studenti.add(new Student(1L, "18/2012 UV", "Aleksa", "Dmitrovic", "Novi Sad", LocalDate.of(1993, 11, 11)));
		return studenti;
	}

}

