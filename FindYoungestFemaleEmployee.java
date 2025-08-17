package Day2;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import Day1.Employee;
import Day1.EmployeeAdder;

public class FindYoungestFemaleEmployee {

	public static void main(String[] args) 
	{
		EmployeeAdder emp = new EmployeeAdder();
		Object e=emp.addDetails().stream().filter(s->s.getGender().equals("Female"))
		.collect(Collectors.minBy((s1,s2)->s1.getAge()-s2.getAge()));
		System.out.println(e);
	}

}
