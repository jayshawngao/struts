package jayshawn.struts.validation;

import com.opensymphony.xwork2.ActionSupport;

public class ValidationAction extends ActionSupport{

	private int age;
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String execute(){
		
		return "success";
	}
}
