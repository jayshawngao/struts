package jayshawn.struts.resubmit;

import com.opensymphony.xwork2.ActionSupport;

public class ResubmitAction extends ActionSupport {
	/**
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/
	
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception{
		Thread.sleep(2000);
		System.out.println("execute()...");
		return SUCCESS;
	}
}
