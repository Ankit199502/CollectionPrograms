import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeLambda {
	
	public static void main(String args[])
	{
		List<Employee> emplist=new ArrayList<>();
		
		
		emplist.add(new Employee("Raj","CSE",60000));
		emplist.add(new Employee("Kamya","CSE",60000));
		emplist.add(new Employee("Pratibha","CSE",60000));
		emplist.add(new Employee("Vishu","CSE",60000));
		emplist.add(new Employee("Alex","CSE",60000));
		emplist.add(new Employee("Santosh","CSE",60000));
		
		LambdaComparatorEx.sortInOldWay(emplist);
        LambdaComparatorEx.sortInLambdaWay(emplist);
	
	}
	
}

