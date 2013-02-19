package com.metarnet.fusionchart.core;

import java.util.List;

public class LineChart extends BaseChart{
	private String paletteColors = "4F81BD";
	private String useRoundEdges = "1";
	private String bgAlpha = "0";
	private String showValues = "0";
	private String numberPrefix="";
	private String numberSuffix = "";
	private String bgColor = "FFFFFF";
	private String canvasBgColor = "FFFFFF";
	private String alternateVGridColor = "ffffff";
	private String showBorder = "0";
	private String showYaxisValues = "1";
	private String numDivLines = "2";
	private String setAdaptiveYMin = "1";
	private String xAxisName = "";
	private String yAxisName = "";
	private String canvasLeftMargin = "";
	private String canvasRightMargin = "";
	private String chartLeftMargin = "";
	private String chartRightMargin = "";
	private String canvasPadding = "";
	private String useEllipsesWhenOverflow = "";
	private String adjustDiv = "";
	private String labelPadding = "";
	private String decimals = "";
	
	private List<Set> sets;
	
	public String getLabelPadding() {
		return labelPadding;
	}

	public void setLabelPadding(String labelPadding) {
		this.labelPadding = labelPadding;
	}

	public String getAdjustDiv() {
		return adjustDiv;
	}

	public void setAdjustDiv(String adjustDiv) {
		this.adjustDiv = adjustDiv;
	}

	public String getCanvasLeftMargin() {
		return canvasLeftMargin;
	}
	
	public String getUseEllipsesWhenOverflow() {
		return useEllipsesWhenOverflow;
	}

	public void setUseEllipsesWhenOverflow(String useEllipsesWhenOverflow) {
		this.useEllipsesWhenOverflow = useEllipsesWhenOverflow;
	}

	public String getCanvasPadding() {
		return canvasPadding;
	}

	public void setCanvasPadding(String canvasPadding) {
		this.canvasPadding = canvasPadding;
	}

	public String getCanvasRightMargin() {
		return canvasRightMargin;
	}

	public void setCanvasRightMargin(String canvasRightMargin) {
		this.canvasRightMargin = canvasRightMargin;
	}

	public void setCanvasLeftMargin(String canvasLeftMargin) {
		this.canvasLeftMargin = canvasLeftMargin;
	}
	public String getChartRightMargin() {
		return chartRightMargin;
	}
	public void setChartRightMargin(String chartRightMargin) {
		this.chartRightMargin = chartRightMargin;
	}
	public String getChartLeftMargin() {
		return chartLeftMargin;
	}
	public void setChartLeftMargin(String chartLeftMargin) {
		this.chartLeftMargin = chartLeftMargin;
	}
	public String getPaletteColors() {
		return paletteColors;
	}
	public void setPaletteColors(String paletteColors) {
		this.paletteColors = paletteColors;
	}
	public String getUseRoundEdges() {
		return useRoundEdges;
	}
	public void setUseRoundEdges(String useRoundEdges) {
		this.useRoundEdges = useRoundEdges;
	}
	public String getBgAlpha() {
		return bgAlpha;
	}
	public void setBgAlpha(String bgAlpha) {
		this.bgAlpha = bgAlpha;
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
	public String getNumberSuffix() {
		return numberSuffix;
	}
	public void setNumberSuffix(String numberSuffix) {
		this.numberSuffix = numberSuffix;
	}
	public String getBgColor() {
		return bgColor;
	}
	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}
	public String getCanvasBgColor() {
		return canvasBgColor;
	}
	public void setCanvasBgColor(String canvasBgColor) {
		this.canvasBgColor = canvasBgColor;
	}
	public String getAlternateVGridColor() {
		return alternateVGridColor;
	}
	public void setAlternateVGridColor(String alternateVGridColor) {
		this.alternateVGridColor = alternateVGridColor;
	}
	public String getShowBorder() {
		return showBorder;
	}
	public void setShowBorder(String showBorder) {
		this.showBorder = showBorder;
	}
	public String getShowYaxisValues() {
		return showYaxisValues;
	}
	public void setShowYaxisValues(String showYaxisValues) {
		this.showYaxisValues = showYaxisValues;
	}
	public String getNumDivLines() {
		return numDivLines;
	}
	public void setNumDivLines(String numDivLines) {
		this.numDivLines = numDivLines;
	}
	public String getSetAdaptiveYMin() {
		return setAdaptiveYMin;
	}
	public void setSetAdaptiveYMin(String setAdaptiveYMin) {
		this.setAdaptiveYMin = setAdaptiveYMin;
	}
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
	public List<Set> getSets() {
		return sets;
	}
	public void setSets(List<Set> sets) {
		this.sets = sets;
	}

	public String getDecimals() {
		return decimals;
	}

	public void setDecimals(String decimals) {
		this.decimals = decimals;
	}
	
}
