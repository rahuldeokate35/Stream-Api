package Day1;

public class RetrieveEmployeeNames {

	public static void main(String[] args) 
	{
		
		
		// 4. Map Employee Names:
		// - Create a list of employee names (Strings).

		EmployeeAdder emp = new EmployeeAdder();
		emp.addDetails().stream().map((n)->n.getName()).forEach(System.out::println);

	}

}
