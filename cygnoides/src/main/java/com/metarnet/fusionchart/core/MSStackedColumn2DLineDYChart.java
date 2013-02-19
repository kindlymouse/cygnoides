package com.metarnet.fusionchart.core;

import java.util.ArrayList;
import java.util.List;

public class MSStackedColumn2DLineDYChart extends BaseChart {
	protected Categories categories;
	public List<ChildCategory> childCategories = new ArrayList<ChildCategory>();
	protected String xAxisName;
	protected String yAxisName;
	private String PYAxisName;
	private String SYAXisName;
	private String showValues="0";
	private String numberSuffix = "";
	private DataSet lineSet = new DataSet();
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	public List<ChildCategory> getChildCategories() {
		return childCategories;
	}
	public void setChildCategories(List<ChildCategory> childCategories) {
		this.childCategories = childCategories;
	}
	
	public void addChildCategory(ChildCategory childCategory){
		this.childCategories.add(childCategory);
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
	public DataSet getLineSet() {
		return lineSet;
	}
	public void setLineSet(DataSet lineSet) {
		this.lineSet = lineSet;
	}
	public String getPYAxisName() {
		return PYAxisName;
	}
	public void setPYAxisName(String pYAxisName) {
		PYAxisName = pYAxisName;
	}
	public String getSYAXisName() {
		return SYAXisName;
	}
	public void setSYAXisName(String sYAXisName) {
		SYAXisName = sYAXisName;
	}
	public String getNumberSuffix() {
		return numberSuffix;
	}
	public void setNumberSuffix(String numberSuffix) {
		this.numberSuffix = numberSuffix;
	}
	public String getShowValues() {
		return showValues;
	}
	public void setShowValues(String showValues) {
		this.showValues = showValues;
	}
}
