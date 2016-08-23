<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->

<% 
	String projectName = request.getContextPath(); 
	pageContext.setAttribute("projectName", projectName);
%>

<!-- Bootstrap -->
<link href="${projectName }/dist/css/bootstrap.min.css" rel="stylesheet">


<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<%-- <script src="${projectName }/resources/js/ie-emulation-modes-warning.js"></script> --%>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
  
<script src="${projectName }/resources/js/jquery-1.11.3.min.js"></script>
<script src="${projectName }/dist/js/bootstrap.min.js"></script>

<script src="${projectName }/resources/js/echarts.min.js"></script>
<script src="${projectName }/resources/js/china.js"></script>
<%-- <script src="${projectName }/resources/js/echarts.js"></script> --%>
<script src="${projectName }/resources/js/echarts-packge.js"></script>
  
</html>
  
  