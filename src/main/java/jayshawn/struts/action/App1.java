package jayshawn.struts.action;

public class App1 {
	public String add(){
		System.out.println("add...");
		return "success-add";
	}
	public String update(){
		System.out.println("update...");
		return "success-update";
	}
	public String delete(){
		System.out.println("^^delete...");
		return "success-delete";
	}
	public String query(){
		System.out.println("query...");
		return "success-query";
	}
}
