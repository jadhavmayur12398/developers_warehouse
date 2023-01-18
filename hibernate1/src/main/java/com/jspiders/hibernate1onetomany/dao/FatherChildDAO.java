package com.jspiders.hibernate1onetomany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate1onetomany.dto.ChildDTO;
import com.jspiders.hibernate1onetomany.dto.FatherDTO;

public class FatherChildDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("onetomany");
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
				System.out.println("transaction is commited.....");
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			FatherDTO father = new FatherDTO();
			father.setId(101);
			father.setName("tukaram");
			father.setAge(55);
			
			ChildDTO child1 = new ChildDTO();
			child1.setId(111);
			child1.setName("ABC");
			child1.setAge(25);
			
			manager.persist(child1);
			
			ChildDTO child2 = new ChildDTO();
			child2.setId(211);
			child2.setName("PQR");
			child2.setAge(21);
			
			manager.persist(child2);
			
			ChildDTO child3 = new ChildDTO();
			child3.setId(311);
			child3.setName("XYZ");
			child3.setAge(18);
			
			manager.persist(child3);
			
			List<ChildDTO> children = Arrays.asList(child1, child2, child3);
			father.setChildren(children);
			manager.persist(father);
			transaction.commit();
		} finally {
			closeConnection();
		}
	}
}
