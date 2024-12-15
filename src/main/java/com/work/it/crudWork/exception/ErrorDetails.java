package com.work.it.crudWork.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	private LocalDateTime time; 
	private String message;
	private String url; 
	private String err; 
	
	public ErrorDetails() {
		
	}
	
	public ErrorDetails(LocalDateTime time, String message, String url, String err) {
		this.time = time;
		this.message = message;
		this.url = url;
		this.err = err;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getErr() {
		return err;
	}

	public void setErr(String err) {
		this.err = err;
	}
	
	
	
}
