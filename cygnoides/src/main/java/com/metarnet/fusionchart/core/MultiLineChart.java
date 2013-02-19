package com.metarnet.fusionchart.core;

public class MultiLineChart extends MutilSeriesChart {
	protected String xAxisName;
	protected String yAxisName;
	protected String yAxisValueDecimals = "2";
	protected String forceYAxisValueDecimals = "1";
	protected String decimals = "4";
	protected String legendPosition = "right";
	protected String showShadow = "0";
	protected String legendShadow = "0";
	protected String legendBorderAlpha = "0";
	protected String legendBorderThickness = "0";
	protected String numberPrefix = "";
	protected String numberSuffix = "";
	public String palette = "1";

	public String paletteColors = "0372AB,4E5E1F,FF8D00";
	public String plotFillAngle = "90";//
	public String plotFillAlpha = "85";// 系列图形的透明度
	public String showPlotBorder = "0";// 是否显示系列图形的边框
	protected String showLabels = "1";
	protected String showValues = "0";
	public String plotGradientColor = "";
	public String canvasBorderThickness = "1";
	public String getxAxisName() {
		return xAxisName;
	}
	public void setxAxisName(String xAxisName) {
		this.xAxisName = xAxisName;
	}
	public String getyAxisName() {
		return yAxisName;
	}
	public void setyAxisName(String yAxisName) {
		this.yAxisName = yAxisName;
	}
	public String getyAxisValueDecimals() {
		return yAxisValueDecimals;
	}
	public void setyAxisValueDecimals(String yAxisValueDecimals) {
		this.yAxisValueDecimals = yAxisValueDecimals;
	}
	public String getForceYAxisValueDecimals() {
		return forceYAxisValueDecimals;
	}
	public void setForceYAxisValueDecimals(String forceYAxisValueDecimals) {
		this.forceYAxisValueDecimals = forceYAxisValueDecimals;
	}
	public String getDecimals() {
		return decimals;
	}
	public void setDecimals(String decimals) {
		this.decimals = decimals;
	}
	public String getLegendPosition() {
		return legendPosition;
	}
	public void setLegendPosition(String legendPosition) {
		this.legendPosition = legendPosition;
	}
	public String getShowShadow() {
		return showShadow;
	}
	public void setShowShadow(String showShadow) {
		this.showShadow = showShadow;
	}
	public String getLegendShadow() {
		return legendShadow;
	}
	public void setLegendShadow(String legendShadow) {
		this.legendShadow = legendShadow;
	}
	public String getLegendBorderAlpha() {
		return legendBorderAlpha;
	}
	public void setLegendBorderAlpha(String legendBorderAlpha) {
		this.legendBorderAlpha = legendBorderAlpha;
	}
	public String getLegendBorderThickness() {
		return legendBorderThickness;
	}
	public void setLegendBorderThickness(String legendBorderThickness) {
		this.legendBorderThickness = legendBorderThickness;
	}
	public String getNumberPrefix() {
		return numberPrefix;
	}
	public void setNumberPrefix(String numberPrefix) {
		this.numberPrefix = numberPrefix;
	}
	public String getNumberSuffix() {
		return numberSuffix;
	}
	public void setNumberSuffix(String numberSuffix) {
		this.numberSuffix = numberSuffix;
	}
	public String getPalette() {
		return palette;
	}
	public void setPalette(String palette) {
		this.palette = palette;
	}
	public String getPaletteColors() {
		return paletteColors;
	}
	public void setPaletteColors(String paletteColors) {
		this.paletteColors = paletteColors;
	}
	public String getPlotFillAngle() {
		return plotFillAngle;
	}
	public void setPlotFillAngle(String plotFillAngle) {
		this.plotFillAngle = plotFillAngle;
	}
	public String getPlotFillAlpha() {
		return plotFillAlpha;
	}
	public void setPlotFillAlpha(String plotFillAlpha) {
		this.plotFillAlpha = plotFillAlpha;
	}
	public String getShowPlotBorder() {
		return showPlotBorder;
	}
	public void setShowPlotBorder(String showPlotBorder) {
		this.showPlotBorder = showPlotBorder;
	}
	public String getShowLabels() {
		return showLabels;
	}
	public void setShowLabels(String showLabels) {
		this.showLabels = showLabels;
	}
	public String getShowValues() {
		return showValues;
	}
	public void setShowValues(String showValues) {
		this.showValues = showValues;
	}
	public String getPlotGradientColor() {
		return plotGradientColor;
	}
	public void setPlotGradientColor(String plotGradientColor) {
		this.plotGradientColor = plotGradientColor;
	}
	public String getCanvasBorderThickness() {
		return canvasBorderThickness;
	}
	public void setCanvasBorderThickness(String canvasBorderThickness) {
		this.canvasBorderThickness = canvasBorderThickness;
	}

}
