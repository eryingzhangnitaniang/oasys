<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
股票名：<input id="he" name="po.gname" class="easyui-textbox" data-options="iconCls:'icon-search'" >
股票类型：<input id="tt" >     
<br>
收盘日期：<input  id="dd" name="po.ondate"  type="text" class= "easyui-datebox" ></input> ~<input  id="ee" name="po.endate" type="text" class= "easyui-datebox" ></input>
<a  href="javascript:search()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a> 


<script type="text/javascript">
$(function(){
	 
	$('#tt').combobox({    
	    url:'<%=request.getContextPath()%>/share!queryobj.action',    
	    valueField:'tid',    
	    textField:'tname'   
	});  
	})




</script>
</body>
</html>