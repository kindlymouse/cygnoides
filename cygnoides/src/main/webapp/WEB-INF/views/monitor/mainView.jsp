<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>实时气象信息</title>

	<style>
	  .positionable{
	  	//background: gray;
	  }
	  
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
	  	//color: #FF6940;
	  	color: #FFA400;
	  }
	  
	  #last-update{
	  	padding-top: 10px;
	  	padding-bottom: 10px;
	  	text-align: center;
	  	font-weight:bolder;
	  	//background-color: #FAFFAE;
	  }
	  
	  .unit-fonts{
	  	font-size: medium;
	  	font-weight: bold;
	  	color: green;	  	
	  }
	</style>	
	
	<script>
	  function fillValue(){
	  	//left part
	  	$("#v_temperature").html('34');
		$("#v_relative_humidity").html('34');
		$("#v_dew_point").html('34');
		$("#v_heat_index").html('34');
		$("#v_wind_chill").html('34');
		$("#v_rainfill").html('34');
		$("#v_bar_pressure").html('34');
		
		//middle part
		$("#v_wind_direction").html('34');
		$("#v_wind_speed").html('34');
		$("#v_temperature").html('34');
		$("#v_temperature").html('34');
		$("#v_temperature").html('34');
		$("#v_temperature").html('34');		
		
		//last update time
		$("#v_updated_time").html('2012-02-11 22:32:30');
	  }
	
	  $(document).ready(function() {
		fillValue();
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
    <li><a href="/monitor/wind">Wind</a></li>
    <li><a href="/monitor/temperature_rain">Temperature/Rain</a></li>
  </ul>
  
  <div id="tabs-display" class="tab-pane active">
  	<div class="container-fluid">
  	  <div class="row-fluid">
		<div class="span3 positionable" id="left_part">
			<table class="table table-bordered">
				<tr><td class="display-td-title"><div>Temperature 1</div></td></tr>
				<tr><td class="display-td-context"><div><span id="v_temperature"></span> <span class="unit-fonts" style="font-family: serif;">℉</span></div>
				</td></tr>
			</table>
			
			<table class="table table-bordered">
				<tr><td class="display-td-title"><div>Relative Humidity</div></td></tr>
				<tr><td class="display-td-context"><div><span id="v_relative_humidity"></span> <span class="unit-fonts">%</span></div></td></tr>
			</table>	
			
			<table class="table table-bordered">
				<tr>
					<td class="display-td-title"><div>Dew Point</div></td>
					<td class="display-td-context"><div><span id="v_dew_point"></span> <span class="unit-fonts" style="font-family: serif;">℉</span></div></td>
				</tr>
				<tr>
					<td class="display-td-title"><div>Heat Index</div></td>
					<td class="display-td-context"><div><span id="v_heat_index"></span> <span class="unit-fonts" style="font-family: serif;">℉</span></div></td>
				</tr>
				<tr>
					<td class="display-td-title"><div>Wind Chill</div></td>
					<td class="display-td-context"><div><span id="v_wind_chill"></span> <span class="unit-fonts" style="font-family: serif;">℉</span></div></td>
				</tr>				
			</table>	
			
			<table class="table table-bordered">
				<tr><td class="display-td-title"><div>Rain for Today</div></td></tr>
				<tr><td class="display-td-context"><div><span id="v_rainfill"></span> <span class="unit-fonts">in</span></div></td></tr>
			</table>	
			
			<table class="table table-bordered">
				<tr><td class="display-td-title"><div>Bar.Pressure</div></td></tr>
				<tr><td class="display-td-context"><div><span id="v_bar_pressure"></span> <span class="unit-fonts">in Hg</span></div></td></tr>
			</table>
			
			<div id="last-update">Updated at:<br><span id="v_updated_time"></span></div>									
		</div>
		
	  	<div class="span6 positionable" id="middle_part">
			<div id="chartdiv" align="center"></div>
			<script type="text/javascript">
				var myChart = new FusionCharts("${ctx}/static/fusionchart/Charts/AngularGauge.swf", "myChartId", "360", "360", "0", "10");
				myChart.setDataURL("${ctx}/static/fusionchart/Data/Angular8.xml");
				myChart.render("chartdiv");
		   </script>
		   <div class="row" style="margin-top: 67px;">
			   	<div class="span5 offset1">
					<table class="table table-bordered">
						<tr><td class="display-td-title"><div>Wind Direction</div></td></tr>
						<tr><td class="display-td-context"><div><span id="v_wind_direction"></span> <span class="unit-fonts">°</span></div></td></tr>
					</table>	
			   	</div>
			   	<div class="span5">
					<table class="table table-bordered">
						<tr><td class="display-td-title"><div>Wind Speed</div></td></tr>
						<tr><td class="display-td-context"><div><span id="v_wind_speed"></span> <span class="unit-fonts">mph</span></div></td></tr>
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
					<td class="display-td-context"><div>7.2 <span class="unit-fonts">mph</span></div></td>
					<td class="display-td-context"><div>7.1 <span class="unit-fonts">°</span></div></td>
				</tr>
				<tr>
					<td class="display-td-title" colspan="2"><div>2-min Avg</div></td>
				</tr>				
				<tr>
					<td class="display-td-context"><div>7.2 <span class="unit-fonts">mph</span></div></td>
					<td class="display-td-context"><div>7.1 <span class="unit-fonts">°</span></div></td>
				</tr>
				<tr>
					<td class="display-td-title" colspan="2"><div>10-min Avg</div></td>
				</tr>				
				<tr>
					<td class="display-td-context"><div>7.2 <span class="unit-fonts">mph</span></div></td>
					<td class="display-td-context"><div>7.1 <span class="unit-fonts">°</span></div></td>
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
					<td class="display-td-context"><div></div></td>
					<td class="display-td-context"><div>7.1</div></td>
				</tr>
				<tr>
					<td class="display-td-title" colspan="2"><div>1-hour Peak</div></td>
				</tr>				
				<tr>
					<td class="display-td-context"><div></div></td>
					<td class="display-td-context"><div>7.1</div></td>
				</tr>							
			</table>	
			
			<table class="table table-bordered">
				<tr><td class="display-td-title"><div>Density Altitude</div></td></tr>
				<tr><td class="display-td-context"><div>7.1 m</div></td></tr>
			</table>					
		</div>
	  </div>
	</div>
  </div>
</div>
</body>
</html>
