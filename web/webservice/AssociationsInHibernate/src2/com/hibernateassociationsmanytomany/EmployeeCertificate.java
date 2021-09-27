package com.hibernateassociationsmanytomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_certificate")
public class EmployeeCertificate {
	

	private int  employeeid;
	private int cetificateID;
	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public int getCetificateID() {
		return cetificateID;
	}
	public void setCetificateID(int cetificateID) {
		this.cetificateID = cetificateID;
	}
	
}
