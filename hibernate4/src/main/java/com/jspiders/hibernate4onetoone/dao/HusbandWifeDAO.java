package com.jspiders.hibernate4onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate4onetoone.dto.HusbandDTO;
import com.jspiders.hibernate4onetoone.dto.WifeDTO;

public class HusbandWifeDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("onetoone");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	private static void closeConnection() {
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
				System.out.println("transaction is commited......");
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			WifeDTO wife = new WifeDTO();
			wife.setId(10);
			wife.setName("anushka");
			wife.setEmail("anushka@bollywod.com");
			wife.setContact(9876543210L);
			
			manager.persist(wife);
			
			HusbandDTO husband = new HusbandDTO();
			husband.setId(10);
			husband.setName("virat");
			husband.setEmail("virat@bcci.com");
			husband.setContact(9876543211L);
			husband.setWife(wife);
			manager.persist(husband);
			
			transaction.commit();
			
		} finally {
			closeConnection();
		}
	}
}
