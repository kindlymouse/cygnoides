package com.metarnet.fusionchart.wrapper.fusionchart;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.metarnet.fusionchart.color.ChartStyleMaker;
import com.metarnet.fusionchart.core.BaseChart;
import com.metarnet.fusionchart.core.Category;
import com.metarnet.fusionchart.core.DataSet;
import com.metarnet.fusionchart.core.Set;
import com.metarnet.fusionchart.core.StackedColumn2DChart;
import com.metarnet.fusionchart.core.StackedColumn3DChart;
import com.metarnet.fusionchart.exception.NotChartException;

public class ChartWrapperStackedColumn3D implements ChartWrapper {
	private final static Logger logger = Logger
			.getLogger(ChartWrapperStackedColumn3D.class);

	public String getDataXml(BaseChart chart,String[] colorSchemes) throws NotChartException {
		StringBuffer sb = null;
		if (chart instanceof StackedColumn3DChart) {
			sb = new StringBuffer();
			StackedColumn3DChart scChart = (StackedColumn3DChart) chart;
			sb.append("<chart");
			if(scChart.getLabelDisplayFlag() == 1){
				sb.append(" labelDisplay='Rotate' rotateLabels='1' slantLabels='1'");
			}
			else if (scChart.getLabelDisplayFlag() == -1 ){
				sb.append(" labelDisplay='Wrap'");
			}
			sb.append(" palette='" + scChart.getPalette() + "' ");
			sb.append(" plotFillAngle='" + scChart.getPlotFillAngle() + "' ");
			sb.append(" plotFillAlpha='" + scChart.getPlotFillAlpha() + "' ");
			sb
					.append(" showPlotBorder='" + scChart.getShowPlotBorder()
							+ "' ");
			sb.append(" plotGradientColor='" + scChart.getPlotGradientColor()
					+ "' ");
			sb.append(" canvasBorderThickness='"
					+ scChart.getCanvasBorderThickness() + "' ");
			sb.append(" chartLeftMargin='0' ");
			sb.append(" paletteColors='" + scChart.getPaletteColors() + "' caption='" + scChart.getCaption()
					+ "' xAxisName='" + scChart.getXAxisName()
					+ "' yAxisName='" + scChart.getYAxisName()
					+ "' yAxisValueDecimals='"
					+ scChart.getYAxisValueDecimals() + "' showBorder='"
					+ scChart.getShowBorder() + "' bgColor='"
					+ scChart.getBgColor() + "' forceYAxisValueDecimals='"
					+ scChart.getForceYAxisValueDecimals() + "' decimals='"
					+ scChart.getDecimals() + "' useRoundEdges='"
					+ scChart.getUseRoundEdges() + "' legendBorderAlpha='"
					+ scChart.getLegendBorderAlpha() + "' showLabels='"
					+ scChart.getShowLabels() + "' showvalues='"
					+ scChart.getShowvalues() + "'" 
					+ " legendPosition='" + scChart.getLegendPosition()+"'"
					+ " showShadow='" + scChart.getShowShadow()+"'"
					+ " legendShadow='" + scChart.getLegendShadow()+"'"
					+ " formatNumberScale='" + scChart.getFormatNumberScale()+"'"
					+ " numberPrefix='" + scChart.getNumberPrefix()+"'"
					+ " numberSuffix='" + scChart.getNumberSuffix()+"'"
					+ " showToolTip='" + scChart.getShowToolTip() + "'"
					+ " showToolTipShadow='" + scChart.getShowToolTipShadow() + "'"
					+ " toolTipBorderColor='" + scChart.getToolTipBorderColor() + "'"
					+ " canvasBorderThickness='" + scChart.getCanvasBorderThickness() + "'"
					+ ">");
			sb.append("<categories>");
			List<Category> categories = scChart.getCategories().getCategories();
			for (Category category : categories) {
				sb.append("<category label='" + category.getLabel() + "' />");
			}
			sb.append("</categories>");
			List<DataSet> dataSets = scChart.getDataSets();
			for (DataSet dataSet : dataSets) {
				sb.append("<dataset seriesName='" + dataSet.getSeriesName()
						+ "'>");
				List<Set> sets = dataSet.getSets();
				for (Set set : sets) {
					sb.append("<set value='" + set.getValue() + "'/>");
				}
				sb.append("</dataset>");
			}
			sb.append(ChartStyleMaker.makeCommonStyle());
			sb.append("</chart>");
		} else {
			throw new NotChartException("chart为空或不是StackedColumn3DChart对象");
		}
		logger.debug(sb);
		return sb.toString();
	}

	public String getDataXml(Map<String, Object> map, String key,String[] colorSchemes)
			throws NotChartException {
		StackedColumn2DChart chart = (StackedColumn2DChart) map.get(key);
		return getDataXml(chart,colorSchemes);
	}

}
