package com.metarnet.fusionchart.core;

public class ScatterChart extends MutilSeriesChart{
	
	private String xAxisMaxValue;
	private String xAxisMinValue ;
	private String yAxisMaxValue;
	private String yAxisMinValue;
	private String showRegressionLine = "1";
	private String labelStep = "2";
	private String xAxisValuesStep = "4";
	private String yAxisValuesStep = "1";
	private String rotateYAxisName = "1";
	private String centerYaxisName = "1";
	private String showYAxisValues = "1";
	private String showDivLineValues = "1";
	public String getxAxisMaxValue() {
		return xAxisMaxValue;
	}
	public void setxAxisMaxValue(String xAxisMaxValue) {
		this.xAxisMaxValue = xAxisMaxValue;
	}
	public String getxAxisMinValue() {
		return xAxisMinValue;
	}
	public void setxAxisMinValue(String xAxisMinValue) {
		this.xAxisMinValue = xAxisMinValue;
	}
	public String getyAxisMaxValue() {
		return yAxisMaxValue;
	}
	public void setyAxisMaxValue(String yAxisMaxValue) {
		this.yAxisMaxValue = yAxisMaxValue;
	}
	public String getyAxisMinValue() {
		return yAxisMinValue;
	}
	public void setyAxisMinValue(String yAxisMinValue) {
		this.yAxisMinValue = yAxisMinValue;
	}
	public String getShowRegressionLine() {
		return showRegressionLine;
	}
	public void setShowRegressionLine(String showRegressionLine) {
		this.showRegressionLine = showRegressionLine;
	}
	public String getLabelStep() {
		return labelStep;
	}
	public void setLabelStep(String labelStep) {
		this.labelStep = labelStep;
	}
	public String getxAxisValuesStep() {
		return xAxisValuesStep;
	}
	public void setxAxisValuesStep(String xAxisValuesStep) {
		this.xAxisValuesStep = xAxisValuesStep;
	}
	public String getyAxisValuesStep() {
		return yAxisValuesStep;
	}
	public void setyAxisValuesStep(String yAxisValuesStep) {
		this.yAxisValuesStep = yAxisValuesStep;
	}
	public String getRotateYAxisName() {
		return rotateYAxisName;
	}
	public void setRotateYAxisName(String rotateYAxisName) {
		this.rotateYAxisName = rotateYAxisName;
	}
	public String getCenterYaxisName() {
		return centerYaxisName;
	}
	public void setCenterYaxisName(String centerYaxisName) {
		this.centerYaxisName = centerYaxisName;
	}
	public String getShowYAxisValues() {
		return showYAxisValues;
	}
	public void setShowYAxisValues(String showYAxisValues) {
		this.showYAxisValues = showYAxisValues;
	}
	public String getShowDivLineValues() {
		return showDivLineValues;
	}
	public void setShowDivLineValues(String showDivLineValues) {
		this.showDivLineValues = showDivLineValues;
	}
	
}
