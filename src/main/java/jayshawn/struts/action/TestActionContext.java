package jayshawn.struts.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.Parameter;

import com.opensymphony.xwork2.ActionContext;

public class TestActionContext {
	public String execute(){
		Date date = new Date();
		
		List<String> list = new ArrayList<>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		String[] array = new String[]{"AA","BB","CC"};
		
		//ActionContext��Action�������Ķ���,���Դ��л�ȡ��Action����Ҫ��һ����Ϣ.
		//context�������һ��Map
		ActionContext context = ActionContext.getContext();
		
		//��ȡapplication
		Map<String, Object> applicationMap = context.getApplication();
		applicationMap.put("applicationKey", "applicationValue");
		Date date2 = (Date) applicationMap.get("date");
		System.out.println(date2);
		
		//��ȡsession
		Map<String, Object> sessionMap = (Map<String, Object>) context.get("session");
		sessionMap.put("sessionKey", "sessionValue");
		
		//��ȡrequest
		Map<String, Object> requestMap = (Map<String, Object>) context.get("request");
		requestMap.put("requestKey", "requestValue");
		requestMap.put("list", list);
		requestMap.put("array", array);
		requestMap.put("date", date);
		Map<String, Parameter> parameters = context.getParameters();
		System.out.println(parameters.get("name").isMultiple());
		
		
		return "success";
	}
}
