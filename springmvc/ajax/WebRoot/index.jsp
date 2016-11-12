<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript">
	$(function(){
		$.post("ajax.do",{name:"siggy"},function(data)
				{
			            alert(data);
				}
		
				);
	}); 
	
	</script>
  </head>
  
  <body>
   
  </body>
</html>
