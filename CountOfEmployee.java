/*
 * //  32. Calculate the Total Number of Employees: 
//      - Determine the total count of employees.
 */

package Day3;

import Day1.EmployeeAdder;

public class CountOfEmployee {

	public static void main(String[] args) 
	{
		EmployeeAdder emp =new EmployeeAdder();
		
		int count=(int)emp.addDetails().stream().count();
		System.out.println("Total Employee is :"+count);
		

	}

}
