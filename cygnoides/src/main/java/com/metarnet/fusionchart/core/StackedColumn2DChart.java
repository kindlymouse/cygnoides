package com.metarnet.fusionchart.core;

public class StackedColumn2DChart extends MutilSeriesChart {
	protected String showLabels = "1";
	protected String showValues = "0";
	protected String numberPrefix = "";
	protected String numberSuffix = "";
	protected String useRoundEdges = "0";
	protected String legendBorderAlpha = "0";
	protected String legendPosition = "right";
	protected String showShadow = "0";
	protected String legendShadow = "0";
	public String palette="1";
	public String plotFillAngle="90";//
	public String plotFillAlpha="100";//系列图形的透明度
	public String showPlotBorder="0";//是否显示系列图形的边框
	public String plotGradientColor="";
	public String paletteColors = "4572A7,AA4643,89A54E,71588F,4198AF";
	public String canvasBorderThickness="1";
	private String showYAxisValues = "1";
	private String showDivLineValues = "1";
	private String showLimits = "1";
	private String showSum = "0";
	
	public boolean combineLineY = false;
	
	public String getShowLimits() {
		return showLimits;
	}

	public void setShowLimits(String showLimits) {
		this.showLimits = showLimits;
	}

	public String getShowDivLineValues() {
		return showDivLineValues;
	}

	public void setShowDivLineValues(String showDivLineValues) {
		this.showDivLineValues = showDivLineValues;
	}

	public String getShowYAxisValues() {
		return showYAxisValues;
	}

	public void setShowYAxisValues(String showYAxisValues) {
		this.showYAxisValues = showYAxisValues;
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

	public String getNumberPrefix() {
		return numberPrefix;
	}

	public void setNumberPrefix(String numberPrefix) {
		this.numberPrefix = numberPrefix;
	}

	public String getUseRoundEdges() {
		return useRoundEdges;
	}

	public void setUseRoundEdges(String useRoundEdges) {
		this.useRoundEdges = useRoundEdges;
	}

	public String getLegendBorderAlpha() {
		return legendBorderAlpha;
	}

	public void setLegendBorderAlpha(String legendBorderAlpha) {
		this.legendBorderAlpha = legendBorderAlpha;
	}

	public String getPalette() {
		return palette;
	}

	public void setPalette(String palette) {
		this.palette = palette;
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

	public String getPlotGradientColor() {
		return plotGradientColor;
	}

	public void setPlotGradientColor(String plotGradientColor) {
		this.plotGradientColor = plotGradientColor;
	}

	public String getPaletteColors() {
		return paletteColors;
	}

	public void setPaletteColors(String paletteColors) {
		this.paletteColors = paletteColors;
	}

	public String getCanvasBorderThickness() {
		return canvasBorderThickness;
	}

	public void setCanvasBorderThickness(String canvasBorderThickness) {
		this.canvasBorderThickness = canvasBorderThickness;
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

	public String getNumberSuffix() {
		return numberSuffix;
	}

	public void setNumberSuffix(String numberSuffix) {
		this.numberSuffix = numberSuffix;
	}

	public boolean isCombineLineY() {
		return combineLineY;
	}

	public void setCombineLineY(boolean combineLineY) {
		this.combineLineY = combineLineY;
	}

	public String getShowSum() {
		return showSum;
	}

	public void setShowSum(String showSum) {
		this.showSum = showSum;
	}
	
}
