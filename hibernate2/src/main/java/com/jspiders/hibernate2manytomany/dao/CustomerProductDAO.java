package com.jspiders.hibernate2manytomany.dao;

import java.util.Arrays;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate2manytomany.dto.CustomerDTO;
import com.jspiders.hibernate2manytomany.dto.ProductDTO;

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
				System.out.println("transaction is commited.....");
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			CustomerDTO customer1 = new CustomerDTO();
			customer1.setId(11);
			customer1.setName("udhishthir");
			customer1.setEmail("udhishthir@mahabharat.com");
			customer1.setContact(9876543219L);
			
			CustomerDTO customer2 = new CustomerDTO();
			customer2.setId(21);
			customer2.setName("bhim");
			customer2.setEmail("bhim@mahabharat.com");
			customer2.setContact(9876543211L);
			
			CustomerDTO customer3 = new CustomerDTO();
			customer3.setId(31);
			customer3.setName("arjun");
			customer3.setEmail("arjun@mahabharat.com");
			customer3.setContact(9876543337L);
			
			ProductDTO product1 = new ProductDTO();
			product1.setId(11);
			product1.setName("bhala");
			product1.setPrice(11);
			product1.setCatagory("weapon");
			
			ProductDTO product2 = new ProductDTO();
			product2.setId(21);
			product2.setName("gadha");
			product2.setPrice(11);
			product2.setCatagory("weapon");
			
			ProductDTO product3 = new ProductDTO();
			product3.setId(31);
			product3.setName("dhanushyaban");
			product3.setPrice(12);
			product3.setCatagory("weapon");
			
			List<ProductDTO> products = Arrays.asList(product1, product2, product3);
			
			customer1.setProducts(products);
			customer2.setProducts(products);
			customer3.setProducts(products);
			
			manager.persist(product1);
			manager.persist(product2);
			manager.persist(product3);
			
			manager.persist(customer1);
			manager.persist(customer2);
			manager.persist(customer3);
			
			transaction.commit();
								
		} finally {
			closeConnection();
		}
	}
}
