package com.examples.immutable.demo;


import java.util.Date;

public final class Employee {
	private String name;
	private Date dateOfBirth;
	
	private Employee(String name, Date dateOfBirth) {
		this.name=name;
		this.dateOfBirth=new Date(dateOfBirth.getTime());
	}
	
	public static Employee newInstance(String name, Date dateOfBirth){
		
		return new Employee(name,dateOfBirth);
	}

	public String getName() {
		return name;
	}

	public Date getDateOfBirth() {
		return new Date(dateOfBirth.getTime());
	}
	
	@Override
	public String toString() {
		return name +" "+(dateOfBirth.getDate()+"/"+dateOfBirth.getMonth()+"/"+dateOfBirth.getYear()); 
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employee other = (Employee) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
