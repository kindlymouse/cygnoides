package com.metarnet.fusionchart.wrapper.fusionchart;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.metarnet.fusionchart.color.ColorRange;
import com.metarnet.fusionchart.color.HLinearGaugeColor;
import com.metarnet.fusionchart.core.BaseChart;
import com.metarnet.fusionchart.core.HLinearGaugeChart;
import com.metarnet.fusionchart.exception.NotChartException;

public class ChartWrapperHLinearGauge implements ChartWrapper{
	private final static Logger logger = Logger
	.getLogger(ChartWrapperHLinearGauge.class);
	
	@Override
	public String getDataXml(BaseChart chart, String[] colorSchemes)
			throws NotChartException {
		StringBuffer sb = new StringBuffer();
		if (chart instanceof HLinearGaugeChart) {
			HLinearGaugeChart c2dchart = (HLinearGaugeChart) chart;
			sb.append("<chart palette='1' gaugeBorderAlpha='30' ticksBelowGauge='1' valueAbovePointer='1' useRoundEdges='0' upperLimit='" + c2dchart.getUpperLimit()
					  +"' showShadow='" + c2dchart.getShowShadow()
					  +"' showBorder='" + c2dchart.getShowBorder()
					  +"' pointerBgColor='" + c2dchart.getPointerBgColor()
					  +"' pointerBorderColor='" + c2dchart.getPointerBorderColor()
					  +"' pointerSides='" + c2dchart.getPointerSides()
					  +"' bgColor='" + c2dchart.getBgColor() 
					  +"' bgAlpha='" + c2dchart.getBgAlpha() 
					  +"' lowerLimit='" + c2dchart.getLowerLimit()
					  +"' gaugeRoundRadius='" + c2dchart.getGaugeRoundRadius()
					  +"' chartTopMargin='" + c2dchart.getChartTopMargin()
					  +"' chartBottomMargin='" + c2dchart.getChartBottomMargin()
					  +"' ticksBelowGauge='" + c2dchart.getTicksBelowGauge() 
					  +"' showGaugeLabels='" + c2dchart.getShowGaugeLabels()
					  +"' showValue='" + c2dchart.getShowValue()
					  +"' valueAbovePointer='" + c2dchart.getValueAbovePointer()
					  +"' pointerOnTop='" + c2dchart.getPointerOnTop() 
					  +"' showTickMarks='" + c2dchart.getShowTickMarks()
					  +"' showTickValues='" + c2dchart.getShowTickValues()
					  +"' editMode='" + c2dchart.getEditMode()
					  +"' showToolTip='" + c2dchart.getShowToolTip()
					  +"' pointerRadius='" + c2dchart.getPointerRadius()+"'>");
			/*
			 * <Chart bgColor="FFFFFF" 
			 * bgAlpha="0" showBorder="0"
			 *  upperLimit="100" lowerLimit="-50" 
			 *  gaugeRoundRadius="5" chartBottomMargin="10"
			 *   ticksBelowGauge="0" showGaugeLabels="0" valueAbovePointer="0" pointerOnTop="1" pointerRadius="9">
			 * <colorRange>
				<color minValue="0" maxValue="100" name="GOOD"/>
				<color minValue="35" maxValue="70" name="WEAK"/>
				<color minValue="70" maxValue="100" name="BAD"/>
				</colorRange>
				</chart>
			 * */
			
			/* 构造标签<colorRange> */
			ColorRange colorRanges = c2dchart.getColorRange();
			List<HLinearGaugeColor> colors = colorRanges.getColors();
			StringBuffer colorSB = new StringBuffer();
			colorSB.append("<colorRange>");
			for(HLinearGaugeColor color : colors ){
				colorSB.append("<color alpha='"+color.getAlpha()+"' code='"+color.getCode()+"' minValue='"+color.getMinValue()+"' maxValue='"+color.getMaxValue()+"' name='"+color.getName()+"'/>");
			}
			colorSB.append("</colorRange>");
			sb.append(colorSB);
			sb.append("<value>" + c2dchart.getValue() + "</value>");
			
			/* 自定义Pointer */
			//sb.append("<pointer value='85' sides='4' borderColor='333333' borderThickness='3' borderAlpha='100' bgColor='FFFFFF'></pointer>");
			
			/* 自定义样式 */
			String style = "<styles>" +
	       	"<definition>" +
	       		"<style name='valueFont' type='Font' font='Arial' color='ffffff' size='12'></style>" +
	       		"<style name='labelFont' type='Font' font='Arial' color='ffffff' size='12'></style>" +
	       		"<style name='shadowStyle' type='Shadow' distance='0' strength='0'></style>" +
	       	"</definition>" +
	       	"<application>" +
	       		"<apply toObject='VALUE' styles='valueFont'></apply>"+
	       		"<apply toObject='CANVAS' styles='shadowStyle'></apply>"+
	       		"<apply toObject='GAUGELABELS' styles='labelFont'></apply>"+
	       	"</application>"+
	       "</styles>";
			sb.append(style);
			System.out.println(sb);
			sb.append("</chart>");
		} else {
			throw new NotChartException("chart为空或不是HBulletChart对象");
		}
		logger.debug(sb);
		return sb.toString();
		
	}

	@Override
	public String getDataXml(Map<String, Object> map, String key,
			String[] colorSchemes) throws NotChartException {
		return null;
	}

}
