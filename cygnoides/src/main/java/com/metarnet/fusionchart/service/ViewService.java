package com.metarnet.fusionchart.service;

import java.util.Map;

import com.metarnet.fusionchart.core.BaseChart;
import com.metarnet.fusionchart.core.DataEntry;



/**
 * 视图服务，主要用于数据汇总视图
 * 
 * @author 张鹏
 * @create date 2011/12/1
 * 
 */
public interface ViewService {
	/**
	 * 通过SQL获取指标值列表
	 * @return Map<indId,indValue>
	 */
	Map<String,Object> getIndicatorObjectMap(DataEntry dataEntry,String dataSource,BaseChart baseChart);
	String getXmlData(DataEntry dataEntry,String dataSource,BaseChart baseChart,String[] colorSchemes,String key);
	

}
