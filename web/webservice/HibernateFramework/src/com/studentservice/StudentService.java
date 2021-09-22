package com.studentservice;
import java.util.Iterator;
import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hibernatestudentdemo.Student;
import com.hibernateutil.HibernateFrameworkUtil;
public class StudentService {
	static SessionFactory sessionfactoryobj = null;
	static Session sessionobj = null;	
	// method to create add student details in table bussiness logic	
	public Integer addStudent(String studentName, String address, String phoneNo) {		
		Transaction tx = null;
		Integer studentID = null;		
		try
		{
			sessionobj = HibernateFrameworkUtil.buildSessionFactory().openSession();
			tx = sessionobj.beginTransaction();
			
			Student student = new Student(studentName, address, phoneNo); // creating method of student class
			studentID = (Integer) sessionobj.save(student);
			
			tx.commit();// explicitly call the commit ensure that auto commit should be false			
	}
		catch(HibernateException e) {
			if(tx!=null) {
				tx.commit();
			}
			e.printStackTrace();
		} finally {
			sessionobj.close();
		}
		return studentID;
	}
           // GET REQUEST 

	public  void  ListAllEmployee() {	
	System.out.println(" *************from inside  ListAllEmployee()**********************  ");
	Transaction tx = null;
	try {

		sessionobj = HibernateFrameworkUtil.buildSessionFactory().openSession();
		tx = sessionobj.beginTransaction();
		
		// retrieve the record of students
		
		List students =  sessionobj.createQuery("From Student").list();
		
		Iterator iterator =  students.iterator();
		
		while(iterator.hasNext()) {
			Student student1 = (Student) iterator.next();
			System.out.println("studentName  " +student1.getStudentName());
			System.out.println("address" +student1.getAddress());
			System.out.println("phoneNo " +student1.getPhoneNo());	
			System.out.println("studentID" +student1.getId());
		}
	
		tx.commit();// explicitly call the commit ensure that auto commit should be false
	}
		catch(HibernateException e) {
		if (tx != null)
			tx.rollback();
		e.printStackTrace();
	} finally {
		sessionobj.close();
}
	}
	//update the values 
	
	public void updateStudentDetails(Integer studentId, String studentName) {
		System.out.println("Updating The Details by id");
		Transaction tx = null;
		
	try {
	
		sessionobj = HibernateFrameworkUtil.buildSessionFactory().openSession();
		tx = sessionobj.beginTransaction();
		
		//update logic
		Student student = (Student) sessionobj.get(Student.class, studentId);
		student.setStudentName(studentName);
		
		sessionobj.update(student);
		
		System.out.println("Updated Successfully");
		
		tx.commit();
}		
	
	catch(HibernateException e) {
		if(tx!=null)
		e.printStackTrace();
	}

	finally {
		sessionobj.close();
		}
	}	
	
		// delete the records

	public void deleteById(Integer studentId , String studentName) {
		
		System.out.println(" delete by Id  ");
		Transaction tx = null;
		try {

			sessionobj = HibernateFrameworkUtil.buildSessionFactory().openSession();
			tx = sessionobj.beginTransaction();
//update logic

			Student student = (Student) sessionobj.get(Student.class, studentId);

			student.setStudentName(studentName);;

			sessionobj.delete(student);// hibernate will form delete query automatically

			System.out.println("deleted sucessfully..."+student.getId());

			tx.commit();// explicitly call the commit ensure that auto commit should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionobj.close();
		}

	}

}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
