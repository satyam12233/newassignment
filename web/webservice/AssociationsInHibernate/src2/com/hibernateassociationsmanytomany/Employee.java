package com.hibernateassociationsmanytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeid;

	private String firstname;
	private String lastname;
	private int salary;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "employee_certificate", joinColumns = {
			@JoinColumn(name = "employeeid") }, inverseJoinColumns = { @JoinColumn(name = "cetificateID") })
//	@OrderColumn(name = "type")
	private Set<Certificate> certificate = new HashSet<Certificate>();

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set<Certificate> getCertificate() {
		return certificate;
	}

	public void setCertificate(Set<Certificate> certificate) {
		this.certificate = certificate;
	}

}
