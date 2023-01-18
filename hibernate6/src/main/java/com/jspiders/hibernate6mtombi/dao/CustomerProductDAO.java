package com.jspiders.hibernate6mtombi.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate6mtombi.dto.CustomerDTO;
import com.jspiders.hibernate6mtombi.dto.ProductDTO;

public class CustomerProductDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("manytomany");
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
			
			CustomerDTO customer1 = new CustomerDTO();
			customer1.setId(10);
			customer1.setName("Virat");
			customer1.setContact(9876543210L);
			
			CustomerDTO customer2 = new CustomerDTO();
			customer2.setId(20);
			customer2.setName("Anushka");
			customer2.setContact(9876543211L);
			
			ProductDTO pro1 = new ProductDTO();
			pro1.setId(10);
			pro1.setName("BMW");
			pro1.setPrice(123.2);
			
			ProductDTO pro2 = new ProductDTO();
			pro2.setId(20);
			pro2.setName("Lipstik");
			pro2.setPrice(1234);
			
			List<ProductDTO> products = Arrays.asList(pro1, pro2);
			customer1.setProducts(products);
			customer2.setProducts(products);
			
			List<CustomerDTO> customers = Arrays.asList(customer1, customer2);
			pro1.setCustomers(customers);
			pro2.setCustomers(customers);
			
			manager.persist(pro1);
			manager.persist(pro2);
			manager.persist(customer1);
			manager.persist(customer2);
			
			transaction.commit();
		} finally {
			closeConnection();
		}
	}
}
