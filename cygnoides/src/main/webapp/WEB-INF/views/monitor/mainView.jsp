<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>实时气象信息</title>

	<style>
	  
	  .display-td-title div{	  	
	  	color: green;
	  	font-weight: bolder;
	  	font-size: larger;
	  	text-align: center;
	  }
	  
	  .display-td-context{
		background-color: #E1FFEA;	
	  }
	  
	  .display-td-context div{	  	
	  	font-size: x-large;
	  	font-weight: bolder;
	  	text-align: center;
	  	color: #FFA400;
	  }
	  
	  #last-update{
	  	padding-top: 10px;
	  	padding-bottom: 10px;
	  	text-align: center;
	  	font-weight:bolder;
	  }
	  
	  .unit-fonts{
	  	font-size: medium;
	  	font-weight: bold;
	  	color: green;	  	
	  }
	</style>	
	
	<script>	  
	  function fillValue(msg){
	  	//left part
	  	$("#v_temperature").html(msg.mtTemp1);
		$("#v_relative_humidity").html(msg.mtRelHumidity);
		$("#v_dew_point").html(msg.mtDewPoint).number(true,2);
		$("#v_heat_index").html(msg.mtHeatIndex);
		$("#v_wind_chill").html(msg.mtWindChill);
		$("#v_rainfill").html(msg.mtRainToday).number(true,2);
		$("#v_bar_pressure").html(msg.mtSaturatedVaporPressure).number(true,2);
		//last update time
		$("#v_updated_time").html(msg.mtSampTime);
				
		//middle part
		$("#v_wind_direction").html(msg.mtAdjWindDirAv).number(true,3);
		$("#v_wind_speed").html(msg.mtWindSpeedAv).number(true,3);

	  	//right part
	  	$("#v_3sec_roll_avg_wind_speed").html(msg.mt_3secRollAvgWindSpeed).number(true,2);
		$("#v_3sec_roll_avg_wind_dir").html(msg.mt_3secRollAvgWindDir).number(true,2);
		$("#v_2min_roll_avg_wind_speed").html(msg.mt_2minRollAvgWindSpeed).number(true,2);
		$("#v_2min_roll_avg_wind_dir").html(msg.mt_2minRollAvgWindDir).number(true,2);
		$("#v_10min_roll_avg_wind_speed").html(msg.mt_10minRollAvgWindSpeed).number(true,2);
		$("#v_10min_roll_avg_wind_dir").html(msg.mt_10minRollAvgWindDir).number(true,2);
		$("#v_10min_wind_gust_speed").html(msg.mt_10minWindGustSpeed);
		$("#v_10min_wind_gust_dir").html(msg.mt_10minWindGustDir);
		$("#v_60min_wind_gust_speed").html(msg.mt_60minWindGustSpeed);
		$("#v_60min_wind_gust_dir").html(msg.mt_60minWindGustDir);
		$("#v_density_altitude").html(msg.mtDensityAltitude).number(true,2);		
	  }
	  
	  function connect(){
		$.ajax({
            type: "GET",//使用get方法访问后台
            timeout: 120000,//超时时间
            cache: false,
            dataType: "json",//返回json格式的数据
            url: "${ctx}/api/v1/monitor/id/100000",//要访问的后台地址
            //data: "pageIndex=" + pageIndex,//要发送的数据
            complete :function(XHR, TS){//AJAX请求完成时隐藏loading提示
            	XHR = null;
           	},
            success: function(msg){//msg为返回的数据，在这里做数据绑定
				$("#station_combobox").css("border-color","");
				$("#station_combobox").css("border-width","");            
                fillValue(msg);
                windDirChartUpdate(100,msg.mtAdjWindDirAv);
                connect(); 
            },
			error:function(){//msg为返回的数据，在这里做数据绑定
				$("#station_combobox").css("border-color","#F6515F");
				$("#station_combobox").css("border-width","4px");
				connect();
			}
            });	  
	  }
	  
	  function windDirChartUpdate(dial_value,dial_radius){
			myChart.setDataXML("<?xml version='1.0' encoding='UTF-8' ?><Chart animation='1' upperLimit='360' lowerLimit='0' upperLimitDisplay='' lowerLimitDisplay='' gaugeStartAngle='90' bgColor='FFFFFF' bgAlpha='0' showBorder='0' majorTMNumber='12' majorTMHeight='9' minorTMNumber='5' minorTMColor='000000' minorTMHeight='3' majorTMThickness='2' gaugeInnerRadius='0' gaugeScaleAngle='360' displayValueDistance='15' chartTopMargin='30' chartLeftMargin='30' chartRightMargin='30' chartBottomMargin='30' baseFontColor='333333'><dials><dial value='"+dial_radius+"' radius='"+dial_value+"'/></dials><annotations><annotationGroup><annotation type='text' color='008000' bgColor='E1FFEA' borderColor='00B300' bold='1' x='180' y='85' label='North' /><annotation type='text' color='008000' bgColor='E1FFEA' borderColor='00B300' bold='1' x='85' y='180' label='West'/><annotation type='text' color='008000' bgColor='E1FFEA' borderColor='00B300' bold='1' x='180' y='275' label='South' /><annotation type='text' color='008000' bgColor='E1FFEA' borderColor='00B300' bold='1' x='275' y='180' label='East' /></annotationGroup></annotations></Chart>");
	  }
	
	  $(document).ready(function() {				   
	  	windDirChartUpdate(0,0);
	  	myChart.render("c_windDirChart");
		connect();
	  });
	</script>	
