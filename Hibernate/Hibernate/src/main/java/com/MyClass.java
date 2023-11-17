package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MyClass {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Student s = new Student(1,"Nitish", 21);
		Student s1=new Student(2,"vinny",22);
		session.save(s);
//		session.save(s1);
//		Query query = session.createQuery("Update Student set age=16 where id=2");
//		int affected = query.executeUpdate();
//		System.out.println(affected);
//		String s = "from Student";
//		Query q = session.createQuery(s);
//		List list = q.list();
//		for(Object i : list) {
//			System.out.println(i);
//		}
//		Query q = session.createQuery("delete from Student where id = 1");
//		int r = q.executeUpdate();
//		System.out.println(r);
		transaction.commit();
		
	}
}
