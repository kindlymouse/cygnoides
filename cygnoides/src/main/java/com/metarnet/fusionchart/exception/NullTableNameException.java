package com.metarnet.fusionchart.exception;

public class NullTableNameException extends Exception {

	private static final long serialVersionUID = 1L;

	public NullTableNameException() {
		super();
	}

	public NullTableNameException(String msg) {
		super(msg);
	}

	public NullTableNameException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NullTableNameException(Throwable cause) {
		super(cause);
	}

}
