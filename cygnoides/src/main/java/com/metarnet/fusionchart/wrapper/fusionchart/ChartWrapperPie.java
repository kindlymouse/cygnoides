package com.metarnet.fusionchart.wrapper.fusionchart;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.metarnet.fusionchart.color.ChartStyleMaker;
import com.metarnet.fusionchart.core.BaseChart;
import com.metarnet.fusionchart.core.PieChart;
import com.metarnet.fusionchart.core.Set;
import com.metarnet.fusionchart.exception.NotChartException;

/**
 * 饼图包装类，转化为标准数据格式进行数据交互
 * 
 * @author ZhangPeng
 * 
 */
public class ChartWrapperPie implements ChartWrapper {
	private final static Logger logger = Logger
			.getLogger(ChartWrapperPie.class);

	private final static String[] colorSchemes = { "005C8E", "00759B",
			"0296D2", "40C7F9", "00496C", "00759B" };

	private String style = "";

	public String getDataXml(BaseChart chart, String[] colorSchemes)
			throws NotChartException {
		StringBuffer sb = null;

		sb = new StringBuffer();
		if (chart instanceof PieChart) {
			PieChart pieChart = (PieChart) chart;

			sb.append("<chart");

			// 拼装图表基础属性
			StringBuffer chartBaseAttributesXml = new StringBuffer();
			chartBaseAttributesXml.append(" caption='" + pieChart.getCaption()
					+ "'");
			if (pieChart.getClickURL() != null
					&& !pieChart.getClickURL().equals("")) {
				chartBaseAttributesXml.append(" clickURL='"
						+ pieChart.getClickURL() + "'");
			}

			// 拼装饼图属性
			StringBuffer pieChartAttributesXml = new StringBuffer();
			Field[] fields = pieChart.getClass().getDeclaredFields();
			for (Field field : fields) {
				try {
					String attributeName = field.getName();
					String methodName = attributeName.substring(0, 1)
							.toUpperCase()
							+ attributeName.substring(1);
					Method getValueMethod = pieChart.getClass().getMethod(
							"get" + methodName);
					String attributeValue = (String) getValueMethod
							.invoke(pieChart);
					if (!("".equals(attributeValue) || null == attributeValue)) {
						pieChartAttributesXml.append(" " + attributeName + "='"
								+ attributeValue + "'");
					}
				} catch (Exception e) {
					logger.error(e);
				}
			}

			sb.append(chartBaseAttributesXml);
			sb.append(pieChartAttributesXml);

			// 导出设置
			if (pieChart.getExportToServerSide()) {
				sb.append(ChartStyleMaker.makeExportXml());
			}

			sb.append(" >");

			sb.append(this.style);

			List<Set> sets = pieChart.getDataset().getSets();
			int c = 0;
			for (Set set : sets) {
				String color = "";
				if (null != colorSchemes) {
					color = colorSchemes[c];
				}
				sb.append("<set value='"
						+ set.getValue()
						+ "' label='"
						+ set.getLabel()
						+ "' color='"
						+ color
						+ "'"
						+ (set.getToolText() != null ? " toolText='"
								+ set.getToolText() + "'" : "") + "/>");
				c++;
			}
			sb.append("</chart>");
		} else {
			throw new NotChartException("chart为空或不是PieChart对象");
		}
		logger.debug(sb);
		return sb.toString();
	}

	public String getDataXml(Map<String, Object> map, String key,
			String[] colorSchemes) throws NotChartException {
		PieChart chart = (PieChart) map.get(key);
		return getDataXml(chart, colorSchemes);
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

}
