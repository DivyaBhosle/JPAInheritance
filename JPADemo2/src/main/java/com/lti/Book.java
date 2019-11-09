package com.lti;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="MyBook")
@NamedQuery (name="PageNoQuery",query="select b from Book b where nbOfPage>500")
@NamedQuery (name="PageNoQueryWithPosition",query="select b from Book b where nbOfPage> ?1")
public class Book extends Item {

	int isbn;
	int nbOfPage;
	String publicationDate;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public Book() {
		super();
	
	}
	public Book(int isbn, int nbOfPage, String publicationDate) {
		super();
		this.isbn = isbn;
		this.nbOfPage = nbOfPage;
		this.publicationDate = publicationDate;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", nbOfPage=" + nbOfPage + ", publicationDate=" + publicationDate + ", id=" + id
				+ ", title=" + title + ", description=" + description + ", unitCost=" + unitCost + "]";
	}
	public int getNbOfPage() {
		return nbOfPage;
	}
	public void setNbOfPage(int nbOfPage) {
		this.nbOfPage = nbOfPage;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
}
