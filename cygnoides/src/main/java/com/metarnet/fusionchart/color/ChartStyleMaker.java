package com.metarnet.fusionchart.color;


public class ChartStyleMaker {
	
	/**
	 * 生成通用的fusioncharts样式xml
	 * @return
	 */
	public static String makeCommonStyle(){
		String style = "<styles>" +
       	"<definition>" +
       		"<style name='xAixsFont' type='font' font='Microsoft YaHei' bold='0' size='14'></style>" +
       		"<style name='captionFont' type='font' font='Microsoft YaHei' bold='1' size='15'></style>" +
       		"<style name='dataLabel' type='font' font='Microsoft YaHei' bold='0' size='10'></style>" +
       		"<style name='animationX' type='ANIMATION' start='0' duration='1' param='_xscale'></style>" +
       		"<style name='animationY' type='ANIMATION' start='0' duration='2' param='_yscale'></style>" +
       	"</definition>" +
       	"<application>" +
       		"<apply toObject='DATALABELS' styles='dataLabel'></apply>"+
       		"<apply toObject='YAXISNAME' styles='xAixsFont'></apply>"+
       		"<apply toObject='XAXISNAME' styles='xAixsFont'></apply>"+
       		"<apply toObject='CAPTION' styles='captionFont'></apply>"+
       		"<apply toObject='Canvas' styles='animationX,animationY'></apply>"+
       	"</application>"+
       "</styles>";
		return style;
	}
	
	
	/**
	 * 生成PieChart的特定样式
	 */
	public static String makePieChartStyle(){
		String style = "<styles>" +
       	"<definition>" +
       		"<style name='xAixsFont' type='font' font='Microsoft YaHei' bold='0' size='10'></style>" +
       		"<style name='dataLabel' type='font' font='Microsoft YaHei' bold='0' size='10'></style>" +
       		"<style name='animationX' type='ANIMATION' start='0' duration='1' param='_xscale'></style>" +
       		"<style name='animationY' type='ANIMATION' start='0' duration='2' param='_yscale'></style>" +
       	"</definition>" + 
       	"<application>" + 
       		"<apply toObject='DATALABELS' styles='dataLabel'></apply>"+
       		"<apply toObject='YAXISNAME' styles='xAixsFont'></apply>"+
       		"<apply toObject='XAXISNAME' styles='xAixsFont'></apply>"+
       		"<apply toObject='Canvas' styles='animationX,animationY'></apply>"+
       	"</application>"+
       "</styles>";
		return style;
	}
	
	/**
	 * 生成Chart TrendLines.
	 */
	public static String makeTrendLines(String trendLineValues,String toolTexts){
		StringBuffer sb = new StringBuffer("<trendLines>");
	    String[] values = trendLineValues.split("-");
	    for (int i = 0; i < values.length; i++) {
	    	String startValue = trendLineValues.split("-")[i];
	    	sb.append("<line startValue='" + startValue + "' color='FF0000' dashed='1' />");
		}
		sb.append("</trendLines>");
		return sb.toString();
	}
	
	/**
	 * 生成通用的导入导出chart xml.
	 * @param sideFlag :client-side 2:server-side.
	 */
	/**
	 * var dataXML2 = "<chart  exportEnabled='1' exportHandler='webappPath/FcExporter'"
	    		           + " showExportDataMenuItem='1' exportDialogMessage='正在导出...' " 
	    		           + " exportFileName='2012-09_gsm_global' exportAction='save'  exportAtClient='0' "
	 */
	public static String makeExportXml(){
		//String xmlContent = " exportEnabled='1' showExportDialog='0' exportAction='save' exportAtClient='0' exportHandler='http://localhost:8088/ias/FCExporter' ";
		String xmlContent = " exportEnabled='1'  exportDialogMessage='图片传送中...' ";
		return xmlContent;
	}
	

}
