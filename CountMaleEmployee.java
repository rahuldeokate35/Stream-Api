package Day1;

import java.util.OptionalInt;

public class CountMaleEmployee {

	public static void main(String[] args) 
	{
		
		
		// 8. Count Male Employees:
		// - Count the number of male employees.

		EmployeeAdder emp = new EmployeeAdder();
		long count =emp.addDetails().stream().filter(m->m.getGender().equals("Male")).count();
		
       System.out.println("Male Employee Count is :"+count);
	}

}
