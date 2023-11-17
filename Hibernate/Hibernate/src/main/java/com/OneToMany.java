package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class OneToMany {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Customer.class)
				.addAnnotatedClass(CustomerDetails.class)
				.addAnnotatedClass(Orders.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
			
		Orders o1= new Orders(701,"dosa",10);
		Orders o2= new Orders(702,"idli",20);
		Orders o3= new Orders(703,"chapathi",30);
		
		Customer alex = session.get(Customer.class, 1);
		Customer bob = session.get(Customer.class, 2);
		
		
		o1.setCustomer(alex);
		o2.setCustomer(alex);
		o3.setCustomer(bob);
		
//		session.save(o1);
//		session.save(o2);
//		session.save(o3);
//		Customer customer = session.get(Customer.class, 2);
//		session.delete(customer);
		Orders orders = session.get(Orders.class, 702);
		session.delete(orders);
		t.commit();
		
		
		
	}
}
