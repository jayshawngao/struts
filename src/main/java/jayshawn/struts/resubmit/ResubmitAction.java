package jayshawn.struts.resubmit;

import com.opensymphony.xwork2.ActionSupport;

public class ResubmitAction extends ActionSupport {
	/**
	* @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô)
	*/
	
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception{
		Thread.sleep(2000);
		System.out.println("execute()...");
		return SUCCESS;
	}
}
