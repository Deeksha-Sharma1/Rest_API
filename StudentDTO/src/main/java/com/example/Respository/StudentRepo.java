package com.example.Respository;

//this is 4 step
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Student;

public interface StudentRepo  extends JpaRepository<Student, Integer> {
	
	
	
	

}
