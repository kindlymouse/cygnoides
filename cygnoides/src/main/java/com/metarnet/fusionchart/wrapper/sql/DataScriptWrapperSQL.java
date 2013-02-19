package com.metarnet.fusionchart.wrapper.sql;

import java.util.List;

import com.metarnet.fusionchart.core.DataEntry;
import com.metarnet.fusionchart.core.DataField;
import com.metarnet.fusionchart.exception.NullTableNameException;


public class DataScriptWrapperSQL implements DataScriptWrapper {

	public String buildDataScript(DataEntry dataEntry)
			throws NullTableNameException {
		List<DataField> fieldList = dataEntry.getFieldList();
		String tableName = dataEntry.getTableName();
		String suffixSql = dataEntry.getSuffixSql();
		StringBuffer sb = new StringBuffer();
		sb.append(" select ");
		for (DataField field : fieldList) {
			sb.append(field.getFieldName());
			if (!"".equalsIgnoreCase(field.getFieldLabel())) {
				sb.append(" as " + field.getFieldLabel());
			}
			sb.append(",");
		}
		// 删除最后一个","
		sb.deleteCharAt(sb.length() - 1);
		sb.append(" from ");
		if (tableName == null || "".equalsIgnoreCase(tableName)) {
			throw new NullTableNameException("参数对象TableName为空！");
		}
		sb.append(tableName);
		if (suffixSql != null && !"".equalsIgnoreCase(suffixSql))
			sb.append(" where " + suffixSql);
		return sb.toString();
	}

	private String buildFieldJoinStr(DataEntry dataEntry)
			throws NullTableNameException {
		StringBuffer sb = new StringBuffer();
		List<DataField> fieldList = dataEntry.getFieldList();
		for (DataField field : fieldList) {

			//modify by zhangpeng at 2011/12/13
			sb.append("'" + field.getTrueFieldName() + "'");
			sb.append(",");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	public String buildDataCommentsScript(DataEntry dataEntry)
			throws NullTableNameException {
		StringBuffer sb = new StringBuffer();
		sb.append("select column_name,comments from  USER_COL_COMMENTS ");
		sb.append("where ");
		sb.append("lower(table_name)='"
				+ dataEntry.getTableName().toLowerCase() + "' ");
		String columnRanges = buildFieldJoinStr(dataEntry);
		if (columnRanges.length() > 0)
			sb.append("and lower(column_name) in("
					+ buildFieldJoinStr(dataEntry) + ")");

		return sb.toString();
	}

}
