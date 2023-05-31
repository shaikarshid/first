package com.vehicle1.vehicle1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String vName;
	private String vColor;
	private int vNum;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public String getvColor() {
		return vColor;
	}
	public void setvColor(String vColor) {
		this.vColor = vColor;
	}
	public int getvNum() {
		return vNum;
	}
	public void setvNum(int vNum) {
		this.vNum = vNum;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vName=" + vName + ", vColor=" + vColor + ", vNum=" + vNum + "]";
	}
	public Vehicle(int id, String vName, String vColor, int vNum) {
		super();
		this.id = id;
		this.vName = vName;
		this.vColor = vColor;
		this.vNum = vNum;
	}
	public Vehicle() {
		super();
		
	}
	
	

}
