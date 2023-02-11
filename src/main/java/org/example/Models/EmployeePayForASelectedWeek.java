package org.example.Models;

import java.io.Serializable;
import java.util.Objects;

public class EmployeePayForASelectedWeek implements Serializable{
	private String lastName;
	private String firstName;
	private float payForTheWeek;
	public EmployeePayForASelectedWeek() {
		
		
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public float getPayForTheWeek() {
		return payForTheWeek;
	}
	public void setPayForTheWeek(float payForTheWeek) {
		this.payForTheWeek = payForTheWeek;
	}
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, payForTheWeek);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeePayForASelectedWeek other = (EmployeePayForASelectedWeek) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Float.floatToIntBits(payForTheWeek) == Float.floatToIntBits(other.payForTheWeek);
	}
	@Override
	public String toString() {
		return "EmployeePayForASelectedWeek [lastName=" + lastName + ", firstName=" + firstName + ", payForTheWeek="
				+ payForTheWeek + "]";
	}

}
