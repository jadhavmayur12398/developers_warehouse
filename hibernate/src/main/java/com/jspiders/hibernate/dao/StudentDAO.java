package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate.dto.StudentDTO;

public class StudentDAO {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		
		StudentDTO student = new StudentDTO();
		
		student.setId(50);
		student.setName("Dhanajay");
		student.setEmail("dhananjay@qspiders.com");
//		student.setContact(9876543210L);
		student.setCity("pune");
		student.setAddress("dange chowk");
		
		
		entityManager.persist(student);
		entityTransaction.commit();
		
		entityManagerFactory.close();
		entityManager.close();
		
		try {
			entityTransaction.rollback();
		} catch (TransactionException e) {
			System.out.println("transaction is commited..!");
		}
	}
}
