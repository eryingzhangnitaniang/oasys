/** 
 * <pre>项目名称:ll_share 
 * 文件名称:ShareDaoimp.java 
 * 包名:dao 
 * 创建日期:2018年12月12日上午8:54:23 
 * Copyright (c) 2018, 634369607@qq.com All Rights Reserved.</pre> 
 */  
package dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import net.sf.json.JSONObject;
import pojo.SharePojo;
import pojo.ShareTypePojo;
import util.HibernateUtil;

/** 
 * <pre>项目名称：ll_share    
 * 类名称：ShareDaoimp    
 * 类描述：    
 * 创建人：鲁磊 1148029554@qq.com   
 * 创建时间：2018年12月12日 上午8:54:23    
 * 修改人：鲁磊 1148029554@qq.com      
 * 修改时间：2018年12月12日 上午8:54:23    
 * 修改备注：       
 * @version </pre>    
 */
@Repository
public class ShareDaoimp extends  HibernateDaoSupport  implements ShareDao{

	/* (non-Javadoc)    
	 * @see dao.ShareDao#queryobj()    
	 */
	@Override
	public List<ShareTypePojo> queryobj() {
		String   hql = " from ShareTypePojo ";
		return HibernateUtil.findSession(getHibernateTemplate()).createQuery(hql).list();
	}
    /* (non-Javadoc)    
     * @see dao.ShareDao#queryUserPage(int, int, pojo.SharePojo)    
     */
    @Override
    public JSONObject queryUserPage(int page, int rows, SharePojo po) {
    	JSONObject   json = new JSONObject();
    	int  start = (page-1)*rows;
    	StringBuffer   sb = new StringBuffer(" from SharePojo a,ShareTypePojo b where a.gtypeid=b.tid");
    	if(po!=null){
    		if(po.getGname()!=null  && !po.getGname().equals("")){
    			sb.append(" and gname like '%"+po.getGname()+"%'");
    		}
    		if(po.getGtypeid()!=null && po.getGtypeid()!=0){
    			sb.append(" and gtypeid="+po.getGtypeid());
    		}
    		if(po.getOndate()!=null  && !po.getOndate().equals("")){
    			sb.append(" and gdate>to_date('"+po.getOndate()+"','yyyy-mm-dd')");
    		}
    		if(po.getEndate()!=null  && !po.getEndate().equals("")){
    			sb.append(" and gdate<to_date('"+po.getEndate()+"','yyyy-mm-dd')");
    		}
    	}
    	 long   count  = (long) HibernateUtil.findSession(getHibernateTemplate()).createQuery(" select count(*)"+sb.toString()).uniqueResult();
    	 List  list = HibernateUtil.findSession(getHibernateTemplate()).createQuery(sb.toString())
    			    .setFirstResult(start)
    			    .setMaxResults(rows)
    			    .list();
    	 json.put("total",count);
    	 json.put("rows",list);
    	 
    	return json;
    }
    
    /* (non-Javadoc)    
     * @see dao.ShareDao#deleteall(java.lang.String)    
     */
    @Override
    public void deleteall(String str) {
    	String  hql = " delete SharePojo where gid in("+str+")";
    	HibernateUtil.findSession(getHibernateTemplate()).createQuery(hql).executeUpdate();
    	
    }
    
    /* (non-Javadoc)    
     * @see dao.ShareDao#updateall(pojo.SharePojo)    
     */
    @Override
    public void updateall(SharePojo po) {
    	// TODO Auto-generated method stub
    	getHibernateTemplate().saveOrUpdate(po);
    }
    
}
