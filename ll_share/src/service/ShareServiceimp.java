/** 
 * <pre>项目名称:ll_share 
 * 文件名称:ShareServiceimp.java 
 * 包名:service 
 * 创建日期:2018年12月12日上午8:54:53 
 * Copyright (c) 2018, 634369607@qq.com All Rights Reserved.</pre> 
 */  
package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ShareDao;
import net.sf.json.JSONObject;
import pojo.SharePojo;
import pojo.ShareTypePojo;

/** 
 * <pre>项目名称：ll_share    
 * 类名称：ShareServiceimp    
 * 类描述：    
 * 创建人：鲁磊 1148029554@qq.com   
 * 创建时间：2018年12月12日 上午8:54:53    
 * 修改人：鲁磊 1148029554@qq.com      
 * 修改时间：2018年12月12日 上午8:54:53    
 * 修改备注：       
 * @version </pre>    
 */
@Service
public class ShareServiceimp implements  ShareService{

	@Autowired
	private   ShareDao  dao;
	/* (non-Javadoc)    
	 * @see service.ShareService#queryobj()    
	 */
	@Override
	public List<ShareTypePojo> queryobj() {
		// TODO Auto-generated method stub
		return dao.queryobj();
	}
	
	/* (non-Javadoc)    
	 * @see service.ShareService#queryUserPage(int, int, pojo.SharePojo)    
	 */
	@Override
	public JSONObject queryUserPage(int page, int rows, SharePojo po) {
		// TODO Auto-generated method stub
		return dao.queryUserPage(page,rows,po);
	}
    
	/* (non-Javadoc)    
	 * @see service.ShareService#deleteall(java.lang.String)    
	 */
	@Override
	public void deleteall(String str) {
		dao.deleteall(str);
		
	}
	
	
	/* (non-Javadoc)    
	 * @see service.ShareService#updateall(pojo.SharePojo)    
	 */
	@Override
	public void updateall(SharePojo po) {
		// TODO Auto-generated method stub
		dao.updateall(po);
	}
}
