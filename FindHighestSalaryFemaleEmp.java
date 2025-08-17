package Day2;

import java.util.Optional;
import java.util.stream.Collectors;

import Day1.EmployeeAdder;

public class FindHighestSalaryFemaleEmp {

	public static void main(String[] args) 
	{
		// 28. Find the Highest Salary Among Female Employees:
		// - Find the highest salary among female employees.
		
		EmployeeAdder emp = new EmployeeAdder();
		Optional max= emp.addDetails().stream().filter(s->s.getGender().equals("Female"))
		.collect(Collectors.maxBy((s1,s2)->{
			double d=s1.getSalary()-s2.getSalary();
			return (int) d;
			
		}));
		System.out.println(max);
		

	}

}
