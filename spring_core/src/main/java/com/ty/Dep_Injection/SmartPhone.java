package com.ty.Dep_Injection;

public class SmartPhone {
	private String name;
	private String ram;
	private Sim s;
	
	
	public Sim getS() {
		return s;
	}
	public void setS(Sim s) {
		this.s = s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	
	
}
