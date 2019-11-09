package com.lti;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="MyCar")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="Car_Type")
public class Car {
	@Id @GeneratedValue
	Integer id;
	String name;
	String company;
	String model;
	Integer year;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", company=" + company + ", model=" + model + ", year=" + year
				+ "]";
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(Integer id, String name, String company, String model, Integer year) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.model = model;
		this.year = year;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

}
