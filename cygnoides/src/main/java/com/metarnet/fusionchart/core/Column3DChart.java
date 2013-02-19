package com.metarnet.fusionchart.core;

import java.util.ArrayList;
import java.util.List;

public class Column3DChart extends BaseChart {
	public String paletteColors = "3874B0";
	public String useRoundEdges = "1";
	public String bgAlpha = "0";
	public String showValues = "0";
	public String numberPrefix="";
	public String bgColor = "FFFFFF";
	public String canvasBgColor = "FFFFFF";
	public String alternateVGridColor = "ffffff";
	public String showBorder = "0";
	public String showYaxisValues = "1";
	public String numDivLines = "2";
	public String setAdaptiveYMin = "1";
	public String xAxisName;
	public String yAxisName;
	public String formatNumberScale = "0";
	public String showShadow = "0";
	public List<Set> sets;

	public Column3DChart() {
		sets = new ArrayList<Set>();
	}

	public void setSets(List<Set> sets) {
		this.sets = sets;
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

	public String getShowShadow() {
		return showShadow;
	}

	public void setShowShadow(String showShadow) {
		this.showShadow = showShadow;
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
	
	

}
