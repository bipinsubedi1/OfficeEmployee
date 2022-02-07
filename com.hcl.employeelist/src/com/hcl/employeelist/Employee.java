package com.hcl.employeelist;


public class Employee implements Comparable <Employee>{
	private int employeeID;
	private String employeeName;
	private String employeeCity;

	public Employee(int employeeID, String employeeName, String employeeCity) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeCity() {
		return employeeCity;
	}

	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		int compare = employeeName.compareTo(o.employeeName);
		if (compare == 0) {
			compare = Integer.compare(employeeID, o.employeeID);
		}
		return compare;
	}

	public String toString() {
		return ' ' + employeeID + ' ' + employeeName + ' ' + employeeCity + "\n";
	}
}
