package Day2;

import java.util.stream.*;

import Day1.EmployeeAdder;

public class FindAveregeAge30AndYonger {

	public static void main(String[] args)
	{
		// 24. Find the Average Salary of Employees Aged 30 or Younger:
		// - Calculate the average salary of employees aged 30 or younger.

		EmployeeAdder emp = new EmployeeAdder();
		
        emp.addDetails().stream().collect(Collectors.groupingBy((s)->{
			int age=s.getAge();
			if(age<=30)
			{
				return "age<=30";
			}
			else
			{
				return "null";
			}
        },Collectors.averagingDouble(s->s.getSalary())))
       // .forEach((k,v)->System.out.println((k!="null" ? k +" Average is :"+v:" ")));
        .forEach((k,v)->System.out.println(k!="null" ? k +" Average is :"+v:" "));
	}

}
