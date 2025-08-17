package Day3;

import Day1.*;
public class Operation39 {

	public static void main(String[] args) {
	
		EmployeeAdder emp = new EmployeeAdder();
		emp.addDetails().stream().filter(e->e.getName().length()>1).forEach(System.out::println);
	}

}
