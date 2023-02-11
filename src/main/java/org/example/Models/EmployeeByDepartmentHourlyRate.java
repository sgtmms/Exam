package org.example.Models;
import java.io.Serializable;
import java.util.Objects;
public class EmployeeByDepartmentHourlyRate implements Serializable {
	
	private String departmentName;
	private String lastName;
	private String firstName;
	private float hourlyRate; 
	
	public EmployeeByDepartmentHourlyRate() {
		// TODO Auto-generated constructor stub
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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
	public float getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(departmentName, firstName, hourlyRate, lastName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeByDepartmentHourlyRate other = (EmployeeByDepartmentHourlyRate) obj;
		return Objects.equals(departmentName, other.departmentName) && Objects.equals(firstName, other.firstName)
				&& Float.floatToIntBits(hourlyRate) == Float.floatToIntBits(other.hourlyRate)
				&& Objects.equals(lastName, other.lastName);
	}
	@Override
	public String toString() {
		return "EmployeeByDepartmentHourlyRate [departmentName=" + departmentName + ", lastName=" + lastName
				+ ", firstName=" + firstName + ", hourlyRate=" + hourlyRate + "]";
	}

}
