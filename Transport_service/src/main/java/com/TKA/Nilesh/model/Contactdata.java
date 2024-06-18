package com.TKA.Nilesh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contactdata {
	
    private String yourname;
    @Id
    private String phonenumber;
    private String email;
    private String message;
	public Contactdata() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contactdata(String yourname, String phonenumber, String email, String message) {
		super();
		this.yourname = yourname;
		this.phonenumber = phonenumber;
		this.email = email;
		this.message = message;
	}
	public String getYourname() {
		return yourname;
	}
	public void setYourname(String yourname) {
		this.yourname = yourname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Contactdata [yourname=" + yourname + ", phonenumber=" + phonenumber + ", email=" + email + ", message="
				+ message + "]";
	}
    
    
    
}
