package com.lti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name="MyItem")
public class Item {
	
	@Id @GeneratedValue
	int id;
	String title;
	String description;
	int unitCost;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	



	
	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", description=" + description + ", unitCost=" + unitCost
				+ ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getDescription()=" + getDescription()
				+ ", getUnitCost()=" + getUnitCost() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}





	public Item(int id, String title, String description, int unitCost) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.unitCost = unitCost;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(int unitCost) {
		this.unitCost = unitCost;
	}

}
