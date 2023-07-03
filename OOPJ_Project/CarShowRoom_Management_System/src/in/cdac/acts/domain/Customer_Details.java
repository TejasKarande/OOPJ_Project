package in.cdac.acts.domain;

import java.util.Comparator;
import java.util.*;
import java.util.Objects;

public  class Customer_Details implements Comparable<Customer_Details>{
	
	private String name;
	private String contact_number;
	private String email_id;
	private String pan_id;
	
	public Customer_Details(){
		
	}
	
	
	public Customer_Details(String name, String contact_number, String email_id, String pan_id) {
		this.name = name;
		this.contact_number = contact_number;
		this.email_id = email_id;
		this.pan_id = pan_id;
	}



	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	} 
	public String getPan_id() {
		return pan_id;
	}
	public void setPan_id(String pan_id) {
		this.pan_id = pan_id;
	}
	
	


@Override
public int compareTo(Customer_Details other) {
		return this.getPan_id().compareTo(other.getPan_id());
}



	@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((pan_id == null) ? 0 : pan_id.hashCode());
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer_Details other = (Customer_Details) obj;
	if (pan_id == null) {
		if (other.pan_id != null)
			return false;
	} else if (!pan_id.equals(other.pan_id))
		return false;
	return true;
}


	@Override
	public String toString() {
		return String.format("%-20s%-20s%-30s%-20s",this.name,this.contact_number,this.email_id,this.pan_id);
	}



	

}
