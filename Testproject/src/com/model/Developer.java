package com.model;

public class Developer {

	String name;
	int age;
	int phone;
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Developer(String name, int age, int phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Developer [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	
}
