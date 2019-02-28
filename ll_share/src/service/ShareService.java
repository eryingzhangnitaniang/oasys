/** 
 * <pre>项目名称:ll_share 
 * 文件名称:ShareService.java 
 * 包名:service 
 * 创建日期:2018年12月12日上午8:54:33 
 * Copyright (c) 2018, 634369607@qq.com All Rights Reserved.</pre> 
 */  
package service;

import java.util.List;

import net.sf.json.JSONObject;
import pojo.SharePojo;
import pojo.ShareTypePojo;

/** 
 * <pre>项目名称：ll_share    
 * 类名称：ShareService    
 * 类描述：    
 * 创建人：鲁磊 1148029554@qq.com   
 * 创建时间：2018年12月12日 上午8:54:33    
 * 修改人：鲁磊 1148029554@qq.com      
 * 修改时间：2018年12月12日 上午8:54:33    
 * 修改备注：       
 * @version </pre>    
 */
public interface ShareService {

	/** <pre>queryobj(这里用一句话描述这个方法的作用)   
	 * 创建人：鲁磊 1148029554@qq.com     
	 * 创建时间：2018年12月12日 上午9:14:00    
	 * 修改人：鲁磊 1148029554@qq.com   
	 * 修改人电话：15769232546 
	 * 修改时间：2018年12月12日 上午9:14:00    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<ShareTypePojo> queryobj();

	/** <pre>queryUserPage(这里用一句话描述这个方法的作用)   
	 * 创建人：鲁磊 1148029554@qq.com     
	 * 创建时间：2018年12月12日 上午9:34:18    
	 * 修改人：鲁磊 1148029554@qq.com   
	 * 修改人电话：15769232546 
	 * 修改时间：2018年12月12日 上午9:34:18    
	 * 修改备注： 
	 * @param page
	 * @param rows
	 * @param po
	 * @return</pre>    
	 */
	JSONObject queryUserPage(int page, int rows, SharePojo po);

	/** <pre>deleteall(这里用一句话描述这个方法的作用)   
	 * 创建人：鲁磊 1148029554@qq.com     
	 * 创建时间：2018年12月12日 上午9:56:45    
	 * 修改人：鲁磊 1148029554@qq.com   
	 * 修改人电话：15769232546 
	 * 修改时间：2018年12月12日 上午9:56:45    
	 * 修改备注： 
	 * @param str</pre>    
	 */
	void deleteall(String str);

	/** <pre>updateall(这里用一句话描述这个方法的作用)   
	 * 创建人：鲁磊 1148029554@qq.com     
	 * 创建时间：2018年12月12日 上午10:16:49    
	 * 修改人：鲁磊 1148029554@qq.com   
	 * 修改人电话：15769232546 
	 * 修改时间：2018年12月12日 上午10:16:49    
	 * 修改备注： 
	 * @param po</pre>    
	 */
	void updateall(SharePojo po);

}
