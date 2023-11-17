package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Customer.class)
				.addAnnotatedClass(CustomerDetails.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		Customer c1=new Customer(1,"alex");
		Customer c2=new Customer(2,"bob");
		Customer c3=new Customer(3,"spongebob");
		
		CustomerDetails cd1=new CustomerDetails(101, "alex@gmail.com", 998877);
		CustomerDetails cd2=new CustomerDetails(102, "bob@gmail.com", 123456);
		CustomerDetails cd3=new CustomerDetails(103, "spongebob@gmail.com", 985670);
		
		
		c1.setCustomerDetails(cd1);
		c2.setCustomerDetails(cd2);
		c3.setCustomerDetails(cd3);
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		
//		Customer customer = session.get(Customer.class, 1);
//		System.out.println(customer);
//		CustomerDetails customerDetails = customer.getCustomerDetails();
//		System.out.println(customerDetails);
		
//		CustomerDetails customerDetails = session.get(CustomerDetails.class, 101);
//		System.out.println(customerDetails);
//		Customer customer = customerDetails.getCustomer();
//		System.out.println(customer);
//		
		t.commit();
		
		
	}
}
