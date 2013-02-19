package com.metarnet.fusionchart.core;

public class BaseChart implements Cloneable {
	protected String caption = "";
	protected String showBorder = "0";
	protected String bgColor = "ffffff";
	protected String formatNumberScale = "1";
	protected String showLabels = "1";
	protected String showLegend = "1";
	protected String legendBorderAlpha = "";
	protected String legendPosition = "right";
	// 图表x轴label显示类型标志位(0:默认正常显示，1：倾斜 ,-1:垂直适应)
	protected Integer labelDisplayFlag = 0;
	protected String canvasBorderThickness = "1";
	protected String showToolTip = "1";
	protected String showToolTipShadow = "0";
	protected String toolTipBorderColor = "";
	protected String chartLeftMargin = "";
	protected String chartRightMargin = "";
	protected String showShadow = "0";
	protected String legendShadow = "0";
	protected String canvasPadding = "";
	protected String showPlotBorder = "0";
	protected String clickURL = null ;
	protected String yAxisMinValue = "";
	protected String yAxisMaxValue = "";
	protected String yAxisValuesStep = "";
	protected boolean booleanTrendLines = false;
	protected String trendLineValue = "";
	protected String trendLineValueTooltext = "";
	protected Boolean exportToServerSide = false;
	protected String exportFileName = "";
	
	public String getyAxisValuesStep() {
		return yAxisValuesStep;
	}

	public void setyAxisValuesStep(String yAxisValuesStep) {
		this.yAxisValuesStep = yAxisValuesStep;
	}

	public String getyAxisMinValue() {
		return yAxisMinValue;
	}

	public void setyAxisMinValue(String yAxisMinValue) {
		this.yAxisMinValue = yAxisMinValue;
	}

	public String getyAxisMaxValue() {
		return yAxisMaxValue;
	}

	public void setyAxisMaxValue(String yAxisMaxValue) {
		this.yAxisMaxValue = yAxisMaxValue;
	}

	public String getClickURL() {
		return clickURL;
	}

	public void setClickURL(String clickURL) {
		this.clickURL = clickURL;
	}

	public String getLegendShadow() {
		return legendShadow;
	}

	public void setLegendShadow(String legendShadow) {
		this.legendShadow = legendShadow;
	}

	public String getShowShadow() {
		return showShadow;
	}

	public void setShowShadow(String showShadow) {
		this.showShadow = showShadow;
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

	public String getShowToolTipShadow() {
		return showToolTipShadow;
	}

	public void setShowToolTipShadow(String showToolTipShadow) {
		this.showToolTipShadow = showToolTipShadow;
	}

	public String getToolTipBorderColor() {
		return toolTipBorderColor;
	}

	public void setToolTipBorderColor(String toolTipBorderColor) {
		this.toolTipBorderColor = toolTipBorderColor;
	}

	public String getCanvasBorderThickness() {
		return canvasBorderThickness;
	}

	public void setCanvasBorderThickness(String canvasBorderThickness) {
		this.canvasBorderThickness = canvasBorderThickness;
	}

	public String getShowToolTip() {
		return showToolTip;
	}

	public void setShowToolTip(String showToolTip) {
		this.showToolTip = showToolTip;
	}

	public String getLegendBorderAlpha() {
		return legendBorderAlpha;
	}

	public void setLegendBorderAlpha(String legendBorderAlpha) {
		this.legendBorderAlpha = legendBorderAlpha;
	}

	public String getFormatNumberScale() {
		return formatNumberScale;
	}

	public void setFormatNumberScale(String formatNumberScale) {
		this.formatNumberScale = formatNumberScale;
	}

	public Integer getLabelDisplayFlag() {
		return labelDisplayFlag;
	}

	public void setLabelDisplayFlag(Integer labelDisplayFlag) {
		this.labelDisplayFlag = labelDisplayFlag;
	}

	public String getShowBorder() {
		return showBorder == null ? "0" : showBorder;
	}

	public void setShowBorder(String showBorder) {
		this.showBorder = showBorder;
	}

	public String getCaption() {
		return caption == null ? "" : caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}
	

	public String getCanvasPadding() {
		return canvasPadding;
	}

	public void setCanvasPadding(String canvasPadding) {
		this.canvasPadding = canvasPadding;
	}
	
	public String getShowPlotBorder() {
		return showPlotBorder;
	}

	public void setShowPlotBorder(String showPlotBorder) {
		this.showPlotBorder = showPlotBorder;
	}
	
	public String getLegendPosition() {
		return legendPosition;
	}

	public void setLegendPosition(String legendPosition) {
		this.legendPosition = legendPosition;
	}

	public BaseChart clone() {
		try {
			return (BaseChart) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public boolean isBooleanTrendLines() {
		return booleanTrendLines;
	}

	public void setBooleanTrendLines(boolean booleanTrendLines) {
		this.booleanTrendLines = booleanTrendLines;
	}

	public String getTrendLineValue() {
		return trendLineValue;
	}

	public void setTrendLineValue(String trendLineValue) {
		this.trendLineValue = trendLineValue;
	}

	public String getTrendLineValueTooltext() {
		return trendLineValueTooltext;
	}

	public void setTrendLineValueTooltext(String trendLineValueTooltext) {
		this.trendLineValueTooltext = trendLineValueTooltext;
	}

	public Boolean getExportToServerSide() {
		return exportToServerSide;
	}

	public void setExportToServerSide(Boolean exportToServerSide) {
		this.exportToServerSide = exportToServerSide;
	}

	public String getExportFileName() {
		return exportFileName;
	}

	public void setExportFileName(String exportFileName) {
		this.exportFileName = exportFileName;
	}

	public String getShowLegend() {
		return showLegend;
	}

	public void setShowLegend(String showLegend) {
		this.showLegend = showLegend;
	}

	public String getShowLabels() {
		return showLabels;
	}

	public void setShowLabels(String showLabels) {
		this.showLabels = showLabels;
	}
}