</head>
    
<body>
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
	</c:if>
	
<div id="tabs" class="tabbable">
  <ul class="nav nav-tabs">
    <li class="active"><a href="#tabs-display">Display</a></li>
    <li><a href="${ctx}/api/v1/monitor">Wind</a></li>
    <li><a href="temperature_rain">Temperature/Rain</a></li>
  	<div class="pull-right">
	  <select id="station_combobox">
	    <option value="">Weather Station...</option>
	    <option value="1">No.1 Station</option>
	    <option value="2">No.2 Station</option>
	    <option value="3">No.3 Station</option>
	    <option value="4">No.4 Station</option>
	    <option value="5">No.5 Station</option>
	  </select>	
  	</div>    
  </ul> 
  
  <div id="tabs-display" class="tab-pane active">
  	<div class="container-fluid">
  	  <div class="row-fluid">
		<div class="span3 positionable" id="left_part">		

		  			
			<table class="table table-bordered">
				<tr><td class="display-td-title"><div>Temperature 1</div></td></tr>
				<tr><td class="display-td-context"><div><span id="v_temperature"></span><span class="unit-fonts" style="font-family: serif;"> ℉</span></div>
				</td></tr>
			</table>
			
			<table class="table table-bordered">
				<tr><td class="display-td-title"><div>Relative Humidity</div></td></tr>
				<tr><td class="display-td-context"><div><span id="v_relative_humidity"></span><span class="unit-fonts"> %</span></div></td></tr>
			</table>	
			
			<table class="table table-bordered">
				<tr>
					<td class="display-td-title"><div>Dew Point</div></td>
					<td class="display-td-context"><div><span id="v_dew_point"></span><span class="unit-fonts" style="font-family: serif;"> ℉</span></div></td>
				</tr>
				<tr>
					<td class="display-td-title"><div>Heat Index</div></td>
					<td class="display-td-context"><div><span id="v_heat_index"></span><span class="unit-fonts" style="font-family: serif;"> ℉</span></div></td>
				</tr>
				<tr>
					<td class="display-td-title"><div>Wind Chill</div></td>
					<td class="display-td-context"><div><span id="v_wind_chill"></span><span class="unit-fonts" style="font-family: serif;"> ℉</span></div></td>
				</tr>				
			</table>	
			
			<table class="table table-bordered">
				<tr><td class="display-td-title"><div>Rain for Today</div></td></tr>
				<tr><td class="display-td-context"><div><span id="v_rainfill"></span><span class="unit-fonts"> in</span></div></td></tr>
			</table>	
			
			<table class="table table-bordered">
				<tr><td class="display-td-title"><div>Bar.Pressure</div></td></tr>
				<tr><td class="display-td-context"><div><span id="v_bar_pressure"></span><span class="unit-fonts"> in Hg</span></div></td></tr>
			</table>
			
			<div id="last-update">Updated at:<br><span id="v_updated_time"></span></div>									
		</div>
		
	  	<div class="span6 positionable" id="middle_part">
		   <div id="c_windDirChart" align="center"></div>
		   <script>
		   		var myChart = new FusionCharts("${ctx}/static/fusionchart/Charts/AngularGauge.swf", "windDirChartId", "360", "360", "0", "10");
		   </script>
		   <div class="row" style="margin-top: 67px;">
			   	<div class="span5 offset1">
					<table class="table table-bordered">
						<tr><td class="display-td-title"><div>Wind Direction</div></td></tr>
						<tr><td class="display-td-context"><div><span id="v_wind_direction"></span><span class="unit-fonts"> °</span></div></td></tr>
					</table>	
			   	</div>
			   	<div class="span5">
					<table class="table table-bordered">
						<tr><td class="display-td-title"><div>Wind Speed</div></td></tr>
						<tr><td class="display-td-context"><div><span id="v_wind_speed"></span><span class="unit-fonts"> mph</span></div></td></tr>
					</table>	
			   	</div>		   	
		   </div>
		</div>
				 
		<div class="span3 positionable" id="right_part">
				
			<table class="table table-bordered">
				<tr>
					<td class="display-td-title" colspan="2"><div>Wind Averages</div></td>
				</tr>
				<tr>
					<td class="display-td-title" colspan="2"><div>3-sec Avg</div></td>
				</tr>				
				<tr>
					<td class="display-td-context"><div><span id="v_3sec_roll_avg_wind_speed"></span><span class="unit-fonts"> mph</span></div></td>
					<td class="display-td-context"><div><span id="v_3sec_roll_avg_wind_dir"></span><span class="unit-fonts"> °</span></div></td>
				</tr>
				<tr>
					<td class="display-td-title" colspan="2"><div>2-min Avg</div></td>
				</tr>				
				<tr>
					<td class="display-td-context"><div><span id="v_2min_roll_avg_wind_speed"></span><span class="unit-fonts"> mph</span></div></td>
					<td class="display-td-context"><div><span id="v_2min_roll_avg_wind_dir"></span><span class="unit-fonts"> °</span></div></td>
				</tr>
				<tr>
					<td class="display-td-title" colspan="2"><div>10-min Avg</div></td>
				</tr>				
				<tr>
					<td class="display-td-context"><div><span id="v_10min_roll_avg_wind_speed"></span><span class="unit-fonts"> mph</span></div></td>
					<td class="display-td-context"><div><span id="v_10min_roll_avg_wind_dir"></span><span class="unit-fonts"> °</span></div></td>
				</tr>								
			</table>
			
			<table class="table table-bordered">
				<tr>
					<td class="display-td-title" colspan="2"><div>Wind Gusts</div></td>
				</tr>
				<tr>
					<td class="display-td-title" colspan="2"><div>10-min Gust</div></td>
				</tr>				
				<tr>
					<td class="display-td-context"><div><span id="v_10min_wind_gust_speed"></span><span class="unit-fonts"> mph</span></div></td>
					<td class="display-td-context"><div><span id="v_10min_wind_gust_dir"></span><span class="unit-fonts"> °</span></div></td>
				</tr>
				<tr>
					<td class="display-td-title" colspan="2"><div>1-hour Peak</div></td>
				</tr>				
				<tr>
					<td class="display-td-context"><div><span id="v_60min_wind_gust_speed"></span><span class="unit-fonts"> mph</span></div></td>
					<td class="display-td-context"><div><span id="v_60min_wind_gust_dir"></span><span class="unit-fonts"> °</span></div></td>
				</tr>							
			</table>	
			
			<table class="table table-bordered">
				<tr><td class="display-td-title"><div>Density Altitude</div></td></tr>
				<tr><td class="display-td-context"><div><span id="v_density_altitude"></span><span class="unit-fonts"> feet</span></div></td></tr>
			</table>					
		</div>
	  </div>
	</div>
  </div>
</div>
</body>
</html>
