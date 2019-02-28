<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<!-- 引入EasyUI的样式文件-->
<link rel="stylesheet"
                 href="${pageContext.request.contextPath}/EasyUI/themes/default/easyui.css" type="text/css"/>

<!-- 引入EasyUI的图标样式文件-->
<link rel="stylesheet"
                 href="${pageContext.request.contextPath}/EasyUI/themes/icon.css" type="text/css"/>
<body>


<div id="cc" class="easyui-layout" data-options="fit:true">   
    <div data-options="region:'north',title:'上',href:'<%=request.getContextPath()%>/share!queryall.action'" style="height:150px;"></div>   
    
    <div data-options="region:'center',title:'中',href:'<%=request.getContextPath()%>/share!query.action'" style="padding:5px;"></div>   
</div>  








<!-- 引入JQuery -->
<script type="text/javascript"
                 src="${pageContext.request.contextPath}/EasyUI/jquery.min.js"></script>

<!-- 引入EasyUI -->
<script type="text/javascript"
                 src="${pageContext.request.contextPath}/EasyUI/jquery.easyui.min.js"></script>

<!-- 引入EasyUI的中文国际化js，让EasyUI支持中文 -->
<script type="text/javascript"
                 src="${pageContext.request.contextPath}/EasyUI/locale/easyui-lang-zh_CN.js"></script>


</body>
</html>