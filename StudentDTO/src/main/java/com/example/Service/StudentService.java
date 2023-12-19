package com.example.Service;

import java.util.List;

import com.example.Entity.Student;
import com.example.Model.Student_DTO;

//this is step 5

public interface StudentService {
	

    // return replica of entity
	Student_DTO createStudent(Student st);
	// After creating student in database it will return a student object
	
	List<Student_DTO> getStudents();
	
	Student_DTO getStudentById(int id);
	
	Student_DTO updateStudent(int id , Student s);
	
	String deleteStudentById(int id);
	

}
