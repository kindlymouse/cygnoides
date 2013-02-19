package com.metarnet.fusionchart.core;

public class Category {
	protected String label;
	//property for scatterchart.
	private String x;
	////property for scatterchart.
	private String showVerticalLine;
	
	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getShowVerticalLine() {
		return showVerticalLine;
	}

	public void setShowVerticalLine(String showVerticalLine) {
		this.showVerticalLine = showVerticalLine;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
