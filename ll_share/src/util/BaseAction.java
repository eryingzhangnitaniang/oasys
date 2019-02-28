package util;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import com.opensymphony.xwork2.ActionSupport;


public class BaseAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,RequestAware,SessionAware
{
	
	private static final long serialVersionUID = 8118114440645739635L;
	public HttpServletResponse response;
	public HttpServletRequest request;
	public HttpSession session;
	public Map requestMap;
	public Map sessionMap;
    
	public BaseAction()
	{	
	}
	public void setServletRequest(HttpServletRequest arg0)
	{	
	   this.request=arg0;
	   this.session=this.request.getSession(true);
	}
	public void setServletResponse(HttpServletResponse arg0)
	{
	   this.response=arg0;
	}
	public void setRequest(Map arg0)
	{
	   	this.requestMap=arg0;
	}
	public void setSession(Map arg0)
	{
		this.sessionMap=arg0;
	}
	
	
	


	protected void ajaxOut(String jsonStr) {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		try {
//			处理后的字符串输出到jsp页面
			response.getWriter().write(jsonStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public HttpServletRequest getRequest() {
		return request;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public HttpSession getSession() {
		return session;
	}
	public Map getRequestMap() {
		return requestMap;
	}
	public Map getSessionMap() {
		return sessionMap;
	}
	

	

}
