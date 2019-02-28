/** 
 * <pre>项目名称:ll_share 
 * 文件名称:ShareTypePojo.java 
 * 包名:pojo 
 * 创建日期:2018年12月12日上午8:55:18 
 * Copyright (c) 2018, 634369607@qq.com All Rights Reserved.</pre> 
 */  
package pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

/** 
 * <pre>项目名称：ll_share    
 * 类名称：ShareTypePojo    
 * 类描述：    
 * 创建人：鲁磊 1148029554@qq.com   
 * 创建时间：2018年12月12日 上午8:55:18    
 * 修改人：鲁磊 1148029554@qq.com      
 * 修改时间：2018年12月12日 上午8:55:18    
 * 修改备注：       
 * @version </pre>    
 */
@Entity
@Table(name="t_share")
public class SharePojo {
@Id
@SequenceGenerator(sequenceName="SEMSE",name="ss",initialValue=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private   Integer   gid;
private   String    gname;
private   Integer   gtypeid;
private   Integer   gprice;
@DateTimeFormat(pattern="yyyy-mm-dd")
private   Date      gdate;
@Transient
private    String   ondate;
@Transient
private    String     endate;
public Integer getGid() {
	return gid;
}
public void setGid(Integer gid) {
	this.gid = gid;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public Integer getGtypeid() {
	return gtypeid;
}
public void setGtypeid(Integer gtypeid) {
	this.gtypeid = gtypeid;
}
public Integer getGprice() {
	return gprice;
}
public void setGprice(Integer gprice) {
	this.gprice = gprice;
}
public Date getGdate() {
	return gdate;
}
public void setGdate(Date gdate) {
	this.gdate = gdate;
}
public String getOndate() {
	return ondate;
}
public void setOndate(String ondate) {
	this.ondate = ondate;
}
public String getEndate() {
	return endate;
}
public void setEndate(String endate) {
	this.endate = endate;
}
}
