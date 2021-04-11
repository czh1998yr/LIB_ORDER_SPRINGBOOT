package com.czh.labmaster.base.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result<T> {

	private Integer code;
	
	private String message;
	
	private T data;
	
//	登录失败
	public static <T> Result<T> failure() {
		Result<T> result = new Result<T>();
		result.setResultCode(ResultCode.FAIL);
		return result;
	}
	
	public static <T> Result<T> failure(T data) {
		Result<T> result = new Result<T>();
		result.setResultCode(ResultCode.FAIL);
		result.setData(data);
		
		return result;
	}
	
	public static <T> Result<T> failure(ResultCode resultCode) {
		Result<T> result = new Result<T>();
		result.setResultCode(resultCode);
		return result;
	}
	
	public static <T> Result<T> failure(ResultCode resultCode, T data) {
		Result<T> result = new Result<T>();
		result.setResultCode(ResultCode.FAIL);
		result.setData(data);
		
		return result;
	}
//	登录成功
	public static <T> Result<T> success() {
		Result<T> result = new Result<T>();
		result.setResultCode(ResultCode.SUCCESS);
		return result;
	}
	
	public static <T> Result<T> success(T data) {
		Result<T> result = new Result<T>();
		result.setResultCode(ResultCode.SUCCESS);
		result.setData(data);
		
		return result;
	}
	
	public void setResultCode(ResultCode resultCode) {
		this.code = resultCode.getCode();
		this.message = resultCode.getMessage();
	}

}
