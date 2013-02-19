package com.metarnet.fusionchart.core;

import java.util.ArrayList;
import java.util.List;

public class MutilSeriesChart extends BaseChart {
	protected Categories categories;
	public List<DataSet> dataSets;
	protected String xAxisName;
	protected String yAxisName;
	protected String yAxisValueDecimals = "2";
	protected String forceYAxisValueDecimals = "1";
	protected String decimals = "4";
	protected String legendBorderThickness = "0";

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public MutilSeriesChart() {
		dataSets = new ArrayList<DataSet>();
	}

	public List<DataSet> getDataSets() {
		return dataSets;
	}

	public void setDataSets(List<DataSet> dataSets) {
		this.dataSets = dataSets;
	}

	public void addDataSet(DataSet dataSet) {
		if (dataSets != null)
			dataSets.add(dataSet);

	}

	public String getXAxisName() {
		return xAxisName == null?"":xAxisName;
	}

	public void setXAxisName(String axisName) {
		xAxisName = axisName;
	}

	public String getYAxisName() {
		return yAxisName == null?"":yAxisName;
	}

	public void setYAxisName(String axisName) {
		yAxisName = axisName;
	}

	public String getYAxisValueDecimals() {
		return yAxisValueDecimals;
	}

	public void setYAxisValueDecimals(String axisValueDecimals) {
		yAxisValueDecimals = axisValueDecimals;
	}

	public String getForceYAxisValueDecimals() {
		return forceYAxisValueDecimals;
	}

	public void setForceYAxisValueDecimals(String forceYAxisValueDecimals) {
		this.forceYAxisValueDecimals = forceYAxisValueDecimals;
	}

	public String getDecimals() {
		return decimals;
	}

	public void setDecimals(String decimals) {
		this.decimals = decimals;
	}

	public String getLegendBorderThickness() {
		return legendBorderThickness;
	}

	public void setLegendBorderThickness(String legendBorderThickness) {
		this.legendBorderThickness = legendBorderThickness;
	}

}
