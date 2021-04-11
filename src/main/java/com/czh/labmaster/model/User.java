package com.czh.labmaster.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

	private Long id;
	private String username="";
	private String password="";
	private String repassword="";
	private String email="";

	@Override
	public String toString() {
		return "User{" +
						"id=" + id +
						", username='" + username + '\'' +
						", password='" + password + '\'' +
						", repassword='" + repassword + '\'' +
						", email='" + email + '\'' +
						'}';
	}
}