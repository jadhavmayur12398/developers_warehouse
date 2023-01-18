package com.jspiders.hibernate5bidirone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate5bidirone.dto.IpAddDTO;
import com.jspiders.hibernate5bidirone.dto.LaptopDTO;

public class LaptopIpAddDAO {
	
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
			
			LaptopDTO laptop = new LaptopDTO();
			laptop.setId(10);
			laptop.setCompany("hp");
			laptop.setPrice(1200);
			
			IpAddDTO ip = new IpAddDTO();
			ip.setId(10);
			
			ip.setLaptop(laptop);
			laptop.setIpaddress(ip);
			
			manager.persist(ip);
			manager.persist(laptop);
			
			transaction.commit();
			
		} finally {
			closeConnection();
		}
	}
}
