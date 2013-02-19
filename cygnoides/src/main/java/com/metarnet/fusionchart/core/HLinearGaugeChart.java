package com.metarnet.fusionchart.core;

import com.metarnet.fusionchart.color.ColorRange;

public class HLinearGaugeChart extends BaseChart{
	public String showShadow = "0";
	public String bgAlpha = "85";
	public String pointerBgColor="FFFFFF";
	public String pointerBorderColor="000000";
	public String pointerSides = "3";
	public String upperLimit;
	public String lowerLimit;
	public String gaugeRoundRadius = "1";
	public String chartTopMargin = "0";
	public String chartBottomMargin = "0";
	public String showTickMarks = "0";
	public String showTickValues = "0"; 
	public String ticksBelowGauge="0";
	public String showGaugeLabels = "1";
	public String showValue = "0";
	public String valueAbovePointer = "0";
	public String pointerOnTop= "1";
	public String pointerRadius= "9";
	public ColorRange colorRange;
	public String editMode = "0";
	public String value;
	
	public String getShowValue() {
		return showValue;
	}
	public void setShowValue(String showValue) {
		this.showValue = showValue;
	}
	public String getEditMode() {
		return editMode;
	}
	public void setEditMode(String editMode) {
		this.editMode = editMode;
	}
	public String getPointerSides() {
		return pointerSides;
	}
	public void setPointerSides(String pointerSides) {
		this.pointerSides = pointerSides;
	}
	public String getPointerBgColor() {
		return pointerBgColor;
	}
	public void setPointerBgColor(String pointerBgColor) {
		this.pointerBgColor = pointerBgColor;
	}
	public String getPointerBorderColor() {
		return pointerBorderColor;
	}
	public void setPointerBorderColor(String pointerBorderColor) {
		this.pointerBorderColor = pointerBorderColor;
	}
	public String getShowShadow() {
		return showShadow;
	}
	public void setShowShadow(String showShadow) {
		this.showShadow = showShadow;
	}
	public String getBgAlpha() {
		return bgAlpha;
	}
	public void setBgAlpha(String bgAlpha) {
		this.bgAlpha = bgAlpha;
	}
	public String getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(String upperLimit) {
		this.upperLimit = upperLimit;
	}
	public String getLowerLimit() {
		return lowerLimit;
	}
	public String getChartTopMargin() {
		return chartTopMargin;
	}
	public void setChartTopMargin(String chartTopMargin) {
		this.chartTopMargin = chartTopMargin;
	}
	public void setLowerLimit(String lowerLimit) {
		this.lowerLimit = lowerLimit;
	}
	public String getGaugeRoundRadius() {
		return gaugeRoundRadius;
	}
	public void setGaugeRoundRadius(String gaugeRoundRadius) {
		this.gaugeRoundRadius = gaugeRoundRadius;
	}
	public String getChartBottomMargin() {
		return chartBottomMargin;
	}
	public void setChartBottomMargin(String chartBottomMargin) {
		this.chartBottomMargin = chartBottomMargin;
	}
	public String getTicksBelowGauge() {
		return ticksBelowGauge;
	}
	public void setTicksBelowGauge(String ticksBelowGauge) {
		this.ticksBelowGauge = ticksBelowGauge;
	}
	public String getShowGaugeLabels() {
		return showGaugeLabels;
	}
	public void setShowGaugeLabels(String showGaugeLabels) {
		this.showGaugeLabels = showGaugeLabels;
	}
	public String getValueAbovePointer() {
		return valueAbovePointer;
	}
	public void setValueAbovePointer(String valueAbovePointer) {
		this.valueAbovePointer = valueAbovePointer;
	}
	public String getPointerOnTop() {
		return pointerOnTop;
	}
	public void setPointerOnTop(String pointerOnTop) {
		this.pointerOnTop = pointerOnTop;
	}
	public String getPointerRadius() {
		return pointerRadius;
	}
	public void setPointerRadius(String pointerRadius) {
		this.pointerRadius = pointerRadius;
	}
	public ColorRange getColorRange() {
		return colorRange;
	}
	public void setColorRange(ColorRange colorRange) {
		this.colorRange = colorRange;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getShowTickMarks() {
		return showTickMarks;
	}
	public void setShowTickMarks(String showTickMarks) {
		this.showTickMarks = showTickMarks;
	}
	public String getShowTickValues() {
		return showTickValues;
	}
	public void setShowTickValues(String showTickValues) {
		this.showTickValues = showTickValues;
	}
}

/*
<Chart bgColor="FFFFFF" bgAlpha="0" showBorder="0" upperLimit="100" lowerLimit="-50" gaugeRoundRadius="5" chartBottomMargin="10" ticksBelowGauge="0" showGaugeLabels="0" valueAbovePointer="0" pointerOnTop="1" pointerRadius="9">
<colorRange>
<color minValue="0" maxValue="100" name="GOOD"/>
<color minValue="35" maxValue="70" name="WEAK"/>
<color minValue="70" maxValue="100" name="BAD"/>
</colorRange>
<value>-11</value>
<styles>
<definition>
<style name="ValueFont" type="Font" bgColor="333333" size="10" color="FFFFFF"/>
</definition>
<application>
<apply toObject="VALUE" styles="valueFont"/>
</application>
</styles>
</Chart>
*/