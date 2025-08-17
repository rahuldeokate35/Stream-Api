package Day3;

import java.util.stream.Collectors;

import Day1.EmployeeAdder;

public class FindAge30_40AndSal50_60 {

	public static void main(String[] args)
	{
		// 31. Find the Names of Employees Aged 30-40 with Salaries Between $50,000 and $60,000:
		// - Retrieve the names of employees aged 30-40 with salaries between $50,000 and $60,000.
		
        EmployeeAdder emp= new EmployeeAdder();
        emp.addDetails().stream().collect(Collectors.groupingBy(s->{
        	int age= s.getAge();
        	double sal=s.getSalary();
        	if(age>=30 && age <=40 && sal >=50000 && sal<=60000)
        	{
        		return "Age 30-40 And Salary $50000-$60000";
        	}
        	else
        	{
        		return "null";
        	}
        })).forEach((k,v)->System.out.println(k!="null"?k+" "+v:" "));
	}

}
