package com.hcl.employeelist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Office {
public static void main (String[] args) {
	System.out.println ("---Sorting Employees---");
	List <Employee> listEmployees = new ArrayList <Employee> ();
	listEmployees.add(new Employee(123, " Bill", " Houston"));
	listEmployees.add(new Employee(456, " Samuel", " Dallas"));
	listEmployees.add(new Employee(789, " John", " San Antonio"));
	listEmployees.add(new Employee(102, " Alice", " Austin"));

	System.out.println("---Before sorting---");
	for (Employee emp : listEmployees) {
		System.out.println(emp);
	}

	System.out.println("\n---Afetr Sorting---");
	Collections.sort(listEmployees);
	System.out.println(listEmployees);
}
}
