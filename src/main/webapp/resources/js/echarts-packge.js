/*(function(){
	//alert("ok");
	
})()*/
var bar_option = {
   title: {
          text: ''
    },
    color: ['#3398DB'],
    tooltip : {
        trigger: 'axis',
        axisPointer : {            
            type : 'shadow'        
        }
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis : [
        {
            type : 'category',
            data : null,
            axisTick: {
                alignWithLabel: true
            },
            axisLabel:{
            	interval:0
            }
        }
    ],
    yAxis : [
        {
            type : 'value'
        }
    ],
    series : [
        {
            name:'',
            type:'bar',
            barWidth: '60%',
            data:null
        }
    ]
};
function cp(json){
	return JSON.parse(JSON.stringify(json))
}
function getBarOption(x_data,y_data,title,s_name){
	var option = cp(bar_option);
	option.xAxis[0].data = x_data;
	option.series[0].data = y_data;
	option.series[0].name = s_name;
	option.title.text = title
	return option;
}

var map_china = {
	    title: {
	        text: '',
	        left: 'center'
	    },
	    tooltip: {
	        trigger: 'item'
	    },
	    legend: {
	        orient: 'vertical',
	        left: 'left',
	        data:null
	    },
	    visualMap: {
	        min: 0,
	        max: 2500,
	        left: 'left',
	        top: 'bottom',
	        text: ['高','低'],           // 文本，默认为数值文本
	        calculable: true
	    },
	    series: [
	        {
	            name: '',
	            type: 'map',
	            mapType: 'china',
	            roam: false,
	            label: {
	                normal: {
	                    show: true
	                },
	                emphasis: {
	                    show: true
	                }
	            },
	            data:null
	        }
	    ]
	};

function getMap(data,title,data_type){map_china
	var option = cp(map_china);
	option.series[0].data = data;
	option.title.text = title;
	option.legend[0] = [data_type];
	option.series[0].name = data_type;
	return option;
}