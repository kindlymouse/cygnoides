package com.metarnet.fusionchart.core;

import java.util.ArrayList;
import java.util.List;

public class Column2DChart extends BaseChart {
	public String palette="1";
	public String plotFillAngle="90";//
	public String plotFillAlpha="100";//系列图形的透明度
	public String showPlotBorder="0";//是否显示系列图形的边框
	public String plotGradientColor="4F81BD";
	//0372AB
	public String paletteColors = "4F81BD";
	public String useRoundEdges = "0";
	public String bgAlpha = "0";
	public String showValues = "0";
	public String numberPrefix = "";
	public String numberSuffix = "";
	public String bgColor = "FFFFFF";
	public String canvasBgColor = "FFFFFF";
	public String canvasBorderColor = "cccccc";
	public String canvasBorderThickness="1";
	public String alternateVGridColor = "ffffff";
	public String showBorder = "0";
	public String showYaxisValues = "1";
	public String numDivLines = "2";
	public String setAdaptiveYMin = "1";
	public String xAxisName = "";
	public String yAxisName = "";
	public String formatNumberScale = "0";
	// 图表类型简写,eg:TDNew(新建TD基站类型)
	public String chartType;

	public List<Set> sets;

	public Column2DChart() {
		sets = new ArrayList<Set>();
	}

	public void setSets(List<Set> sets) {
		this.sets = sets;
	}

	public void addSet(Set set) {
		sets.add(set);
	}

	public void removeSet(Set set) {
		sets.remove(set);
	}

	public List<Set> getSets() {
		return sets;
	}

	public void setSet(List<Set> sets) {
		this.sets = sets;
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

	public String getXAxisName() {
		return xAxisName;
	}

	public void setXAxisName(String axisName) {
		xAxisName = axisName;
	}

	public String getYAxisName() {
		return yAxisName;
	}

	public void setYAxisName(String axisName) {
		yAxisName = axisName;
	}

	public String getFormatNumberScale() {
		return formatNumberScale;
	}

	public void setFormatNumberScale(String formatNumberScale) {
		this.formatNumberScale = formatNumberScale;
	}

	public String getCanvasBorderColor() {
		return canvasBorderColor;
	}

	public void setCanvasBorderColor(String canvasBorderColor) {
		this.canvasBorderColor = canvasBorderColor;
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

	public String getCanvasBorderThickness() {
		return canvasBorderThickness;
	}

	public void setCanvasBorderThickness(String canvasBorderThickness) {
		this.canvasBorderThickness = canvasBorderThickness;
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

	public String getChartType() {
		return chartType;
	}

	public void setChartType(String chartType) {
		this.chartType = chartType;
	}

	public String getNumberSuffix() {
		return numberSuffix;
	}

	public void setNumberSuffix(String numberSuffix) {
		this.numberSuffix = numberSuffix;
	}
}
