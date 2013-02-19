package com.metarnet.fusionchart.core;

import java.util.ArrayList;
import java.util.List;

public class ChildCategory {
	
	List<DataSet> dataSets  = new ArrayList<DataSet>();

	public List<DataSet> getDataSets() {
		return dataSets;
	}

	public void setDataSets(List<DataSet> dataSets) {
		this.dataSets = dataSets;
	}
	
	public void addDataSet(DataSet dataSet){
		this.dataSets.add(dataSet);
	}

}
