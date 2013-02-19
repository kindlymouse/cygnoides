package com.metarnet.fusionchart.wrapper.fusionchart;

import java.util.List;

import org.apache.log4j.Logger;

import com.metarnet.fusionchart.color.ChartStyleMaker;
import com.metarnet.fusionchart.core.BaseChart;
import com.metarnet.fusionchart.core.Category;
import com.metarnet.fusionchart.core.DataSet;
import com.metarnet.fusionchart.core.MsCombi2DChart;
import com.metarnet.fusionchart.core.Set;
import com.metarnet.fusionchart.exception.NotChartException;

public class ChartWrapperMsCombi2D {
	private final static Logger logger = Logger
			.getLogger(ChartWrapperMsCombi2D.class);

	public String getDataXml(BaseChart chart)
			throws NotChartException {
		StringBuffer sb = new StringBuffer();
		if (chart instanceof MsCombi2DChart) {
			MsCombi2DChart c2dchart = (MsCombi2DChart) chart;
			sb.append("<chart");
			if (c2dchart.getLabelDisplayFlag() == 1) {
				sb.append(" labelDisplay='Rotate' rotateLabels='1' slantLabels='1'");
			}
			else if (c2dchart.getLabelDisplayFlag() == -1 ){
				sb.append(" labelDisplay='Wrap' ");
			}
			if(c2dchart.getExportToServerSide()){
				sb.append(ChartStyleMaker.makeExportXml());
			}
			sb.append(" palette='" + c2dchart.getPalette() + "' ");
			sb.append(" plotFillAngle='" + c2dchart.getPlotFillAngle() + "' ");
			sb.append(" plotFillAlpha='" + c2dchart.getPlotFillAlpha() + "' ");
			sb.append(" showPlotBorder='" + c2dchart.getShowPlotBorder() + "' ");
			sb.append(" plotGradientColor='" + c2dchart.getPlotGradientColor() + "' ");
			sb.append(" canvasBorderThickness='" + c2dchart.getCanvasBorderThickness() + "' ");
			sb.append(" chartLeftMargin='0' ");
			sb.append(" canvasBorderColor='" + c2dchart.getCanvasBorderColor()
					+ "' paletteColors=' " + c2dchart.getPaletteColors()
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
					+ c2dchart.getXAxisName() + "' PYAxisName='"
					+ c2dchart.getPYAxisName() + "' formatNumberScale='"
					+ c2dchart.getFormatNumberScale() + "'" 
					+ " showShadow='" + c2dchart.getShowShadow()+"'"
					+ " legendShadow='" + c2dchart.getLegendShadow()+"'"
					+ " SYAxisName='" + c2dchart.getSYAxisName()+"'"
					+ " sNumberPrefix='" + c2dchart.getsNumberPrefix() +"'"
					+ " numberSuffix='" + c2dchart.getNumberSuffix() +"'"
					+ " PYAxisMaxValue='" + c2dchart.getPYAxisMaxValue() +"'"
					+ " SYAxisMinValue='" + c2dchart.getSYAxisMinValue() +"'"
					+ " SYAxisMaxValue='" + c2dchart.getSYAxisMaxValue() +"'"
					+ " PYAxisMinValue='" + c2dchart.getPYAxisMinValue() +"'"
					+ " sNumberSuffix='" + c2dchart.getsNumberSuffix() +"'");
			if (c2dchart.getClickURL() != null
					&& !c2dchart.getClickURL().equals("")) {
				sb.append(" clickURL='" + c2dchart.getClickURL() + "'");
			}
			sb.append(" >");		
			sb.append("<categories>");
			List<Category> categories = c2dchart.getCategories().getCategories();
			for (Category category : categories) {
				sb.append("<category label='" + category.getLabel() + "' />");
			}
			sb.append("</categories>");
			List<DataSet> dataSets = c2dchart.getDataSets();
			for (DataSet dataSet : dataSets) {
				String renderAs = dataSet.getRenderAs() != null ? " renderAs='"+dataSet.getRenderAs()+"'" : "";
				String parentYAxis = dataSet.getParentYAxis() != null ? " parentYAxis='" + dataSet.getParentYAxis()+"'":"";
				sb.append("<dataset seriesName='" + dataSet.getSeriesName() + "'" + renderAs + parentYAxis + ">");
				List<Set> sets = dataSet.getSets();
				for (Set set : sets) {
					String toolText = set.getToolText() != null ? " toolText='" + set.getToolText() + "'" : "";
					String link = set.getLink() != null ? " link='" + set.getLink() + "'" : "";
					sb.append("<set value='" + set.getValue() + "'" + toolText + link + "/>");
				}
				sb.append("</dataset>");
			}
			
			sb.append(ChartStyleMaker.makeCommonStyle());
			sb.append("</chart>");
		} else {
			throw new NotChartException("chart为空或不是MsCombi2DChart对象");
		}
		logger.debug(sb);
		return sb.toString();
	}

}
