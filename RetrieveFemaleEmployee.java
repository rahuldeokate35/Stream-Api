package Day1;

public class RetrieveFemaleEmployee {

	public static void main(String[] args) 
	{
		// 1. Filter Employees by Gender:
		// - Retrieve a list of all female employees.

		
		EmployeeAdder a = new EmployeeAdder();
		a.addDetails().stream().filter(f->f.getGender().equals("Female")).forEach(System.out::println);
		
		

	}

}
