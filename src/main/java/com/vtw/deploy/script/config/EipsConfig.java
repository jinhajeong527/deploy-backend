package com.vtw.deploy.script.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="eips")
public class EipsConfig {
	
	private String host;
	private String username;
	private String password;
	

	public void setPassword(String password) {
		this.password = password;
	}


	public String getPassword() {
		return password;
	}


	public String getHost() {
		return host;
	}


	public void setHost(String host) {
		this.host = host;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	
}
