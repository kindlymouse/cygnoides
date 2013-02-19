package com.metarnet.fusionchart.core;

public class PieChart extends SingleSeriesChart {
	private String showPercentageInLabel;
	private String showValues;
	private String showLabels;
	private String showLegend = "1";
	private String bgColor = "#ffffff";
	private String showBorder = "0";
	private String formatNumberScale;
	private String pieYScale;
	private String pieSliceDepth;
	private String smartLineColor;
	private String legendPosition = "RIGHT";// RIGHT LEFT
	private String showPercentValues;
	private String useRoundEdges;
	private String pieRadius;
	private String canvasPadding;
	private String use3DLighting;
	private String slicingDistance;
	private String showShadow;
	private String legendShadow;
	private String showPlotBorder;
	private String chartLeftMargin;
	private String chartRightMargin;
	private String showZeroPies;

	private String baseFont;

	/**
	 * 0-72
	 */
	private String baseFontSize;
	private String baseFontColor;

	public String getSlicingDistance() {
		return slicingDistance;
	}

	public void setSlicingDistance(String slicingDistance) {
		this.slicingDistance = slicingDistance;
	}

	public String getUse3DLighting() {
		return use3DLighting;
	}

	public void setUse3DLighting(String use3dLighting) {
		use3DLighting = use3dLighting;
	}

	public String getCanvasPadding() {
		return canvasPadding;
	}

	public void setCanvasPadding(String canvasPadding) {
		this.canvasPadding = canvasPadding;
	}

	public String getPieRadius() {
		return pieRadius;
	}

	public void setPieRadius(String pieRadius) {
		this.pieRadius = pieRadius;
	}

	public String getUseRoundEdges() {
		return useRoundEdges;
	}

	public void setUseRoundEdges(String useRoundEdges) {
		this.useRoundEdges = useRoundEdges;
	}

	public String getLegendPosition() {
		return legendPosition;
	}

	public void setLegendPosition(String legendPosition) {
		this.legendPosition = legendPosition;
	}

	public String getShowPercentageInLabel() {
		return showPercentageInLabel;
	}

	public void setShowPercentageInLabel(String showPercentageInLabel) {
		this.showPercentageInLabel = showPercentageInLabel;
	}

	public String getShowLabels() {
		return showLabels;
	}

	public void setShowLabels(String showLabels) {
		this.showLabels = showLabels;
	}

	public String getShowLegend() {
		return showLegend;
	}

	public void setShowLegend(String showLegend) {
		this.showLegend = showLegend;
	}

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	public String getShowBorder() {
		return showBorder;
	}

	public void setShowBorder(String showBorder) {
		this.showBorder = showBorder;
	}

	public String getFormatNumberScale() {
		return formatNumberScale;
	}

	public void setFormatNumberScale(String formatNumberScale) {
		this.formatNumberScale = formatNumberScale;
	}

	public String getPieYScale() {
		return pieYScale;
	}

	public void setPieYScale(String pieYScale) {
		this.pieYScale = pieYScale;
	}

	public String getPieSliceDepth() {
		return pieSliceDepth;
	}

	public void setPieSliceDepth(String pieSliceDepth) {
		this.pieSliceDepth = pieSliceDepth;
	}

	public String getSmartLineColor() {
		return smartLineColor;
	}

	public void setSmartLineColor(String smartLineColor) {
		this.smartLineColor = smartLineColor;
	}

	public String getShowValues() {
		return showValues;
	}

	public void setShowValues(String showValues) {
		this.showValues = showValues;
	}

	public String getShowPercentValues() {
		return showPercentValues;
	}

	public void setShowPercentValues(String showPercentValues) {
		this.showPercentValues = showPercentValues;
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

	public String getShowPlotBorder() {
		return showPlotBorder;
	}

	public void setShowPlotBorder(String showPlotBorder) {
		this.showPlotBorder = showPlotBorder;
	}

	public String getChartLeftMargin() {
		return chartLeftMargin;
	}

	public void setChartLeftMargin(String chartLeftMargin) {
		this.chartLeftMargin = chartLeftMargin;
	}

	public String getChartRightMargin() {
		return chartRightMargin;
	}

	public void setChartRightMargin(String chartRightMargin) {
		this.chartRightMargin = chartRightMargin;
	}

	public String getBaseFont() {
		return baseFont;
	}

	public void setBaseFont(String baseFont) {
		this.baseFont = baseFont;
	}

	public String getBaseFontSize() {
		return baseFontSize;
	}

	public void setBaseFontSize(String baseFontSize) {
		this.baseFontSize = baseFontSize;
	}

	public String getBaseFontColor() {
		return baseFontColor;
	}

	public void setBaseFontColor(String baseFontColor) {
		this.baseFontColor = baseFontColor;
	}

	public String getShowZeroPies() {
		return showZeroPies;
	}

	public void setShowZeroPies(String showZeroPies) {
		this.showZeroPies = showZeroPies;
	}

}
