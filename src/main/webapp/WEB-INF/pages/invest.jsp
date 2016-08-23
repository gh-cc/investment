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
			$("#2").addClass("active");
			
		});
		
		</script>
		
	&nbsp;<a href="#"><font size="6">Recommended startups(In development...)</font></a>
	<br/>
	<br/>

	<div id="turn" style="width: 100%;height:300px;"></div>
	<script type="text/javascript">
        var myChart = echarts.init(document.getElementById('turn'));
		var tzx = ['A+轮','战略投资','IPO上市','天使轮','新三板','F轮-上市前','B轮','D轮','IPO上市后','Pre-B轮','E轮','Pre-A轮','C轮','B+轮','A轮','种子轮','不明确'];
        var tzy = [105,144,88,5774,123,50,1313,122,77,9,41,668,420,29,4665,325,61];
        myChart.setOption(getBarOption(tzx,tzy,'The investment round analysis of investment institutions','Investment times'));
    </script>
	
	
	<div style="height:20px"></div>
	
	
	<div id="leixin" style="width: 100%;height:300px;"></div>
    <script type="text/javascript">
        var lei = echarts.init(document.getElementById('leixin'));
     	var leix = ['本地生活','医疗健康','硬件','物流','文化娱乐','移动互联网','金融','电子商务','房产服务','广告营销','游戏','汽车交通','社交网络','工具软件','旅游','教育','体育运动','企业服务'];
        var leiy = [1167,788,814,159,1291,4,1154,1792,390,427,1049,739,588,509,548,820,232,1542];
        lei.setOption(getBarOption(leix,leiy,'Types of investment companies','Investment times'));
    </script> 
    
    
    <div style="height:20px"></div>
    
    <div id="tztp" style="width: 100%;height:700px;"></div>
    <script type="text/javascript">
        var tztp = echarts.init(document.getElementById('tztp'));
        tztp.showLoading();
        $.getJSON('${projectName }/resources/json/tp.json', function (json) {
        	tztp.hideLoading();
        	tztp.setOption(option = {
                title: {
                    text: 'Investment institutions to invest in the number of projects TOP5'
                },
                animationDurationUpdate: 1500,
                animationEasingUpdate: 'quinticInOut',
                series : [
                    {
                        type: 'graph',
                        layout: 'none',
                        // progressiveThreshold: 700,
                        data: json.nodes.map(function (node) {
                            return {
                                x: node.x,
                                y: node.y,
                                id: node.id,
                                name: node.label,
                                symbolSize: node.size,
                                itemStyle: {
                                    normal: {
                                        color: node.color
                                    }
                                }
                            };
                        }),
                        edges: json.edges.map(function (edge) {
                            return {
                                source: edge.sourceID,
                                target: edge.targetID
                            };
                        }),
                        label: {
                            emphasis: {
                                position: 'right',
                                show: true
                            }
                        },
                        roam: true,
                        focusNodeAdjacency: true,
                        lineStyle: {
                            normal: {
                                width: 0.5,
                                curveness: 0.3,
                                opacity: 0.7
                            }
                        }
                    }
                ]
            }, true);
        });
    </script> 
    
    
	
</body>
</html>