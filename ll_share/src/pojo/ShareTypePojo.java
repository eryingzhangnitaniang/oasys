/** 
 * <pre>项目名称:ll_share 
 * 文件名称:SharePojo.java 
 * 包名:pojo 
 * 创建日期:2018年12月12日上午8:55:05 
 * Copyright (c) 2018, 634369607@qq.com All Rights Reserved.</pre> 
 */  
package pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * <pre>项目名称：ll_share    
 * 类名称：SharePojo    
 * 类描述：    
 * 创建人：鲁磊 1148029554@qq.com   
 * 创建时间：2018年12月12日 上午8:55:05    
 * 修改人：鲁磊 1148029554@qq.com      
 * 修改时间：2018年12月12日 上午8:55:05    
 * 修改备注：       
 * @version </pre>    
 */
@Entity
@Table(name="t_share_type")
public class ShareTypePojo {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private    Integer    tid;
private    String    tname;
public Integer getTid() {
	return tid;
}
public void setTid(Integer tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}


}
