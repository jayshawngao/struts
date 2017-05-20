package jayshawn.struts.load;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport { 
	
	//private String contentDisposition;
	private InputStream inputStream;
	
//	public String getContentDisposition() {
//		return contentDisposition;
//	}


	public InputStream getInputStream() {
		return inputStream;
	}


	public String execute() throws Exception{
		
		inputStream = new FileInputStream(ServletActionContext.getServletContext().getRealPath("/file/EclEmma.docx"));
//		contentDisposition = "attachment;filename=EclEmma.docx";
 		return SUCCESS;
	}
}
