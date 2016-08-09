<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spark</title>

</head>
<body>
	<%@ include file="/WEB-INF/pages/common/head.jsp" %>
	<script type="text/javascript">
	$(function(){
	//	alert("gh");
	
		$("li[role='presentation']").each(function(){
			$(this).removeClass("active");
		});
		$("#5").addClass("active");
		
	});
	
	</script>

	
	
    
	
</body>
</html>