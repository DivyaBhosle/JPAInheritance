package com.lti;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("mySPORTScAR")
public class SportsCar extends Car{
	

	Integer topSpeed;
	double zerotosixty;
	public Integer getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}
	public double getZerotosixty() {
		return zerotosixty;
	}
	public void setZerotosixty(double zerotosixty) {
		this.zerotosixty = zerotosixty;
	}
	public SportsCar(Integer topSpeed, double zerotosixty) {
		super();
		this.topSpeed = topSpeed;
		this.zerotosixty = zerotosixty;
	}
	public SportsCar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SportsCar(Integer id, String name, String company, String model, Integer year) {
		super(id, name, company, model, year);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SportsCar [topSpeed=" + topSpeed + ", zerotosixty=" + zerotosixty + "]";
	}
	
	
}
