package com.metarnet.fusionchart.color;


public class HLinearGaugeColor {
	private String minValue;
	private String maxValue;
	private String name;
	private String code;
	private String alpha="85";
	
	
	public HLinearGaugeColor(String minValue, String maxValue, String name) {
		super();
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.name = name;
	}
	public String getMinValue() {
		return minValue;
	}
	public void setMinValue(String minValue) {
		this.minValue = minValue;
	}
	public String getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(String maxValue) {
		this.maxValue = maxValue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAlpha() {
		return alpha;
	}
	public void setAlpha(String alpha) {
		this.alpha = alpha;
	}
	
	
}
