package com.cg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entities.Author;
import com.cg.entities.Book;

public class TestApp
 {
	public static void main(String[] args) 
         {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Assign2");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Author auth1=new Author(351, "Jai");
		Author auth2=new Author(352,"Ramesh");
		Book b=new Book(451,"Exploring with c++",532,"C++",5000);
		entityManager.getTransaction().begin();
		entityManager.persist(auth1);
		entityManager.persist(auth2);
		entityManager.persist(b);
		entityManager.getTransaction().commit();
		System.out.println("Data Saved");
		entityManagerFactory.close();
		
	 }

}
