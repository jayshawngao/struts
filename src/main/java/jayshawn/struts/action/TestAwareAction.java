package jayshawn.struts.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class TestAwareAction implements ApplicationAware, SessionAware, RequestAware, ParameterAware {
	
	private Map<String, Object> application;
	private Map<String, Object> session;
	private Map<String, Object> request;
	private Map<String, String[]> parameters;
	
	public String execute(){
		
		application.put("applicationKey2", "applicationValue2");
		
		session.put("sessionKey2", "sessionValue2");
		
		request.put("requestKey2", "requestValue2");
		
		System.out.println(parameters.get("name")[0]);
		
		System.out.println("date2: " + request.get("date2"));
		return "success";
		
		
	}

	public void setApplication(Map<String, Object> application) {
		this.application = application; 
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setParameters(Map<String, String[]> parameters) {
		this.parameters = parameters;
	}
}
