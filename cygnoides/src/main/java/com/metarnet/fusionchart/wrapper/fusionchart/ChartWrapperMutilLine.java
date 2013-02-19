package com.metarnet.fusionchart.wrapper.fusionchart;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.metarnet.fusionchart.color.ChartStyleMaker;
import com.metarnet.fusionchart.core.BaseChart;
import com.metarnet.fusionchart.core.Category;
import com.metarnet.fusionchart.core.DataSet;
import com.metarnet.fusionchart.core.MultiLineChart;
import com.metarnet.fusionchart.core.Set;
import com.metarnet.fusionchart.exception.NotChartException;

public class ChartWrapperMutilLine implements ChartWrapper {
	private final static Logger logger = Logger
			.getLogger(ChartWrapperMutilLine.class);

	public String getDataXml(BaseChart chart,String[] colorSchemes) throws NotChartException {
		StringBuffer sb = null;
		if (chart instanceof MultiLineChart) {
			sb = new StringBuffer();
			MultiLineChart lineChart = (MultiLineChart) chart;
			sb.append("<chart");
			if(lineChart.getLabelDisplayFlag() == 1){
				sb.append(" labelDisplay='Rotate' rotateLabels='1' slantLabels='1'");
			}
			else if (lineChart.getLabelDisplayFlag() == -1 ){
				sb.append(" labelDisplay='Wrap'");
			}
			if(lineChart.getExportToServerSide()){
				sb.append(ChartStyleMaker.makeExportXml());
			}
			sb.append(" palette='" + lineChart.getPalette() + "' ");
			sb.append(" plotFillAngle='" + lineChart.getPlotFillAngle() + "' ");
			sb.append(" plotFillAlpha='" + lineChart.getPlotFillAlpha() + "' ");
			sb
					.append(" showPlotBorder='" + lineChart.getShowPlotBorder()
							+ "' ");
			sb.append(" plotGradientColor='" + lineChart.getPlotGradientColor()
					+ "' ");
			sb.append(" showLabels ='"
					+ lineChart.getShowLabels() + "' ");
			sb.append(" showValues ='"
					+ lineChart.getShowValues() + "' ");
			sb.append(" canvasBorderThickness='"
					+ lineChart.getCanvasBorderThickness() + "' ");
			sb.append(" chartLeftMargin='0' ");
			sb.append(" paletteColors='" + lineChart.getPaletteColors() + "' ");
			sb.append(" caption='" + lineChart.getCaption()
					+ "' xAxisName='" + lineChart.getXAxisName()
					+ "' yAxisName='" + lineChart.getYAxisName()
					+ "' yAxisValueDecimals='"
					+ lineChart.getYAxisValueDecimals() + "' showBorder='"
					+ lineChart.getShowBorder() + "' bgColor='"
					+ lineChart.getBgColor() + "' forceYAxisValueDecimals='"
					+ lineChart.getForceYAxisValueDecimals() + "' decimals='"+lineChart.getDecimals()+"'"
					+ " legendPosition='" + lineChart.getLegendPosition()+"'"
					+ " showShadow='" + lineChart.getShowShadow()+"'"
					+ " legendShadow='" + lineChart.getLegendShadow()+"'"
					+ " legendBorderThickness='" + lineChart.getLegendBorderThickness()+"'"
					+ " numberPrefix='" + lineChart.getNumberPrefix()+"'"
					+ " numberSuffix='" + lineChart.getNumberSuffix()+"'"
					+ " formatNumberScale='" + lineChart.getFormatNumberScale()+"'"
					+ " legendBorderAlpha='" + lineChart.getLegendBorderAlpha()+"'"
					+ " canvasPadding='" + lineChart.getCanvasPadding() + "'"
					+">");
			sb.append("<categories>");
			List<Category> categories = lineChart.getCategories()
					.getCategories();
			for (Category category : categories) {
				sb.append("<category label='" + category.getLabel() + "' />");
			}
			sb.append("</categories>");
			List<DataSet> dataSets = lineChart.getDataSets();
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
			throw new NotChartException("chart为空或不是LineChart对象");
		}
		logger.debug(sb);
		return sb.toString();
	}

	public String getDataXml(Map<String, Object> map, String key,String[] colorSchemes)
			throws NotChartException {
		MultiLineChart chart = (MultiLineChart) map.get(key);
		return getDataXml(chart,colorSchemes);
	}

}
