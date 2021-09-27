package com.hibernateannotationonetomany;

import java.util.ArrayList;
import java.util.List;

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

		// storing answer 1
		Answer answer1 = new Answer();
		answer1.setAnswername("Java Is A Platform Independwnt Language");
		answer1.setPostedby("Satyam");

		// storing answer 2
		Answer answer2 = new Answer();
		answer2.setAnswername("Java Is the most used language");
		answer2.setPostedby("Sahil");

		// storing answer 3
		Answer answer3 = new Answer();
		answer3.setAnswername("Fucntional Interface Have One Abstract Method");
		answer3.setPostedby("Vivek");

		// storing answer 4
		Answer answer4 = new Answer();
		answer4.setAnswername("Abstract Class Can not accessed without Using Inheritence");
		answer3.setPostedby("Himanshi");

		// adding the value in the list1
		List<Answer> list1 = new ArrayList<Answer>();
		list1.add(answer1);
		list1.add(answer2);

		// adding the value in the list2
		List<Answer> list2 = new ArrayList<Answer>();
		list2.add(answer3);
		list2.add(answer4);

		// Storing the questions 1
		Questions question1 = new Questions();
		question1.setQuestionname("What is Java");
		question1.setAnswer(list1);

		// storing question 2
		Questions question2 = new Questions();
		question2.setQuestionname("What is functional Interface");
		question2.setAnswer(list2);

		session.persist(question1);
		session.persist(question2);

		tx.commit();
		session.close();
		System.out.println("Success");

	}

}
