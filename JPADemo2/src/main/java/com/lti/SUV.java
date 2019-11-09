package com.lti;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("mySUV")
public class SUV extends Car{
	
	int towingapacity;
	double thirdrowSeating;
	public int getTowingapacity() {
		return towingapacity;
	}
	public void setTowingapacity(int towingapacity) {
		this.towingapacity = towingapacity;
	}
	public double getThirdrowSeating() {
		return thirdrowSeating;
	}
	public void setThirdrowSeating(double thirdrowSeating) {
		this.thirdrowSeating = thirdrowSeating;
	}
	@Override
	public String toString() {
		return "SUV [towingapacity=" + towingapacity + ", thirdrowSeating=" + thirdrowSeating + "]";
	}
	public SUV(int towingapacity, double thirdrowSeating) {
		super();
		this.towingapacity = towingapacity;
		this.thirdrowSeating = thirdrowSeating;
	}
	public SUV() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SUV(Integer id, String name, String company, String model, Integer year) {
		super(id, name, company, model, year);
		// TODO Auto-generated constructor stub
	}
	

}
