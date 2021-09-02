package com;

public class StudentInfo {
	private int id;

	private String studentName;
	private String address;

	private int pincode;

	private String rollNumber;

	private String mobile;

	private String email;

	private String branch;
	//constructor
		public StudentInfo() {
			super();
		}
			//constructor
			public StudentInfo(Integer id,String studentname,String email,String address,String branch,String rollNumber,String mobile,int pincode) {
				super();
				this.id=id;
				this.studentName=studentname;
				this.email=email;
				this.address=address;
				this.branch= branch;
				this.rollNumber=rollNumber;
				this.mobile=mobile;
				this.pincode=pincode;
				
			}
//id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
//name
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
//address
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
 //Pin code
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
// Roll Number
	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
// Mobile Number
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
// Email
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
// Branch
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	
	


}
