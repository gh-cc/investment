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
		$("#3").addClass("active");
		
	});
	
	</script>
	
	
	&nbsp;<a href="${projectName }/reqrecomForComp.action"><font size="6">Recommended investment institutions</font></a>
	<br/>
	<br/>
	
    <div id="rztp" style="width: 100%;height:700px;"></div>
    <script type="text/javascript">
        var rztp = echarts.init(document.getElementById('rztp'));
        rztp.showLoading();
        $.getJSON('${projectName }/resources/json/rz-top.json', function (json) {
        	rztp.hideLoading();
        	rztp.setOption(option = {
                title: {
                    text: 'Venture capital times TOP5'
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