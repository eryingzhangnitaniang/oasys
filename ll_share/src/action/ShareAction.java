/** 
 * <pre>项目名称:ll_share 
 * 文件名称:ShareAction.java 
 * 包名:action 
 * 创建日期:2018年12月12日上午8:54:05 
 * Copyright (c) 2018, 634369607@qq.com All Rights Reserved.</pre> 
 */  
package action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import pojo.SharePojo;
import pojo.ShareTypePojo;
import service.ShareService;
import util.BaseAction;

/** 
 * <pre>项目名称：ll_share    
 * 类名称：ShareAction    
 * 类描述：    
 * 创建人：鲁磊 1148029554@qq.com   
 * 创建时间：2018年12月12日 上午8:54:05    
 * 修改人：鲁磊 1148029554@qq.com      
 * 修改时间：2018年12月12日 上午8:54:05    
 * 修改备注：       
 * @version </pre>    
 */
@Action(value="share",results={
		@Result(name="shang",location="/WEB-INF/shang.jsp"),
		@Result(name="zhong",location="/WEB-INF/zhong.jsp"),
		@Result(name="showobj",location="/WEB-INF/showobj.jsp")
})
public class ShareAction extends BaseAction{
@Autowired
private    ShareService   serv;
private    SharePojo    po;
private    ShareTypePojo   pu;
private   int    page;
private   int  rows;
private   String   str;



public   String   queryall(){
	return "shang";
	
}

public   void  queryobj(){
	List<ShareTypePojo>  ls = serv.queryobj();
	ajaxOut(JSONArray.fromObject(ls).toString());
}

public   String   query(){
	return "zhong";
	
}
public   void  queryUserPage(){
	JSONObject   json = serv.queryUserPage(page,rows,po);
	ajaxOut(json.toString());
}

public  void  deleteall(){
	 serv.deleteall(str);
}

public   String   insertall(){
	return "showobj";
	
}
public   void updateall(){
	serv.updateall(po);
}


public SharePojo getPo() {
	return po;
}
public void setPo(SharePojo po) {
	this.po = po;
}
public ShareTypePojo getPu() {
	return pu;
}
public void setPu(ShareTypePojo pu) {
	this.pu = pu;
}

public int getPage() {
	return page;
}

public void setPage(int page) {
	this.page = page;
}

public int getRows() {
	return rows;
}

public void setRows(int rows) {
	this.rows = rows;
}

public String getStr() {
	return str;
}

public void setStr(String str) {
	this.str = str;
}


}
