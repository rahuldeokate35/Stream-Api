package Day2;

import java.util.stream.Collector;
import java.util.stream.Collectors;

import Day1.EmployeeAdder;

public class DistinctAgeValues {

	public static void main(String[] args) 
	{
		// 20. Retrieve Distinct Age Values:
		// - Get a list of distinct ages of all employees.

		EmployeeAdder emp= new EmployeeAdder();
//		emp.addDetails().stream().collect(Collectors.)
//	
		//Incomplete
		emp.addDetails().stream().collect(Collectors.groupingBy(s->{
			return s.getName();
		},Collectors.groupingBy(v->v.getName()))).forEach((k,v)->System.out.println(k+"  "+v));
		
		System.out.println("-----------------------------------");
		
		int c=0;
		for(int i=0;i<emp.addDetails().size();i++)
		{
			c=0;
			for(int j=i+1;j<emp.addDetails().size();j++)
			{
				if(emp.addDetails().get(i).getAge()==emp.addDetails().get(j).getAge())
				{
					c++;
				}
			}
			if(c==0)
			{
				System.out.println(emp.addDetails().get(i).getAge()+"  "+ emp.addDetails().get(i).getName());
			}
		}
	}

}
