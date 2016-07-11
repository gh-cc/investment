<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<%@ include file="common.jsp" %>

<link href="${projectName }/resources/mb/css/base.css" rel="stylesheet">
<link href="${projectName }/resources/mb/css/index.css" rel="stylesheet">
<!-- <script type="text/javascript" src="js/jquery.min.js"></script> -->
<script type="text/javascript" src="${projectName }/resources/mb/js/sliders.js"></script>

<style type="text/css">
.nav_index {
    padding: 0px 0px;
    font-size: 20px;
}
.nav>li>a{
    padding: 10px 30px;
}
</style>

<script type="text/javascript">
$(function(){
//	alert("gh");

	$("li[role='presentation'] > a").on("click",function(){
		//alert($(this).text());
		
		$("li[role='presentation']").each(function(){
			$(this).removeClass("active");
		});
		
		$(this).parent().addClass("active");
		
	});
	
});

</script>

</head>

<body>
<header>
  <div class="logo f_l"> 
  	<a href="/">
  	  <img src="${projectName }/resources/mb/images/logo2.jpg"></a> 
  </div>
  <div class="pull-right">
  <ul class="nav nav-pills nav_index">
	  <li role="presentation" <%-- class="active" --%> ><a id="index" href="${projectName }/gh/index.action">首页</a></li>
	  <li role="presentation"><a id="me" href="${projectName }/gh/me.action" >1111</a></li>
	  <li role="presentation"><a id="wz" href="#">222</a></li>
	  <li role="presentation"><a id="ly" href="#">333</a></li>
	</ul>
  </div>
</header>
</body>
  
</html>
  
  