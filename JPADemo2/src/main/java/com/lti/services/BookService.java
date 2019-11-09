package com.lti.services;


	import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.lti.Book;
import com.lti.CD;

	public class BookService {
		
	private static final String TypedQuery = null;
	EntityManager em;
		
		public BookService(EntityManager em)
		{
			this.em=em;
		}
		
		
		
		public void queryBooks(){
			Query query=em.createQuery("select b from Book b");
			List list=query.getResultList();
			
			for(Object o:list)
			{
				Book b=(Book)o;
				System.out.println("\n\n------\n"+b);
			}
		}
			public void queryTypedBooks()
			{
				String q="Select b from Book b";
				javax.persistence.TypedQuery<Book> query=em.createQuery(q,Book.class);
				List<Book> l=query.getResultList();
				
				for(Book b:l)
				{
					System.out.println("\n\n----------"+b);
				}
			}
			
			public void queryTypedWithWhereClause()
			{
				System.out.println("\n\n--Done with where clause");
				String q="Select b from Book b where b.unitCost>100 AND b.nbOfPage>200";
				javax.persistence.TypedQuery<Book> query=em.createQuery(q,Book.class);
				List<Book> l=query.getResultList();
				
				for(Book b:l)
				{
					System.out.println("\n\n----------"+b);
				}
			}
			
			public void queryBookPosition(Integer unitCost,Integer nbOfPage)
			{

				
				System.out.println("\n\n--Done with where clause with parameters");
				String q="Select b from Book b where b.unitCost> ?1 AND b.nbOfPage> ?2";
				javax.persistence.TypedQuery<Book> query=em.createQuery(q,Book.class);
				
				query.setParameter(1,unitCost);
				query.setParameter(2, nbOfPage);
				List<Book> l=query.getResultList();
				
				
				for(Book b:l)
				{
					System.out.println("\n\n----------"+b);
				}
			}
			
			public void queryBooksName(Integer unitCost, Integer nbOfPage)
			{
				System.out.println("\n\n--Done with where clause with named parameters");
				String q="Select b from Book b where b.unitCost> :cost AND b.nbOfPage> :pages";
				javax.persistence.TypedQuery<Book> query=em.createQuery(q,Book.class);
				
				query.setParameter("cost",unitCost);
				query.setParameter("pages",nbOfPage);
				List<Book> l=query.getResultList();
				
				
				for(Book b:l)
				{
					System.out.println("\n\n----------"+b);
				}
			}
			
			public void queryBookWithPagination(int noOfRecords)
			{
				System.out.println("\n\n--Query with pagination");
				String q="Select b from Book b";
				javax.persistence.TypedQuery<Book> query=em.createQuery(q,Book.class);
				
				query.setMaxResults(noOfRecords);
				
				List<Book> l=query.getResultList();
				
				
				for(Book b:l)
				{
					System.out.println("\n\n----------"+b);
				}
			}
			public void namedQueryBooks(){
				System.out.println("\n\n--------Named Query");
				javax.persistence.TypedQuery<Book> query=em.createNamedQuery("PageNoQuery",Book.class);
				List<Book> l=query.getResultList();
				
				for(Book b:l)
				{
					System.out.println("\n\n----------"+b);
				}
				
				
			}
			public void namedqueryBookWithPosition(Integer nbOfPage)
			{
				System.out.println("\n\n--Named Query with position");
				
				javax.persistence.TypedQuery<Book> query=em.createNamedQuery("PageNoQueryWithPosition",Book.class);
				
				query.setParameter(1,nbOfPage);
				
				List<Book> l=query.getResultList();
				
				
				for(Book b:l)
				{
					System.out.println("\n\n----------"+b);
				}
			
		

			}
	}
