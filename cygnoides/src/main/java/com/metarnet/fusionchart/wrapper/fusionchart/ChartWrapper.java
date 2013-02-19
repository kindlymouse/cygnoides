package com.metarnet.fusionchart.wrapper.fusionchart;

import java.util.Map;

import com.metarnet.fusionchart.core.BaseChart;
import com.metarnet.fusionchart.exception.NotChartException;

public interface ChartWrapper {
	// 单图
	String getDataXml(BaseChart chart, String[] colorSchemes)
			throws NotChartException;

	// 多图
	String getDataXml(Map<String, Object> map, String key, String[] colorSchemes)
			throws NotChartException;

}
