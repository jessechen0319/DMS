package com.amd.tool.dms.Bean;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator {
	private String username;
	private String password;
	
	public MailAuthenticator(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		// TODO Auto-generated method stub
		return new PasswordAuthentication("jesse_001@163.com", "Eudcsvc7");
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
    public static Properties getProperties() {  
        Properties p = new Properties();  
        p.put("mail.smtp.host", "smtp.163.com");  
        p.put("mail.smtp.port", 25);  
        p.put("mail.smtp.auth", "true");  
        return p;  
    }  
}
