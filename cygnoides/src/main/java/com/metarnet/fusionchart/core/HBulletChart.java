package com.metarnet.fusionchart.core;

import java.util.ArrayList;
import java.util.List;

/**
 * 横向子弹图
 * 
 * @author ZhangpPeng
 * @createdate 2012-01-13
 * 
 */
public class HBulletChart extends BaseChart {
	protected String palette = "3";
	protected String animation = "1";
	protected String lowerLimit = "0";
	protected String upperLimit = "";
	protected String showShadow = "1";
	protected String colorRangeFillRatio = "0,10,80,10";
	protected String showColorRangeBorder = "0";
	protected String subcaption = "0";
	protected String roundRadius = "0";
	protected String numberPrefix = "";

	protected String numberSuffix = "";

	protected String showValue = "1";

	protected String value = "";
	protected String target = "";

	protected String canvasLeftMargin = "120";
	protected String canvasRightMargin = "60";
	protected String chartRightMargin = "30";

	public List<HBulletColor> colorRange;

	public HBulletChart() {
		colorRange = new ArrayList<HBulletColor>();

	}

	public String getPalette() {
		return palette;
	}

	public void setPalette(String palette) {
		this.palette = palette;
	}

	public String getAnimation() {
		return animation;
	}

	public void setAnimation(String animation) {
		this.animation = animation;
	}

	public String getLowerLimit() {
		return lowerLimit;
	}

	public void setLowerLimit(String lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public String getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(String upperLimit) {
		this.upperLimit = upperLimit;
	}

	public String getShowShadow() {
		return showShadow;
	}

	public void setShowShadow(String showShadow) {
		this.showShadow = showShadow;
	}

	public String getColorRangeFillRatio() {
		return colorRangeFillRatio;
	}

	public void setColorRangeFillRatio(String colorRangeFillRatio) {
		this.colorRangeFillRatio = colorRangeFillRatio;
	}

	public String getShowColorRangeBorder() {
		return showColorRangeBorder;
	}

	public void setShowColorRangeBorder(String showColorRangeBorder) {
		this.showColorRangeBorder = showColorRangeBorder;
	}

	public String getSubcaption() {
		return subcaption;
	}

	public void setSubcaption(String subcaption) {
		this.subcaption = subcaption;
	}

	public String getRoundRadius() {
		return roundRadius;
	}

	public void setRoundRadius(String roundRadius) {
		this.roundRadius = roundRadius;
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

	public String getShowValue() {
		return showValue;
	}

	public void setShowValue(String showValue) {
		this.showValue = showValue;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getCanvasLeftMargin() {
		return canvasLeftMargin;
	}

	public void setCanvasLeftMargin(String canvasLeftMargin) {
		this.canvasLeftMargin = canvasLeftMargin;
	}

	public List<HBulletColor> getColorRange() {
		return colorRange;
	}

	public void setColorRange(List<HBulletColor> colorRange) {
		this.colorRange = colorRange;
	}

	public void addColorRange(HBulletColor color) {
		if (this.colorRange != null)
			this.colorRange.add(color);
	}

	public HBulletChart clone() {
		return (HBulletChart) super.clone();
	}

	public String getChartRightMargin() {
		return chartRightMargin;
	}

	public void setChartRightMargin(String chartRightMargin) {
		this.chartRightMargin = chartRightMargin;
	}

	public String getCanvasRightMargin() {
		return canvasRightMargin;
	}

	public void setCanvasRightMargin(String canvasRightMargin) {
		this.canvasRightMargin = canvasRightMargin;
	}

}
