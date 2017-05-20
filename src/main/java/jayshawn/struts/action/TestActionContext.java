package jayshawn.struts.action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.dispatcher.Parameter;

import com.opensymphony.xwork2.ActionContext;

public class TestActionContext {
	public String execute(){
		System.out.println("change!");
		//ActionContext是Action的上下文对象,可以从中获取到Action所需要的一切信息.
		//context本身就是一个Map
		ActionContext context = ActionContext.getContext();
		
		//获取application
		Map<String, Object> applicationMap = (Map<String, Object>) context.get("application");
		applicationMap.put("applicationKey", "applicationValue");
		Date date = (Date) applicationMap.get("date");
		System.out.println(date);
		
		//获取session
		Map<String, Object> sessionMap = (Map<String, Object>) context.get("session");
		sessionMap.put("sessionKey", "sessionValue");
		
		//获取request
		Map<String, Object> requestMap = (Map<String, Object>) context.get("request");
		requestMap.put("requestKey", "requestValue");
		
		Map<String, Parameter> parameters = context.getParameters();
		System.out.println(parameters.get("name").isMultiple());
		
		
		return "success";
	}
}
