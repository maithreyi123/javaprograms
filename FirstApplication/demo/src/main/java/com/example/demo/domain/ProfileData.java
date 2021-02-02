package com.example.demo.domain;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ProfileData {
	@Id
	private String name;
	private int id;
	private String age;
	private String address;
	
	// if we r not providing any constructor,then compiler will generate a default constuctor
	// if we r providing a constructor, then compiler won't provide default constructor
	//this is default constructor with super()
	public ProfileData() {
		super();  // super() is no-arg call to main/super class constructor
		
	}
	
	//super : used to call super class constructor
	//this : used to call current class constructor/object

	@Override
	public String toString() {
		return "ProfileData [name=" + name + ", id=" + id + ", age=" + age + ", address=" + address + "]";
	}

	public ProfileData(String name, int id, String age, String address) {
		super();  // indicates main class constructor
		this.name = name;
		this.id = id;  //this indicates current class constructor
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
}
