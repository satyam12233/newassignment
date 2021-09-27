package com.hibernateannotationsonetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Store {
	public static void main(String args[]) {

		StandardServiceRegistry serviceregistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(serviceregistry).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		// setting employee class values

		Employee emp = new Employee();
		emp.setName("Sahil");
		emp.setEmail("sahil@gmail,com");

		// setting address class values

		Address address1 = new Address();
		address1.setAdressline1("Ashok Vihar Phase 3 Gurgaon");
		address1.setCity("Gurgaon");
		address1.setState("Up");
		address1.setPincode(201310);
		address1.setCountry("India");

		// setting employee values into address class
		emp.setAddress(address1);

		session.persist(emp);

		tx.commit();
		session.close();
	}

}
