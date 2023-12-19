package com.example.ServiceIMPL;

import java.util.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Student;
import com.example.Model.Student_DTO;
import com.example.Respository.StudentRepo;
import com.example.Service.StudentService;

//import jakarta.persistence.Converter;

import com.example.Util.Converter;


//this is step 6

@Service  //internally we need to t springboot when any services layer method will be called ,ServicesIMPL class will act as a Service.  

public class StudentServicesIMPL implements StudentService {



		@Autowired        // // connecting from service(this file) to repository(StudentService) 
		                     // to store the data in a database 
		StudentRepo r;    // by using Student object store the data in database.
		
		
		@Autowired
		Converter c;   // @ autowired is used for attomatic depencies injection


		@Override
		public Student_DTO createStudent(Student st) {	
			Student st1 = r.save(st);
			return c.convertToStudentDto(st);
		}

		@Override
		public List<Student_DTO> getStudents() {
			
			List<Student> st = r.findAll();
			List<Student_DTO> dtoList = new ArrayList();
			for(Student s : st)
			{
			dtoList.add(c.convertToStudentDto(s));
			}
			return dtoList;
		}

		@Override
		public Student_DTO getStudentById(int id) {
		
			
			Student s = r.findById(id).get();
			return c.convertToStudentDto(s);
		}

		@Override
		public Student_DTO updateStudent(int id, Student s) {
			Student s1 = r.findById(id).get();
			s1.setName(s.getName());
			s1.setPhone_No(s.getPhone_No());
			s1.setAddress(s.getAddress());
			Student ss = r.save(s1);
			return c.convertToStudentDto(ss);
		}

		@Override
		public String deleteStudentById(int id) {
			
			r.deleteById(id);
			return "Deleted Successfully";
		}


	
		
		
		

	
	
}
