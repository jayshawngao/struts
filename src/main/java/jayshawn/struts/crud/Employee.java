package jayshawn.struts.crud;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Employee {
	
	private Integer id;
	private String name;
	private String email;
	
	public static Map<Integer, Employee> employees = new LinkedHashMap<>();
	
	static{
		employees.put(1001,new Employee(1001,"AA","AA@163.com"));
		employees.put(1002,new Employee(1002,"BB","BB@163.com"));
		employees.put(1003,new Employee(1003,"CC","CC@163.com"));
		employees.put(1004,new Employee(1004,"DD","DD@163.com"));
		employees.put(1005,new Employee(1005,"EE","EE@163.com"));
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	public Employee(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
}
