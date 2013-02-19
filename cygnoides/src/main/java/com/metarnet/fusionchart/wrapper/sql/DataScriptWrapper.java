package com.metarnet.fusionchart.wrapper.sql;

import com.metarnet.fusionchart.core.DataEntry;
import com.metarnet.fusionchart.exception.NullTableNameException;



public interface DataScriptWrapper {
	String buildDataScript(DataEntry dataEntry) throws NullTableNameException;
	String buildDataCommentsScript(DataEntry dataEntry) throws NullTableNameException;

}
