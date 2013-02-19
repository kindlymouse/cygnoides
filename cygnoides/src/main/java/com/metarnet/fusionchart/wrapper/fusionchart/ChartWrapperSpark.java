package com.metarnet.fusionchart.wrapper.fusionchart;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.metarnet.fusionchart.core.BaseChart;
import com.metarnet.fusionchart.core.Set;
import com.metarnet.fusionchart.core.SparkChart;
import com.metarnet.fusionchart.exception.NotChartException;


public class ChartWrapperSpark implements ChartWrapper {
	private final static Logger logger = Logger.getLogger(ChartWrapperSpark.class);


	public String getDataXml(BaseChart chart,String[] colorSchemes) throws NotChartException {
		// 判断chart是否为SparkChart实例
		StringBuffer sb = null;
		if (chart instanceof SparkChart) {
			sb = new StringBuffer();
			SparkChart sparkChart = (SparkChart) chart;
			sb.append("<chart caption='" + sparkChart.getCaption()
					+ "' palette='" + sparkChart.getPalette()
					+ "' canvasLeftMargin='"
					+ sparkChart.getCanvasLeftMargin() + "'>");

			sb.append("<dataset>");
			List<Set> sets = sparkChart.getDataset().getSets();
			for (Set set : sets) {
				sb.append("<set value='" + set.getValue() + "'/>");
			}
			sb.append("</dataset>");
			sb.append("</chart>");
		} else {
			throw new NotChartException("chart为空或不是SpartChart对象");
		}
		logger.debug(sb);
		return sb.toString();
	}


	public String getDataXml(Map<String, Object> map,String key,String[] colorSchemes) throws NotChartException {
		
		SparkChart sparkChart = (SparkChart) map.get(key);
		return getDataXml(sparkChart,colorSchemes);
	}

}
