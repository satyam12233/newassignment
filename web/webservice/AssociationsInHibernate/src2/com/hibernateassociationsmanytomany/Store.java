package com.hibernateassociationsmanytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Store {
	public static void main(String[] args) {

		StandardServiceRegistry serviceregistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(serviceregistry).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		// storing the value in certificate

		Certificate certificate1 = new Certificate();
		certificate1.setCertificateName("Machine Learning Certificate");

		Certificate certificate2 = new Certificate();
		certificate2.setCertificateName("Microsoft Azure Workshop");

		Certificate certficate3 = new Certificate();
		certficate3.setCertificateName("IoT Workshop");

		Certificate certificate4 = new Certificate();
		certificate4.setCertificateName("Django Internship from IIT Delhi");

		// inserting the value of certificate1 in the set
		Set<Certificate> set1 = new HashSet<Certificate>();
		set1.add(certificate1);
		set1.add(certificate2);

		// inserting the value of certificate2 in the set
		Set<Certificate> set2 = new HashSet<Certificate>();
		set2.add(certficate3);
		set2.add(certificate4);

		// inserting details of employee1

		Employee emp1 = new Employee();
		emp1.setFirstname("Satyam");
		emp1.setLastname("Tripathi");
		emp1.setSalary(45000);

		// inserting details of employee2
		Employee emp2 = new Employee();
		emp2.setFirstname("Vivek");
		emp2.setLastname("Raj");
		emp2.setSalary(23000);

		// adding the values of employee table in the certificate name
		emp1.setCertificate(set1);
		emp2.setCertificate(set2);

		session.persist(emp1);
		session.persist(emp2);
		tx.commit();
		session.close();

	}

}
