package it.inps.eng.wscertificazionemutui.common.utils.exceptions;

public class AbstractException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String exCode;
	private String exMessage;
	private Throwable wrappedException;
	
	public AbstractException(String exCode,String exMessage,Throwable wrappedException)
	{
		super(exMessage, wrappedException);
		this.exCode = exCode;
		this.exMessage = exMessage;
		this.wrappedException = wrappedException;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getExCode() {
		return exCode;
	}

	public String getExMessage() {
		return exMessage;
	}

	public Throwable getWrappedException() {
		return wrappedException;
	}

}
