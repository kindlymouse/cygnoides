package com.metarnet.fusionchart.core;

import java.util.ArrayList;
import java.util.List;

public class FusionChart {
	
	protected Chart chart;
	
	protected List<Data> data;
	
	public FusionChart(){
		data = new ArrayList();
	}

	public Chart getChart() {
		return chart;
	}

	public void setChart(Chart chart) {
		this.chart = chart;
	}

	
	
	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public void addData(Data data){
		this.data.add(data);
	}

}
