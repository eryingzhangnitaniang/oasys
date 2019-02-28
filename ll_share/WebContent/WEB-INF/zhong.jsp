<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a  href="javascript:add()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>  
<a  href="javascript:remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">删除</a>  
<table  id="showFormid"></table>
<div id="users"></div>
<script type="text/javascript">
$(function(){
	
	search();
	
})

   function  search(){
	$("#showFormid").datagrid({
		fitColumns:true,
		queryParams: {
			'po.gname': $('#he').val(),
			'po.gtypeid':$('#tt').combobox('getValue'),
			'po.ondate':$("[name='po.ondate']").val(),
			'po.endate':$("[name='po.endate']").val()
		}, 
	    url:'<%=request.getContextPath()%>/share!queryUserPage.action',
	    pagination:true,//开启分页
		pagePosition:"top",//定义分页工具栏的位置
		pageNumber:1,
		pageSize:2,//每页条数
		pageList:[2,5,8],//每页条数的下拉选项，第一个值 一定与 pageSize属性值一致
	    columns:[[
            {field:'ond',checkbox:true,width:100,},
            {field:'gid',title:'股票ID',width:100,
            	formatter: function(value,row,index){
					{
						return row[0].gid;
					} 

	        }	
            
            },
	        {field:'gname',title:'股票名称',width:100,
	        	formatter: function(value,row,index){
					{
						return row[0].gname;
					} 

	        }
	        },
	        {field:'tid',title:'股票类型',width:100,
	        	formatter: function(value,row,index){
					{
						return row[1].tname;
					} 	
	        }
	        },
	        {field:'gprice',title:'股票价格',width:100,
	        	formatter: function(value,row,index){
					{
						return row[0].gprice;
					} 	
	        	}
	        },
	        {field:'gdate',title:'上架时间',width:100,
	        	formatter: function(value,row,index){
					{
						return new Date(row[0].gdate.time).toLocaleDateString();
					} 	
	        	}	
	        }
	        
	    ]]    
	}); 
}	


function  remove(){
	var  str = "0";
	var  arr=$('#showFormid').datagrid('getChecked');
	for(var i=0;i<arr.length;i++){
		str+=','+arr[i][0].gid;
	}
	if(confirm("你确定删除吗？")){
      $.ajax({
    	  type:"post",
    	  url:"<%=request.getContextPath()%>/share!deleteall.action",
    	  data:{'str':str},
    	  success:function(){
    		  search();
    	  }
      })
	}	
}


function   add(){
	$('#users').dialog({    
	    title: '添加框',    
	    width: 600,    
	    height: 400,    
	    closed: false,    
	  	href: '<%=request.getContextPath()%>/share!insertall.action',    
	    modal: true,
		buttons:[{
				text:'保存',
				handler:function(){
					if(confirm("你确定保存吗？")){
						
						  $.ajax({
							  type:"post",
							  url:"<%=request.getContextPath()%>/share!updateall.action",
							  data:$("#showid").serialize(),
							  success:function(){
								  $("#users").dialog('close');
								  search();
							  }  
						  })
						}
				 
				  
				  }
			}]
	})
	
	
}


</script>
</body>
</html>