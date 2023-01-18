package com.jspiders.hibernate3manytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate3manytoone.dto.CompanyDTO;
import com.jspiders.hibernate3manytoone.dto.EmployeeDTO;

public class EmployeeCompanyDAO {
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
			
			CompanyDTO company = new CompanyDTO();
			company.setRegNo(1);
			company.setName("jspiders");
			company.setLocation("pune");
			
			EmployeeDTO emp1 = new EmployeeDTO();
			emp1.setId(1);
			emp1.setName("Abc");
			emp1.setSalary(420.20);
			
			EmployeeDTO emp2 = new EmployeeDTO();
			emp2.setId(2);
			emp2.setName("Pqr");
			emp2.setSalary(150.00);
			
			EmployeeDTO emp3 = new EmployeeDTO();
			emp3.setId(3);
			emp3.setName("Xyz");
			emp3.setSalary(12.32);
			
			emp1.setCompany(company);
			emp2.setCompany(company);
			emp3.setCompany(company);
			
			manager.persist(emp1);
			manager.persist(emp2);
			manager.persist(emp3);
			manager.persist(company);
			
			transaction.commit();		
		} finally {
			closeConnection();
		}
	}
}
