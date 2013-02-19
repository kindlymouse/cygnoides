package com.metarnet.fusionchart.core;

import java.util.ArrayList;
import java.util.List;

import com.metarnet.fusionchart.exception.NullTableNameException;



public class DataEntry {
	// 表名
	protected String tableName;
	// 后缀sql，包括条件和排序
	protected String suffixSql;
	protected List<DataField> fieldList;

	public DataEntry(String tableName) {
		this.tableName = tableName;
		this.fieldList = new ArrayList<DataField>();
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<DataField> getFieldList() {
		return fieldList;
	}

	public void addField(DataField field) {
		fieldList.add(field);

	}

	public void removeField(DataField field) {
		fieldList.remove(field);
	}

	public void setFieldList(List<DataField> fieldList) {
		this.fieldList = fieldList;
	}

	public String getSuffixSql() {
		return suffixSql;
	}

	public void setSuffixSql(String suffixSql) {
		this.suffixSql = suffixSql;
	}
    
	public String toSQLString() throws NullTableNameException {
		StringBuffer sb = new StringBuffer();
		sb.append(" select ");
		for (DataField field : fieldList) {
			sb.append(field.getFieldName());
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

}
