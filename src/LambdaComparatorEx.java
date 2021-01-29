import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class LambdaComparatorEx {

	public static void sortInOldWay(List<Employee> empList) {
		 
        Collections.sort( empList, new Comparator<Employee>() {
 
            @Override
            public int compare(Employee emp1, Employee emp2) {
 
                return emp1.getSalary().compareTo(emp2.getSalary());
            }
        } );
 
        // print the list using forEach method
        System.out.println("<--- Sorted list with anonomus inner class implementation --->");
        empList.forEach(emp->System.out.println(emp.toString()));
    }
 
    public static void sortInLambdaWay(List<Employee> empList) {
 
        Collections.sort(empList, (Employee e1, Employee e2) -> e2.getSalary().compareTo(e1.getSalary()));
 
        System.out.println("\n\n<--- Sorted list with Lambda - DESC order --->");
        empList.forEach(emp->System.out.println(emp.toString()));
 
        Collections.sort(empList, (Employee e1, Employee e2) -> e1.getSalary().compareTo(e2.getSalary()));
 
        System.out.println("\n\n<--- Sorted list with Lambda - ASC order --->");
        empList.forEach(emp->System.out.println(emp.toString()));
    }
}
