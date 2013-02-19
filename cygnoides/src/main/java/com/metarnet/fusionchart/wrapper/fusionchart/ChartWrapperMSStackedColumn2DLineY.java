package com.metarnet.fusionchart.wrapper.fusionchart;

import java.util.List;

import org.apache.log4j.Logger;

import com.metarnet.fusionchart.color.ChartStyleMaker;
import com.metarnet.fusionchart.core.BaseChart;
import com.metarnet.fusionchart.core.Category;
import com.metarnet.fusionchart.core.ChildCategory;
import com.metarnet.fusionchart.core.DataSet;
import com.metarnet.fusionchart.core.MSStackedColumn2DLineDYChart;
import com.metarnet.fusionchart.exception.NotChartException;

public class ChartWrapperMSStackedColumn2DLineY {
	private final static Logger logger = Logger
			.getLogger(ChartWrapperMSStackedColumn2DLineY.class);

	public String getDataXml(BaseChart bchart)
			throws NotChartException {
		StringBuffer sb = new StringBuffer();
		if (bchart instanceof MSStackedColumn2DLineDYChart) {
			MSStackedColumn2DLineDYChart chart = (MSStackedColumn2DLineDYChart) bchart;
			sb.append("<chart ");
			if (chart.getLabelDisplayFlag() == 1) {
				sb.append(" labelDisplay='Rotate' rotateLabels='1' slantLabels='1'");
			}
			else if (chart.getLabelDisplayFlag() == -1 ){
				sb.append(" labelDisplay='Wrap'");
			}
			if(chart.getExportToServerSide()){
				sb.append(ChartStyleMaker.makeExportXml());
			}
			sb.append(" canvasBorderThickness='" + chart.getCanvasBorderThickness() + "' ");
			sb.append(" showShadow='" + chart.getShowShadow()+"'"
					+ " formatNumberScale='"+chart.getFormatNumberScale()+"'"
					+ " PYAxisName='" + chart.getPYAxisName()+"'"
					+ " SYAXisName='" + chart.getSYAXisName()+"'"
					+ " legendShadow='" + chart.getLegendShadow()+"'"
					+ " numberSuffix ='" + chart.getNumberSuffix()+"'"
					+ " showValues ='" + chart.getShowValues()+"'"
					+ ">");
			//<categories>
			sb.append("<categories>");
			List<Category> categories = chart.getCategories().getCategories();
			for (Category category : categories) {
				sb.append("<category label='" + category.getLabel() + "' />");
			}
			sb.append("</categories>");
			
			
			/**
			 * <dataset>
			 *   <dataset></dataset>
			 *   <dataset></dataset>
			 *   <dataset></dataset>
			 * </dataset>
			 * <dataset>
			 *   <dataset></dataset>
			 *   <dataset></dataset>
			 *   <dataset></dataset>
			 * </dataset>
			 */
			List<ChildCategory> childCategories = chart.getChildCategories();
			for( int i = 0;i<childCategories.size();i++){
				List<DataSet> totalDataSets = childCategories.get(i).getDataSets();
				sb.append("<dataset>");
					for(int j = 0;j<totalDataSets.size();j++){
						DataSet dataSet = totalDataSets.get(j);
						sb.append("<dataset seriesName='" + dataSet.getSeriesName()+"'>");
										for(int k = 0 ;k<dataSet.getSets().size();k++){
											//String a = dataSet.getSets().get(k).getValue();
											sb.append("<set value='"+ (!"".equals(dataSet.getSets().get(k).getValue())?dataSet.getSets().get(k).getValue():"0") +"'/>");
										}
						sb.append("</dataset>");
					}
				sb.append("</dataset>");
			}
			
			DataSet lineSet = chart.getLineSet();
			sb.append("<lineset seriesname='本月不均衡小区个数' showValues='0'>");
			for(int m=0;m<lineSet.getSets().size();m++){
				sb.append("<set value='"+ lineSet.getSets().get(m).getValue()+"'/>");
			}
			sb.append("</lineset>");
			//sb.append(ChartStyleMaker.makeCommonStyle());
			sb.append("</chart>");
		} else {
			throw new NotChartException("chart为空或不是MSStackedColumn2DLineDYChart对象");
		}
		logger.debug(sb);
		return sb.toString();
	}

}
