package com.metarnet.fusionchart.core;

public class Set {
	
    protected Integer id;
	
	protected String label;
	
	protected String value;

	protected String color;
	
	protected String setType;
	//property for scatterchart's <set> element.
	private String x;
	//property for scatterchart's <set> element.
	private String y;
	
	//是否显示Value.
	private String showValue;
	
	//显示在chart上的value
	private String displayValue;
	/**
	 * By default, FusionCharts shows the data item name and value as tool tip text for that data item. 
	 * But, if you want to display more information for the data item as tool tip, you can use this attribute to specify the same.
	 */
	private String toolText;
	
	/**
	 * That enables the end user to click on data items (columns, lines, bars etc.) and drill down to other pages. 
	 * To define the link for data items, use the link attribute. 
	 * You can define links that open in same window, new window, pop-up window or frames.
	 */
	private String link;
	
	public Set(){
		super();
	}
	
	public Set(String value) {
		this.value = value;
	}
	
	public Set(String value, String label) {
		this.value = value;
		this.label = label;
	}
	
	public Set(String label, String value, String toolText) {
		this.label = label;
		this.value = value;
		this.toolText = toolText;
	}
	public Set(String label, String value, String toolText,String link) {
		this.label = label;
		this.value = value;
		this.toolText = toolText;
		this.link = link;
	}

	public Set(Integer id, String label, String value) {
		this.id = id;
		this.label = label;
		this.value = value;
	}

	public Set(Integer id, String label, String value, String displayValue) {
		this.id = id;
		this.label = label;
		this.value = value;
		this.displayValue = displayValue;
	}
	
	public Set(String x, String y,Integer flag,String showValue,String displayValue,String toolText) {
		this.x = x;
		this.y = y;
		this.toolText = toolText;
		this.showValue = showValue;
		this.displayValue = displayValue;
	}

	public String getDisplayValue() {
		return displayValue;
	}

	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}

	public String getSetType() {
		return setType;
	}

	public void setSetType(String setType) {
		this.setType = setType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValue() {
		return value == null ? "" : value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLabel() {
		return label == null ? "" : label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getColor() {
		return color == null ? "" : color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getToolText() {
		return toolText;
	}

	public void setToolText(String toolText) {
		this.toolText = toolText;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public String getShowValue() {
		return showValue;
	}

	public void setShowValue(String showValue) {
		this.showValue = showValue;
	}
	
}
