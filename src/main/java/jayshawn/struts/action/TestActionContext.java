package jayshawn.struts.action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.dispatcher.Parameter;

import com.opensymphony.xwork2.ActionContext;

public class TestActionContext {
	public String execute(){
		System.out.println("change!");
		//ActionContext��Action�������Ķ���,���Դ��л�ȡ��Action����Ҫ��һ����Ϣ.
		//context�������һ��Map
		ActionContext context = ActionContext.getContext();
		
		//��ȡapplication
		Map<String, Object> applicationMap = (Map<String, Object>) context.get("application");
		applicationMap.put("applicationKey", "applicationValue");
		Date date = (Date) applicationMap.get("date");
		System.out.println(date);
		
		//��ȡsession
		Map<String, Object> sessionMap = (Map<String, Object>) context.get("session");
		sessionMap.put("sessionKey", "sessionValue");
		
		//��ȡrequest
		Map<String, Object> requestMap = (Map<String, Object>) context.get("request");
		requestMap.put("requestKey", "requestValue");
		
		Map<String, Parameter> parameters = context.getParameters();
		System.out.println(parameters.get("name").isMultiple());
		
		
		return "success";
	}
}
