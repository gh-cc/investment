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
			$("#4").addClass("active");
			
		});
	
	</script>
	

	<div id="cyz_city" style="width: 100%;height:550px;"></div>
    <script type="text/javascript">
        var cyz_city = echarts.init(document.getElementById('cyz_city'));
        
        cyz_city.showLoading();
        $.getJSON('${projectName }/resources/json/cyz-city.json', function (json) {
        	cyz_city.hideLoading();
	        cyz_city.setOption(getMap(json.data,"Regional distribution of entrepreneurs","Number"));
        })
        
    </script> 
    
    <div style="height:20px"></div>
    
    <div id="cyz_gs" style="width: 100%;height:300px;"></div>
    <script type="text/javascript">
        var cyz_gs = echarts.init(document.getElementById('cyz_gs'));
     	var gs_data = ['添米','星火钱包','哎呀iYao','乐钱','拿趣网','梅第奇皇后鲜果泡芙','Counect互帮国际','Feekr旅行分享汇','序时科技'];
        var cyz_num = [6,6,6,6,6,6,6,5,5];
        cyz_gs.setOption(getBarOption(gs_data,cyz_num,'The number of entrepreneurs TOP5 company','Number'));
    </script> 
    
	
</body>
</html>