package com.czh.labmaster.base.result;

public enum ResultCode {

	SUCCESS(200,"成功"),
	FAIL(500,"失败"),
	USER_LOGIN_ERROR1(500201,"登录失败，用户名或密码错误，请重新输入"),
	USER_LOGIN_ERROR2(500202,"登陆失败，账户不存在"),
	USER_REGISTER_ERROR(500203,"注册失败，账户已经存在");

	private Integer code;
	
	private String message; 
	
	ResultCode(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
