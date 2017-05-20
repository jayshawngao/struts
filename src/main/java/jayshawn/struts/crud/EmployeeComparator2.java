package jayshawn.struts.crud;

import java.util.Comparator;

public class EmployeeComparator2 implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getId().compareTo(o2.getId());
	}
	
}
