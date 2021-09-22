package com.hibernatestudentdemo;

public class Student {
	private String studentName;
	private String address;
	private String phoneNo;
		
	public Student(){
		
	}
		public Student(String studentName, String address, String phoneNo) {
		super();
		this.studentName = studentName;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
	
	
	
	


