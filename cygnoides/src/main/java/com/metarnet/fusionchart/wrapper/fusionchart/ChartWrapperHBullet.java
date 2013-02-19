package com.metarnet.fusionchart.wrapper.fusionchart;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.metarnet.fusionchart.core.BaseChart;
import com.metarnet.fusionchart.core.HBulletChart;
import com.metarnet.fusionchart.core.HBulletColor;
import com.metarnet.fusionchart.exception.NotChartException;

/**
 * 饼图包装类，转化为标准数据格式进行数据交互
 * 
 * @author ZhangPeng
 * 
 */
public class ChartWrapperHBullet implements ChartWrapper {
	private final static Logger logger = Logger
			.getLogger(ChartWrapperHBullet.class);

	public String getDataXml(BaseChart chart, String[] colorSchemes)
			throws NotChartException {
		StringBuffer sb = null;

		sb = new StringBuffer();
		if (chart instanceof HBulletChart) {
			HBulletChart hbchart = (HBulletChart) chart;
			sb.append("<chart palette='" + hbchart.getPalette()
					+ "' animation='" + hbchart.getAnimation()
					+ "' lowerLimit='" + hbchart.getLowerLimit()
					+ "' upperLimit='" + hbchart.getUpperLimit()
					+ "' showShadow='" + hbchart.getShowShadow()
					+ "' colorRangeFillRatio='"
					+ hbchart.getColorRangeFillRatio()
					+ "' showColorRangeBorder='"
					+ hbchart.getShowColorRangeBorder() + "' subcaption='"
					+ hbchart.getSubcaption() + "' roundRadius='"
					+ hbchart.getRoundRadius() + "' numberPrefix='"
					+ hbchart.getNumberPrefix() + "' numberSuffix='"
					+ hbchart.getNumberSuffix() + "' showValue='"
					+ hbchart.getShowValue() + "' caption='"
					+ hbchart.getCaption() + "'  showBorder='"
					+ hbchart.getShowBorder() + "'  bgColor='"
					+ hbchart.getBgColor() + "' canvasLeftMargin='"
					+ hbchart.getCanvasLeftMargin() + "' chartRightMargin='"
					+ hbchart.getChartRightMargin() + "' canvasRightMargin='"
					+ hbchart.getCanvasRightMargin() + "'>");
			List<HBulletColor> crList = hbchart.getColorRange();
			if (crList.size() > 0)
				sb.append("<colorRange>");
			for (HBulletColor color : crList) {
				sb.append("<color minValue='" + color.getMinValue()
						+ "' maxValue='" + color.getMaxValue() + "'></color>");
			}
			if (crList.size() > 0)
				sb.append("</colorRange>");
			sb.append("<value>" + hbchart.getValue() + "</value>");
			if (!"".equalsIgnoreCase(hbchart.getTarget())) {
				sb.append("<target>" + hbchart.getTarget() + "</target>");
			}

			sb.append("</chart>");
		} else {
			throw new NotChartException("chart为空或不是HBulletChart对象");
		}
		logger.debug(sb);
		return sb.toString();
	}

	public String getDataXml(Map<String, Object> map, String key,
			String[] colorSchemes) throws NotChartException {
		HBulletChart chart = (HBulletChart) map.get(key);
		return getDataXml(chart, colorSchemes);
	}

}
