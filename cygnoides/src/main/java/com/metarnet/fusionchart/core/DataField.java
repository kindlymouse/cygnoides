package com.metarnet.fusionchart.core;

public class DataField {
	protected String fieldLabel;
	protected String fieldName;
	protected String trueFieldName;
	protected String fieldTitle;

	public DataField(String fieldName) {
		this.fieldName = fieldName;
	}

	public DataField(String fieldName, String fieldTitle) {
		this.fieldName = fieldName;
		this.fieldTitle = fieldTitle;
	}

	public String getFieldLabel() {
		return fieldLabel == null?"":fieldLabel;
	}

	public void setFieldLabel(String fieldLabel) {
		this.fieldLabel = fieldLabel;
	}

	public String getFieldName() {
		return fieldName == null?"":fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldTitle() {
		return fieldTitle == null?"":fieldTitle;
	}

	public void setFieldTitle(String fieldTitle) {
		this.fieldTitle = fieldTitle;
	}

	public String getTrueFieldName() {
		//如果trueFieldName为空时，返回fieldName
		return (trueFieldName == null || "".equalsIgnoreCase(trueFieldName))?fieldName:trueFieldName;
	}

	public void setTrueFieldName(String trueFieldName) {
		this.trueFieldName = trueFieldName;
	}
	
	

}
