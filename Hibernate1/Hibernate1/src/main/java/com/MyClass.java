package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MyClass {
	public static void main(String[] args) {
		Configuration cfg =new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		Student s1=new Student(1,"NITISH","NITISH@2002","KADAPA");
		Student s2=new Student(2,"VINAYAKA","VINAYAKA@2002","KANIPAKAM");
		Student s3=new Student(3,"SAI","SAI@2002","SHIRIDI");
		Student s4=new Student(4,"VIRAT","VIRAT@2002","DELHI");
		
//		session.save(s1);
//		session.save(s2);
//		session.save(s3);
//		session.save(s4);
		
		String up="update Student set address='CHENNAI' where id=1";
		Query query = session.createQuery(up);
		int rowsEffected = query.executeUpdate();
		System.out.println(rowsEffected);
		
		String del="delete FROM Student WHERE ID=3";
		Query query1=session.createQuery(del);
		int rowsEffected1 = query1.executeUpdate();
		System.out.println(rowsEffected1);
		
		Query query3 = session.createQuery("from Student");
		List list1 = query3.list();
		for(Object i:list1) {
			System.out.println(i);
		}
		t.commit();
	}
}
