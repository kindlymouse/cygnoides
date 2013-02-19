package com.metarnet.fusionchart.wrapper.fusionchart;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.metarnet.fusionchart.color.ChartStyleMaker;
import com.metarnet.fusionchart.core.BaseChart;
import com.metarnet.fusionchart.core.Category;
import com.metarnet.fusionchart.core.DataSet;
import com.metarnet.fusionchart.core.ScatterChart;
import com.metarnet.fusionchart.core.Set;
import com.metarnet.fusionchart.core.StackedColumn2DChart;
import com.metarnet.fusionchart.exception.NotChartException;

public class ChartWrapperScatterChart implements ChartWrapper {
	private final static Logger logger = Logger
			.getLogger(ChartWrapperScatterChart.class);

	public String getDataXml(BaseChart chart,String[] colorSchemes) throws NotChartException {
		StringBuffer sb = null;
		if (chart instanceof ScatterChart) {
			sb = new StringBuffer();
			ScatterChart scChart = (ScatterChart) chart;
			sb.append("<chart");
			if(scChart.getLabelDisplayFlag() == 1){
				sb.append(" labelDisplay='Rotate' rotateLabels='1' slantLabels='1'");
			}
			else if (scChart.getLabelDisplayFlag() == -1 ){
				sb.append(" labelDisplay='Wrap'");
			}
		    if(scChart.getExportToServerSide()){
				 sb.append(ChartStyleMaker.makeExportXml());
			}
			sb.append(" showPlotBorder='" + scChart.getShowPlotBorder() + "' ");
			sb.append(" canvasBorderThickness='"
					+ scChart.getCanvasBorderThickness() + "' ");
			sb.append(" chartLeftMargin='0' ");
			sb.append(" caption='" + scChart.getCaption()
					+ "' xAxisName='" + scChart.getXAxisName()
					+ "' yAxisName='" + scChart.getYAxisName()
					+ "' yAxisValueDecimals='"
					+ scChart.getYAxisValueDecimals() + "' showBorder='"
					+ scChart.getShowBorder() + "' bgColor='"
					+ scChart.getBgColor() + "' forceYAxisValueDecimals='"
					+ scChart.getForceYAxisValueDecimals() + "' decimals='"
					+ scChart.getDecimals() + "' useRoundEdges='"
					+ scChart.getLegendBorderAlpha() + "'" 
					+ " legendPosition='" + scChart.getLegendPosition()+"'"
					+ " showShadow='" + scChart.getShowShadow()+"'"
					+ " legendShadow='" + scChart.getLegendShadow()+"'"
					+ " formatNumberScale='" + scChart.getFormatNumberScale()+"'"
					+ " showToolTip='" + scChart.getShowToolTip() + "'"
					+ " showToolTipShadow='" + scChart.getShowToolTipShadow() + "'"
					+ " toolTipBorderColor='" + scChart.getToolTipBorderColor() + "'"
					+ " canvasBorderThickness='" + scChart.getCanvasBorderThickness() + "'"
					+ " chartLeftMargin='" + scChart.getChartLeftMargin() + "'"
					+ " chartRightMargin='" + scChart.getChartRightMargin() + "'"
					+ " chartRightMargin='" + scChart.getChartRightMargin() + "'"
					+ " yAxisMinValue='" + scChart.getyAxisMinValue() + "'"
					+ " yAxisMaxValue='" + scChart.getyAxisMaxValue() + "'"
					+ " yAxisValuesStep='" + scChart.getyAxisValuesStep() + "'"
					+ " showLegend='" + scChart.getShowLegend() + "'"
					+ " showLabels='" + scChart.getShowLabels() + "'"
					+ " labelStep='" + scChart.getLabelStep() + "'"
					+ " yAxisValuesStep='" + scChart.getxAxisValuesStep() + "'"
					+ " showRegressionLine='" + scChart.getShowRegressionLine() + "'"
					+ " rotateYAxisName='" + scChart.getRotateYAxisName() + "'"
					+ " showYAxisValues='" + scChart.getShowYAxisValues() + "'"
					+ " showDivLineValues='" + scChart.getShowDivLineValues() + "'"
					+ " canvasPadding='" + scChart.getCanvasPadding() + "'");
			if (scChart.getClickURL() != null && !scChart.getClickURL().equals("")) {
				sb.append(" clickURL='" + scChart.getClickURL() + "'");
			}
			sb.append("><categories>");
			List<Category> categories = scChart.getCategories().getCategories();
			for (Category category : categories) {
				sb.append("<category label='" + category.getLabel() + "' x='" + category.getX() + "' showVerticalLine='"+category.getShowVerticalLine()+"'/>");
			}
			sb.append("</categories>");
			List<DataSet> dataSets = scChart.getDataSets();
			for (DataSet dataSet : dataSets) {
				String renderAs = dataSet.getRenderAs() != null ? " renderAs='"+dataSet.getRenderAs()+"'" : "";
				String color = dataSet.getColor() != null ? " color='"+dataSet.getColor()+"'" : "";
				String anchorSides = dataSet.getAnchorSides() != null ? " anchorSides='"+dataSet.getAnchorSides()+"'" : "";
				String anchorRadius = dataSet.getAnchorRadius() != null ? " anchorRadius='"+dataSet.getAnchorRadius()+"'" : "";
				String anchorBgColor = dataSet.getAnchorBgColor() != null ? " anchorBgColor='"+dataSet.getAnchorBgColor()+"'" : "";
				String anchorBorderColor = dataSet.getAnchorBorderColor() != null ? " anchorBorderColor='"+dataSet.getAnchorBorderColor()+"'" : "";
				
				sb.append("<dataset seriesName='" + dataSet.getSeriesName() + "'" + renderAs + color + anchorSides + anchorRadius + anchorBgColor + anchorBorderColor + ">");
				List<Set> sets = dataSet.getSets();
				for (Set set : sets) {
					String showValue = set.getShowValue() != null ? " showValue='"+set.getShowValue()+"'" : "";
					String displayValue = set.getDisplayValue() != null ? " displayValue='"+set.getDisplayValue()+"'" : "";
					String toolText = set.getToolText() != null ? " toolText='"+set.getToolText()+"'" : "";
					sb.append("<set y='" + set.getY() + "' x='" + set.getX() + "' " + showValue + displayValue + toolText + "/>");
				}
				sb.append("</dataset>");
			}
			sb.append(ChartStyleMaker.makeCommonStyle());
			sb.append("</chart>");
		} else {
			throw new NotChartException("chart为空或不是ScatterChart对象");
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
