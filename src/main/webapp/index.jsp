<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spark</title>

<style type="text/css">
.search{
	height: 45px;
}
</style>

</head>
<body>
	<%@ include file="/WEB-INF/pages/common/head.jsp" %>
	
	<script type="text/javascript">
		$(function(){
		//	alert("gh");
		
			$("li[role='presentation']").each(function(){
				$(this).removeClass("active");
			});
			$("#1").addClass("active");
			
		});
		
	</script>

	  <div class="col-lg-6 center-block" style="float:none;margin-top: 15%;" >
		    <div class="input-group">
		      <input type="text" class="form-control" style="height: 45px" placeholder="Search for...">
		      <span class="input-group-btn">
		        <button class="btn btn-default search" type="button">Go</button>
		      </span>
		    </div><!-- /input-group -->
	  </div><!-- /.col-lg-6 -->


	
    
	
</body>
</html>