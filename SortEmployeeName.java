package Day1;

public class SortEmployeeName {

	public static void main(String[] args)
	{
		
		// 10. Sort Employees by Name:
		// - Sort the employees by their names in alphabetical order.

		EmployeeAdder emp = new EmployeeAdder();
		emp.addDetails().stream()
		.sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(System.out::println);
		System.out.println("-------------------------------------");
		String temp=null;
		for(int i=0;i<emp.addDetails().size();i++)
		{
			for(int j=i+1;j<emp.addDetails().size();j++)
			{
				if(emp.addDetails().get(i).getName().compareTo(emp.addDetails().get(j).getName())>0)
                 {
					temp = emp.addDetails().get(i).getName();
		            emp.addDetails().get(i).setName(emp.addDetails().get(j).getName());
		            emp.addDetails().get(j).setName(temp);
                 }
                 
			}
			
		}
        for(int i=0;i<emp.addDetails().size();i++)
        {
        	System.out.println(emp.addDetails().get(i));
        }
	}

}
