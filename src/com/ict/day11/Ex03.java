package com.ict.day11;

public class Ex03 {
	
	private String name;
	private boolean live;      
	private int age ;	
	
	public Ex03() {
		name = "큰뿔소";
		age = 3;
		live = true;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}