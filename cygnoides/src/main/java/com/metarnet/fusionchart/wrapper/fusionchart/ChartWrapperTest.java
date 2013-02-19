package com.metarnet.fusionchart.wrapper.fusionchart;

import com.metarnet.fusionchart.core.DataSet;
import com.metarnet.fusionchart.core.Set;
import com.metarnet.fusionchart.core.SparkChart;
import com.metarnet.fusionchart.exception.NotChartException;

public class ChartWrapperTest {
	public static void testSpartChartWrapper(){
		SparkChart chart = new SparkChart();
		chart.setCaption("test");
		Set set = new Set("test");
		set.setValue("test");
		DataSet ds = new DataSet();
		ds.addSet(set);
		chart.setDataset(ds);
		ChartWrapper wrapper = new ChartWrapperSpark();
		try {
			
			wrapper.getDataXml(chart,null);
		} catch (NotChartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args){
		testSpartChartWrapper();
		
		
	}

}
