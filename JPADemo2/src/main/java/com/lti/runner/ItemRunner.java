package com.lti.runner;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import com.lti.db.DatabaseConnector;
import com.lti.services.BookService;


public class ItemRunner {
		
		public static void main(String args[])
		{
			DatabaseConnector db=new DatabaseConnector();
			EntityManager em=db.getEntityManager();
			EntityTransaction tx=em.getTransaction();
			
			
			BookService service=new BookService(em);
			
			 tx.begin();
			 service.queryTypedWithWhereClause();
			 service.queryBookPosition(200,500);
			 service.queryBooksName(200,500);
			 service.queryBookWithPagination(2);
			
			 service.namedQueryBooks();
			 service. namedqueryBookWithPosition(500);
				
			 tx.commit();
			 
			 
			

		
			
		
			
			
		
			
		}
		
		

	}



