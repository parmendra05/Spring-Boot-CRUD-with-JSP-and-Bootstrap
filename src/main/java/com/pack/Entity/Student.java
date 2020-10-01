package com.pack.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer reg_no;
	private Integer roll; 
	private String name;
	private String city;
	private String email;
	
	public Student(){}

	
	public Integer getReg_no() {
		return reg_no;
	}


	public void setReg_no(Integer reg_no) {
		this.reg_no = reg_no;
	}


	public String getName() {
		return name;
	}

	public Integer getRoll() {
		return roll;
	}


	public void setRoll(Integer roll) {
		this.roll = roll;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Student [reg_no=" + reg_no + ", roll=" + roll + ", name=" + name + ", city=" + city + ", email=" + email
				+ "]";
	}

	
	
	
}
