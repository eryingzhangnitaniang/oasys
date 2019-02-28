/** 
 * <pre>项目名称:ll_share 
 * 文件名称:ShareDao.java 
 * 包名:dao 
 * 创建日期:2018年12月12日上午8:54:12 
 * Copyright (c) 2018, 634369607@qq.com All Rights Reserved.</pre> 
 */  
package dao;

import java.util.List;

import net.sf.json.JSONObject;
import pojo.SharePojo;
import pojo.ShareTypePojo;

/** 
 * <pre>项目名称：ll_share    
 * 类名称：ShareDao    
 * 类描述：    
 * 创建人：鲁磊 1148029554@qq.com   
 * 创建时间：2018年12月12日 上午8:54:12    
 * 修改人：鲁磊 1148029554@qq.com      
 * 修改时间：2018年12月12日 上午8:54:12    
 * 修改备注：       
 * @version </pre>    
 */
public interface ShareDao {

	/** <pre>queryobj(这里用一句话描述这个方法的作用)   
	 * 创建人：鲁磊 1148029554@qq.com     
	 * 创建时间：2018年12月12日 上午9:15:03    
	 * 修改人：鲁磊 1148029554@qq.com   
	 * 修改人电话：15769232546 
	 * 修改时间：2018年12月12日 上午9:15:03    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<ShareTypePojo> queryobj();

	/** <pre>queryUserPage(这里用一句话描述这个方法的作用)   
	 * 创建人：鲁磊 1148029554@qq.com     
	 * 创建时间：2018年12月12日 上午9:34:45    
	 * 修改人：鲁磊 1148029554@qq.com   
	 * 修改人电话：15769232546 
	 * 修改时间：2018年12月12日 上午9:34:45    
	 * 修改备注： 
	 * @param page
	 * @param rows
	 * @param po
	 * @return</pre>    
	 */
	JSONObject queryUserPage(int page, int rows, SharePojo po);

	/** <pre>deleteall(这里用一句话描述这个方法的作用)   
	 * 创建人：鲁磊 1148029554@qq.com     
	 * 创建时间：2018年12月12日 上午9:57:04    
	 * 修改人：鲁磊 1148029554@qq.com   
	 * 修改人电话：15769232546 
	 * 修改时间：2018年12月12日 上午9:57:04    
	 * 修改备注： 
	 * @param str</pre>    
	 */
	void deleteall(String str);

	/** <pre>updateall(这里用一句话描述这个方法的作用)   
	 * 创建人：鲁磊 1148029554@qq.com     
	 * 创建时间：2018年12月12日 上午10:17:10    
	 * 修改人：鲁磊 1148029554@qq.com   
	 * 修改人电话：15769232546 
	 * 修改时间：2018年12月12日 上午10:17:10    
	 * 修改备注： 
	 * @param po</pre>    
	 */
	void updateall(SharePojo po);

}
