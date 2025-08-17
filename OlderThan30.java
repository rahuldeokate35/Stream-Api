package Day1;

public class OlderThan30 {

	public static void main(String[] args) 
	{
		
		//       2. Filter Employees by Age:
		//       - Get a list of employees older than 30 years.

		
		
		EmployeeAdder emp = new EmployeeAdder();
		emp.addDetails().stream().filter(age->age.getAge()>30).forEach(System.out::println);
		

	}

}
