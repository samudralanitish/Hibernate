package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class OneToMany {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Customer.class)
				.addAnnotatedClass(CustomerDetails.class)
				.addAnnotatedClass(Orders.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction t=session.beginTransaction();
		
		Orders o1=new Orders(501, "I Phone", 100000);
		Orders o2=new Orders(502, "MAC Book", 399999);
		Orders o3=new Orders(503, "Air Pods", 25000);
		Orders o4=new Orders(504, "Headset", 27000);
		Orders o5=new Orders(505, "Sony TV", 45000);
		
		Customer customer1 = session.get(Customer.class, 1);
		Customer customer2 = session.get(Customer.class, 2);
		Customer customer3 = session.get(Customer.class, 3);
		Customer customer4 = session.get(Customer.class, 4);
		Customer customer5 = session.get(Customer.class, 5);
		
		o1.setCustomer(customer1);
		o2.setCustomer(customer1);
		o3.setCustomer(customer2);
		o4.setCustomer(customer4);
		o5.setCustomer(customer5);
		
//		session.save(o1);
//		session.save(o2);
//		session.save(o3);
//		session.save(o4);
//		session.save(o5);
		
//		Orders orders = session.get(Orders.class, 503);
//		session.delete(orders);
		
		Customer customerDel = session.get(Customer.class,4);
		session.delete(customerDel);
		
		
		
		
	
		t.commit();
		
	}
	
}
