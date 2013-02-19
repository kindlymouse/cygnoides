package com.metarnet.fusionchart.core;

public class SparkChart extends SingleSeriesChart{
	protected String palette;
	protected String canvasLeftMargin;

	
	public String getPalette() {
		return palette == null?"":palette;
	}
	public void setPalette(String palette) {
		this.palette = palette;
	}
	public String getCanvasLeftMargin() {
		return canvasLeftMargin == null?"":canvasLeftMargin;
	}
	public void setCanvasLeftMargin(String canvasLeftMargin) {
		this.canvasLeftMargin = canvasLeftMargin;
	}
	
	

}
