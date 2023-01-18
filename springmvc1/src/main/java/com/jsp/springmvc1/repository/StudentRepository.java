package com.jsp.springmvc1.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jsp.springmvc1.pojo.StudentPOJO;

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
	public StudentPOJO login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	public StudentPOJO add(String name, String email, long contact, String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	public StudentPOJO search(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<StudentPOJO> searchAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public StudentPOJO remove(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
