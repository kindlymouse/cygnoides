package com.metarnet.fusionchart.wrapper.fusionchart;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.metarnet.fusionchart.color.ChartStyleMaker;
import com.metarnet.fusionchart.core.BaseChart;
import com.metarnet.fusionchart.core.LineChart;
import com.metarnet.fusionchart.core.Set;
import com.metarnet.fusionchart.exception.NotChartException;

public class ChartWrapperLine implements ChartWrapper {
	private final static Logger logger = Logger
			.getLogger(ChartWrapperLine.class);

	public String getDataXml(BaseChart chart, String[] colorSchemes)
			throws NotChartException {
		StringBuffer sb = new StringBuffer();
		if (chart instanceof LineChart) {
			LineChart c2dchart = (LineChart) chart;
			sb.append("<chart ");
			if( c2dchart.getLabelDisplayFlag() == 1 ){
				sb.append(" labelDisplay='Rotate' rotateLabels='1' slantLabels='1'");
			}
			else if (c2dchart.getLabelDisplayFlag() == -1 ){
				sb.append(" labelDisplay='Wrap'");
			}
			if(c2dchart.getExportToServerSide()){
				sb.append(ChartStyleMaker.makeExportXml());
			}
			sb.append(" paletteColors='" + c2dchart.getPaletteColors()
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
						+ c2dchart.getxAxisName() + "' yAxisName='"
						+ c2dchart.getyAxisName() + "' formatNumberScale='"+c2dchart.getFormatNumberScale()+"'" 
						+ " canvasLeftMargin='" + c2dchart.getCanvasLeftMargin() + "'"
						+ " canvasRightMargin='" + c2dchart.getCanvasRightMargin() + "'"
						+ " chartLeftMargin='" + c2dchart.getChartLeftMargin() + "'"
						+ " chartRightMargin='" + c2dchart.getChartRightMargin() + "'"
						+ " canvasPadding='" + c2dchart.getCanvasPadding() + "'"
						+ " useEllipsesWhenOverflow='" + c2dchart.getUseEllipsesWhenOverflow() + "'"
						+ " adjustDiv='" + c2dchart.getAdjustDiv() + "'"
						+ " labelPadding='" + c2dchart.getLabelPadding() + "'"
						+ " numberSuffix='" + c2dchart.getNumberSuffix() + "'"
						+ " decimals='" + c2dchart.getDecimals() + "'"
						+ " yAxisMinValue='" + c2dchart.getyAxisMinValue() + "'"
						+ " yAxisMaxValue='" + c2dchart.getyAxisMaxValue() + "'"
						+ ">");
			List<Set> sets = c2dchart.getSets();
			for (Set set : sets) {
				String toolText = set.getToolText() != null ? " toolText='" + set.getToolText() + "'" : "";
				String link = set.getLink() != null ? " link='" + set.getLink() + "'" : "";
				sb.append("<set label='" + set.getLabel() + "' value='" + set.getValue() + "'" + toolText + link +"/>");
			}
			sb.append(ChartStyleMaker.makeCommonStyle());
			sb.append("</chart>");
		} else {
			throw new NotChartException("chart为空或不是LineChart对象.");
		}
		logger.debug(sb);
		return sb.toString();
	}
	
	public String getDataXml(Map<String, Object> map, String key,
			String[] colorSchemes) throws NotChartException {
		LineChart chart = (LineChart) map.get(key);
		return getDataXml(chart, colorSchemes);
	}

}
