package com.jspiders.springmvc3.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	public static void openConection() {
		 factory = Persistence.createEntityManagerFactory("student");
		 manager = factory.createEntityManager();
		 transaction = manager.getTransaction();
	}
	public static void colseConnection() {
		if (factory!=null) {
			factory.close();
		}
		if (manager!=null) {
			manager.close();
		}
		if (transaction!=null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("transaction is committed..");
			}
		}
	}
}

