package com.hossein.uniManS.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ApplicationExceptionDetail {
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date timeStamp;
	private int code;
	private String message;
	private String status;
	
	public ApplicationExceptionDetail() {
		this.timeStamp = new Date();
	}
	
	public ApplicationExceptionDetail(HttpStatus httpStatus, String message) {
		this();
		this.code = httpStatus.value();
		this.status = httpStatus.name();
		this.message = message;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
