package com.example.Util;


import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.Entity.Student;
import com.example.Model.Student_DTO;

@Component  //IN internally @component make the object of this class  (this is step three)
public class Converter {
	
	
	// source , target
	// Conversion from DTO to Entity  because--- client to server --- to save on databse
	public Student convertToStudentEntity(Student_DTO ref) {
		Student s = new Student();
		if(ref != null) {
			// Its a static method to copy the properties from source obj to target obj 
			//where the property name are same for both the object
			BeanUtils.copyProperties(ref, s);
		}
		return s;
	}
	
//	conversion From entity to DTO ----- to client
	public Student_DTO convertToStudentDto(Student s) {
		Student_DTO res = new Student_DTO();
		if(s != null) {
			BeanUtils.copyProperties(s, res);
		}
		return res;
	}

}
