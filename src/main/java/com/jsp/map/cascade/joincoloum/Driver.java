package com.jsp.map.cascade.joincoloum;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("bhushan");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		College college=new College();
		college.setName("Union_Bank");
		

		Fild fild1= new Fild();
		fild1.setFild_name("IT");
		fild1.setNo_of_Students(40);
		
		Fild fild2= new Fild();
		fild2.setFild_name("Mech");
		fild2.setNo_of_Students(100);
		
		Fild fild3= new Fild();
		fild3.setFild_name("Civil");
		fild3.setNo_of_Students(80);
		
		ArrayList<Fild> fild=new ArrayList<Fild>();
		fild.add(fild1);
		fild.add(fild2);
		fild.add(fild3);
		
		college.setFild(fild);
		
		fild1.setCollege(college);
		fild2.setCollege(college);
		fild3.setCollege(college);
		
		entityTransaction.begin();
		entityManager.persist(college);
		entityTransaction.commit();
		
	}

}
