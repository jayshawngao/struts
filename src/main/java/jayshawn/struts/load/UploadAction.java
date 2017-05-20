package jayshawn.struts.load;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;

	private File file;
	private String fileCotentType;
	private String fileFileName;
	
	
	public File getFile() {
		return file;
	}


	public void setFile(File file) {
		this.file = file;
	}


	public String getFileCotentType() {
		return fileCotentType;
	}


	public void setFileCotentType(String fileCotentType) {
		this.fileCotentType = fileCotentType;
	}


	public String getFileFileName() {
		return fileFileName;
	}


	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	@Override
	public String execute() throws Exception{
		
		System.out.println(file);
		FileInputStream in = new FileInputStream(file);
		FileOutputStream out = new FileOutputStream("D:/workspace/struts/src/main/webapp/file/"+fileFileName);
		byte[] buffer = new byte[1024];
		while(in.read(buffer)!=-1){
			out.write(buffer);
		}
		out.close();
		in.close();
		return SUCCESS;
		
	}
}
