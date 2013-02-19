package com.metarnet.fusionchart.core;

import java.util.ArrayList;
import java.util.List;

public class DataSet {
	public List<Set> sets;
	protected String seriesName;
	/**
	 * property of ScatterChart.
	 */
	private String color;
	private String anchorSides;
	private String anchorRadius;
	private String anchorBgColor;
	private String anchorBorderColor;
	
	protected String renderAs = null;
	
	protected String parentYAxis = null;

	public String getParentYAxis() {
		return parentYAxis;
	}

	public void setParentYAxis(String parentYAxis) {
		this.parentYAxis = parentYAxis;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public void setSets(List<Set> sets) {
		this.sets = sets;
	}

	public DataSet() {
		sets = new ArrayList<Set>();
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

	public String getRenderAs() {
		return renderAs;
	}

	public void setRenderAs(String renderAs) {
		this.renderAs = renderAs;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAnchorSides() {
		return anchorSides;
	}

	public void setAnchorSides(String anchorSides) {
		this.anchorSides = anchorSides;
	}

	public String getAnchorRadius() {
		return anchorRadius;
	}

	public void setAnchorRadius(String anchorRadius) {
		this.anchorRadius = anchorRadius;
	}

	public String getAnchorBgColor() {
		return anchorBgColor;
	}

	public void setAnchorBgColor(String anchorBgColor) {
		this.anchorBgColor = anchorBgColor;
	}

	public String getAnchorBorderColor() {
		return anchorBorderColor;
	}

	public void setAnchorBorderColor(String anchorBorderColor) {
		this.anchorBorderColor = anchorBorderColor;
	}
}
