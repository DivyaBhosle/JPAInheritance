package com.lti;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
//@DiscriminatorValue("myMUV")
public class MUV extends Car {
	
	int horsePower;
	String buildType;
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public String getBuildType() {
		return buildType;
	}
	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}
	public MUV(int horsePower, String buildType) {
		super();
		this.horsePower = horsePower;
		this.buildType = buildType;
	}
	public MUV() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MUV [horsePower=" + horsePower + ", buildType=" + buildType + "]";
	}
	

}
