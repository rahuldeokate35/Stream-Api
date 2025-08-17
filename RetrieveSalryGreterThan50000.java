package Day1;

public class RetrieveSalryGreterThan50000 {

	public static void main(String[] args)
	{
		
		// 3. Filter Employees by Salary:
		// - Find employees with a salary greater than $50,000.

		
		
		new EmployeeAdder().addDetails().stream().filter(sal->sal.getSalary()>50000).forEach(System.out::println);
		

	}

}
