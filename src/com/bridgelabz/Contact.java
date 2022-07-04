package com.bridgelabz;

public class Contact {
	
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private int zip;
	private long phone;
	private String email;
	
	@Override
	
	public String toString()
	{
		return "First name is:"+firstname+"\nLastName is: "+lastname+"\nAddress is: "+address+"\nCity is: "+city+"\nZip is:"+zip+"\nPhone Number is:"
	+phone+"\nEmail is: "+email;
				 
	}

}
