package jayshawn.struts.valuestack;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class Product implements SessionAware, RequestAware{
	private Integer productId;
	private String productName;
	private Double productPrice;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	public String save(){
		System.out.println("save: "+this);
		
		session.put("product", this);
		
		return "success";
	}
	public Product() {
		System.out.println("Product's constructor...");
	}
	
	private Map<String, Object> request;
	private Map<String, Object> session;
	
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	

}
