package com.hibernateassociationsmanytomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cetificate_name")
public class Certificate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int certificateID;
	private String certificateName;
	
	
	public int getCertificateID() {
		return certificateID;
	}
	public void setCertificateID(int certificateID) {
		this.certificateID = certificateID;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	

}
