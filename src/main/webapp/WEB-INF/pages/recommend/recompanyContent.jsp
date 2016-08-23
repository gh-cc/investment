<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<table  class="table table-hover">
    <tr>
        <th>投资机构名称</th>
        <th>推荐等级(值越小越高)</th>
    </tr>
    
    <c:forEach items="${agencyList}" var="lis" varStatus="status">
        <tr>
            <td>${lis[1]}</td>
            <td>${lis[2]}</td>
        </tr>
    </c:forEach>
    
    
</table>




</html>