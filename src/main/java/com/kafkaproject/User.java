package com.kafkaproject;

public class User {
	
	private int id;
	private String Name;
	private String[] address;
	public int getId() {
	 return id;
	 
}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String[] getAddress() {
		return address;
	}
	public void setAddress(String[] address) {
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User(int id, String name, String[] address) {
		super();
		this.id = id;
		Name = name;
		this.address = address;
	}
	public User() {
		super();
	}
	}

	
	
