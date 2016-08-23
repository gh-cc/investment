<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<style type="text/css">
.nav_index {
    padding: 10px 10px;
    font-size: 8px;
    height: 60px;
}
.ul_{
	float: right;
}
</style>

<body>
<%@ include file="/WEB-INF/pages/common/common.jsp" %>

<div class="nav_index">
	<ul class="nav nav-pills  ul_">
	  <%-- <li role="presentation" id="1"><a href="${projectName }/index.jsp">首页</a></li> --%>
	  <li role="presentation" id="2"><a href="${projectName }/invest.action">Institutional Investor</a></li>
	  <li role="presentation" id="3"><a href="${projectName }/entrepreneurship.action">Startups</a></li>
	  <li role="presentation" id="4"><a href="${projectName }/entrepreneur.action">Entrepreneurs</a></li>
	  <li role="presentation" id="5"><a href="${projectName }/investor.action">Investor</a></li>
	</ul>
</div>

</body>
</html>
  
  