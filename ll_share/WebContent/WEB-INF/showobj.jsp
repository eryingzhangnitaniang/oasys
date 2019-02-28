<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  id="showid"  method="post">
<input type="hidden" name="po.gid" value="${po.gid}"><br>
  股票名称：<input name="po.gname" value="${po.gname}"class="easyui-textbox" data-options="iconCls:'icon-search'" ><br>
股票类型：<input id="qq" name="po.gtypeid" value="${po.gtypeid}">      
<br> 
股票价格：<input name="po.gprice" value="${po.gprice}"class="easyui-textbox" data-options="iconCls:'icon-search'" ><br>
收盘日期：<input name="po.gdate" value="${po.gdate}" type= "text" class= "easyui-datebox" required ="required"> </input> 
</form>
<script type="text/javascript">
$(function(){
	 
	$('#qq').combobox({    
	    url:'<%=request.getContextPath()%>/share!queryobj.action',    
	    valueField:'tid',    
	    textField:'tname'   
	});  

	})


</script>
</body>
</html>