package com.demo.studentskaSluzba.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1L, "018/2012 UV", "Aleksa", "Dmitrovic", "Novi Sad", LocalDate.of(1993, 11, 11)));
		return students;
	}

}
