package com.hibernateannotationsonetoone;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Fetch {
	public static void main(String args[]) {

		StandardServiceRegistry serviceregistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(serviceregistry).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		TypedQuery query = session.createQuery("from Employee e");
		List<Employee> listInfo = query.getResultList();

		// fetching the values
		Iterator<Employee> itr = listInfo.iterator();
		while (itr.hasNext()) {
			Employee emp1 = itr.next();
			System.out.println(emp1.getEmployeeid() + "" + emp1.getName() + "" + emp1.getEmail());

			Address add1 = emp1.getAddress();
			System.out.println(add1.getAdressline1() + "" + add1.getCity() + "" + add1.getState() + ""
					+ add1.getCountry() + "" + add1.getPincode());
		}
		session.close();
		System.out.println("Success");
	}

}
