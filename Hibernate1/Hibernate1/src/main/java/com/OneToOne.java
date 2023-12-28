package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {
	public static void main(String[] args) {
		Configuration cfg= new Configuration().configure().addAnnotatedClass(Customer.class)
				.addAnnotatedClass(CustomerDetails.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t= session.beginTransaction();
		
//		Customer c1=new Customer(1,"NITISH",21);
//		Customer c2=new Customer(2,"VINAYAKA",22);
//		Customer c3=new Customer(3,"SAI",21);
//		Customer c4=new Customer(4,"VIRAT",21);
//		Customer c5=new Customer(5,"PANDYA",21);
//		
//		CustomerDetails cd1=new CustomerDetails(101,"NITISH@2002","CHENNAI");
//		CustomerDetails cd2=new CustomerDetails(102,"VINAYAKA@2002","KANIPAKAM");
//		CustomerDetails cd3=new CustomerDetails(103,"SAI@2002","SHIRIDI");
//		CustomerDetails cd4=new CustomerDetails(104,"VIRAT@2002","DELHI");
//		CustomerDetails cd5=new CustomerDetails(105,"PANDYA@2002","MUMBAI");
		
		
//		c1.setCustomerdetails(cd1);
//		c2.setCustomerdetails(cd2);
//		c3.setCustomerdetails(cd3);
//		c4.setCustomerdetails(cd4);
//		c5.setCustomerdetails(cd5);
		
	
		
//		session.save(c1);
//		session.save(c2);
//		session.save(c3);
//		session.save(c4);
//		session.save(c5);
		
		Customer customer = session.get(Customer.class, 2);
		System.out.println(customer);
		
		t.commit();
		
		
	}
}
