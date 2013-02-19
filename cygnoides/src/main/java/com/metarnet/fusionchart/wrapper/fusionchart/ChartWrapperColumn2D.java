package com.metarnet.fusionchart.wrapper.fusionchart;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.metarnet.fusionchart.color.ChartStyleMaker;
import com.metarnet.fusionchart.core.BaseChart;
import com.metarnet.fusionchart.core.Column2DChart;
import com.metarnet.fusionchart.core.Set;

import com.metarnet.fusionchart.exception.NotChartException;

/**
 * 饼图包装类，转化为标准数据格式进行数据交互
 * 
 * @author ZhangPeng
 * 
 */
public class ChartWrapperColumn2D implements ChartWrapper {
	private final static Logger logger = Logger
			.getLogger(ChartWrapperColumn2D.class);

	public String getDataXml(BaseChart chart, String[] colorSchemes)
			throws NotChartException {
		StringBuffer sb = new StringBuffer();
		if (chart instanceof Column2DChart) {
			Column2DChart c2dchart = (Column2DChart) chart;
			sb.append("<chart");
			
			if(chart.getExportToServerSide()){
				sb.append(ChartStyleMaker.makeExportXml());
			}
			
			if (c2dchart.getLabelDisplayFlag() == 1) {
				sb.append(" labelDisplay='Rotate' rotateLabels='1' slantLabels='1'");
			}
			else if (c2dchart.getLabelDisplayFlag() == -1 ){
				sb.append(" labelDisplay='Wrap'");
			}
			if(c2dchart.getExportToServerSide()){
				sb.append(ChartStyleMaker.makeExportXml());
			}
			sb.append(" palette='" + c2dchart.getPalette() + "' ");
			sb.append(" plotFillAngle='" + c2dchart.getPlotFillAngle() + "' ");
			sb.append(" plotFillAlpha='" + c2dchart.getPlotFillAlpha() + "' ");
			sb.append(" showPlotBorder='" + c2dchart.getShowPlotBorder() + "' ");
			sb.append(" plotGradientColor='" + c2dchart.getPlotGradientColor()+ "' ");
			sb.append(" canvasBorderThickness='" + c2dchart.getCanvasBorderThickness() + "' ");
			sb.append(" chartLeftMargin='0' ");

			sb.append(" canvasBorderColor='" + c2dchart.getCanvasBorderColor()
					+ "' paletteColors='" + c2dchart.getPaletteColors()
					+ "' caption='" + c2dchart.getCaption()
					+ "' useRoundEdges='" + c2dchart.getUseRoundEdges()
					+ "' bgAlpha='" + c2dchart.getBgAlpha() + "' showValues='"
					+ c2dchart.getShowValues() + "' numberPrefix='"
					+ c2dchart.getNumberPrefix() + "' bgColor='"
					+ c2dchart.getBgColor() + "' canvasBgColor='"
					+ c2dchart.getCanvasBgColor() + "' alternateVGridColor='"
					+ c2dchart.getAlternateVGridColor() + "' showBorder='"
					+ c2dchart.getShowBorder() + "' showYaxisValues='"
					+ c2dchart.getShowYaxisValues() + "' numDivLines='"
					+ c2dchart.getNumDivLines() + "' setAdaptiveYMin='"
					+ c2dchart.getSetAdaptiveYMin() + "' xAxisName='"
					+ c2dchart.getXAxisName() + "' yAxisName='"
					+ c2dchart.getYAxisName() + "' formatNumberScale='"
					+ c2dchart.getFormatNumberScale() + "'"
							+" numberSuffix='" + c2dchart.getNumberSuffix()+ "'" 
							+">");
			List<Set> sets = c2dchart.getSets();
			for (Set set : sets) {
				sb.append("<set label='" + set.getLabel() + "' value='"
						+ set.getValue() + "' ");
				if (set.getColor() != null && !"".equalsIgnoreCase(set.getColor())) {
					sb.append(" color='" + set.getColor() + "' ");
				}
				if (set.getLink() != null && !"".equals(set.getLink())) {
					//link='JavaScript:showDetail("2012-06","20","APNew")'
					sb.append(" " + set.getLink() + " ");
				}
				sb.append("/>");
			}
			/**
			 * 生成TrendLine.
			 */
			if(chart.isBooleanTrendLines()){
				sb.append(ChartStyleMaker.makeTrendLines(chart.getTrendLineValue(),chart.getTrendLineValueTooltext()));
			}
			sb.append(ChartStyleMaker.makeCommonStyle());
			sb.append("</chart>");
		} else {
			throw new NotChartException("chart为空或不是Column2DChart对象");
		}
		logger.debug(sb);
		return sb.toString();
	}

	public String getDataXml(Map<String, Object> map, String key,
			String[] colorSchemes) throws NotChartException {
		Column2DChart chart = (Column2DChart) map.get(key);
		return getDataXml(chart, colorSchemes);
	}

}
