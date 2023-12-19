package com.example.Model;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student_DTO {

//	IN MODEL PACKAGE WE HAVE TO CREATE THE CLONE OF ENTITY CLASS WITH SAME ATTRIBUTE 
//	VALIDATION SHOULD BE IN DTO 
//	 DTO class is a replica of Entity  class
//	this is step 2 

	@NotNull
	private int id;
	@NotNull
	@Size(min=3,max=50,message="Name should be within 3 to 50 characters")
	private String name;
	@NotNull
	@Size(min=10,max=100,message="Address should be within 10 to 100 characters")
	private String address;
	@NotNull
	@Size(min=10,message="Phone Number should be 10 characters") // size must me decleared 
	private String phone_No;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_No() {
		return phone_No;
	}
	public void setPhone_No(String phone_No) {
		this.phone_No = phone_No;
	}
	
	
}
