<%@ page contentType="text/html;charset=UTF-8" language="java"   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>recommand for company</title>
</head>
<body>
<%@ include file="/WEB-INF/pages/common/head.jsp" %>
<script type="text/javascript">
  $(function(){
    //	alert("gh");
    $('#company_reomm').click(
    var company_name = $('#companyname').val();
    company_name =  $.trim(company_name);
    if(company_name == null || company_name == ""){
      alert("请先输入需要推荐的融资公司名称，再继续操作！");
      return;
    }else {
      $.post("/recomForCompResult.action", {company_name: company_name},
              function (data) {
                $('.recomm_class').html(data);
              },
              "html");
    }
    );

  });
</script>
    <div>
      融资公司名称:<input type="text" id="companyname" size="40"/>
      <input type="submit" id="company_reomm" value="推荐"/>

    </div>
    <div class = "recomm_class">
    </div>

</body>
</html>