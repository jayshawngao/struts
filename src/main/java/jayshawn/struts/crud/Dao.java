package jayshawn.struts.crud;

import java.util.ArrayList;
import java.util.List;

public class Dao {
	
	public static List<Employee> queryList(){
		return new ArrayList<>(Employee.employees.values());
	}
	
	public static Employee query(Integer id){
		return Employee.employees.get(id);
	}
	public static void delete(Integer id){
		Employee.employees.remove(id);
	}
	public static void update(Employee employee){
		Employee.employees.put(employee.getId(), employee);
	}
	public static void add(Employee employee){
		long id = System.currentTimeMillis();
		employee.setId(Math.abs((int) id));
		Employee.employees.put(employee.getId(), employee);
	}
	
}
