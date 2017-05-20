package jayshawn.struts.crud;

import java.util.Date;
import java.util.Map;
import java.util.Timer;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class EmployeeAction implements ModelDriven<Employee>, Preparable,RequestAware{
	
	private Employee employee;
	private Integer id;
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String add(){
		Dao.add(employee);
		return "add";
	}
	
	public void prepareAdd(){
		employee = new Employee();
	}
	
	public String delete(){
		Dao.delete(id);
		return "delete";
	}
	
	public String update(){
		Dao.update(employee);
		return "update";
	}
	public void prepareUpdate(){
		employee = new Employee();
	}
	
	public String edit(){
		return "edit";
	}
	
	public void prepareEdit(){
		employee = Dao.query(id);
	}
	
	public String list(){
		HttpServletRequest request2 = ServletActionContext.getRequest();
		System.out.println(request2.getParameter("name"));
		request.put("list", Dao.queryList());
		return "list";
	}
	
	@Override
	public void prepare() throws Exception {
	}

	@Override
	public Employee getModel() {
		return employee;
	}
	
	private Map<String, Object> request;
	
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

}
