package org.example.Models;

import java.io.Serializable;
import java.util.Objects;

public class DepartmentPayForASelectedWeek implements Serializable{
	
	private String departmentName;
	private float payForTheWeek; 
	public DepartmentPayForASelectedWeek() {
		
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public float getPayForTheWeek() {
		return payForTheWeek;
	}
	public void setPayForTheWeek(float payForTheWeek) {
		this.payForTheWeek = payForTheWeek;
	}

	@Override
	public int hashCode() {
		return Objects.hash(departmentName, payForTheWeek);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartmentPayForASelectedWeek other = (DepartmentPayForASelectedWeek) obj;
		return Objects.equals(departmentName, other.departmentName)
				&& Float.floatToIntBits(payForTheWeek) == Float.floatToIntBits(other.payForTheWeek);
	}

	@Override
	public String toString() {
		return "DepartmentPayForASelectedWeek [departmentName=" + departmentName + ", payForTheWeek=" + payForTheWeek
				+ "]";
	}

}
