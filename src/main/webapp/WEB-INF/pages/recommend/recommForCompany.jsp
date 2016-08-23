<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
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
    function(){
         var company_name = $('#companyname').val();
            company_name =  $.trim(company_name);
            if(company_name == null || company_name == ""){
              alert("请先输入需要推荐的融资公司名称，再继续操作！");
              return;
            }else {
              $.post("${projectName }/recomForCompResult.action", {company_name: company_name},
                      function (data) {
                        $('.recomm_class').html(data);
                      });
            }
    }

    );
    
    
    $('#select').change( function () { 
    	//alert("gh");
    	company_id = $(this).val();
    	if(company_id==0) return;
    	//alert(company_id)
    	$(this).attr("disabled","disabled")
    	$.post("${projectName }/recomForCompResult.action", {company_id: company_id},
                function (data) {
                  $('.recomm_class').html(data);
                  $('#select').removeAttr("disabled")
                }); 
    	
    });


  });
</script>
    <div>
<!--       融资公司名称:<br/><input type="text" id="companyname" size="40"/>
      <input type="submit" id="company_reomm" value="推荐"/> -->
      
      <select id="select" class="form-control" style="width: 250px;" >
      	  <option value="0">请选择创业公司(待完善)</option>
		  <option value="1">知子花</option>
		  <option value="7621">拼班</option>
		  <option value="5178">拾光盒子</option>
		  <option value="4141">拼味</option>
		  <option value="3253">拿趣</option>
		  <option value="5900">拿票门到门</option>
		  <option value="6174">指动生活</option>
		  <option value="3410">指南设计</option>
		  <option value="7411">掌上快销</option>
		  <option value="4234">搜云科技</option>
		</select>
      <br/>

    </div>
    <div class = "recomm_class">
    </div>

</body>
</html>