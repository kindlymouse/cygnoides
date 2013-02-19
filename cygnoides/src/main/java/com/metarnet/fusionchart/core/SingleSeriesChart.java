package com.metarnet.fusionchart.core;

public class SingleSeriesChart extends BaseChart{
	protected DataSet dataset;


	public DataSet getDataset() {
		if (dataset == null) {
			dataset = new DataSet();
		}
		return dataset;
	}

	public void setDataset(DataSet dataset) {
		this.dataset = dataset;
	}


}
