package com.amd.tool.dms.Bean;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SimpleMailSender {  
	
	public void sendMail(String emailAddress, String title, String body) throws AddressException, MessagingException{
		
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.163.com");
	    properties.put("mail.smtp.port", 25);
	    properties.put("mail.smtp.auth", "true");
	    Authenticator authenticator = new MailAuthenticator("jesse_001@163.com", "4035535");
	    javax.mail.Session sendMailSession = javax.mail.Session.getDefaultInstance(properties, authenticator);
	    MimeMessage mailMessage = new MimeMessage(sendMailSession);
	    mailMessage.setFrom(new InternetAddress("jesse_001@163.com"));
	    mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(emailAddress));
	    mailMessage.setSubject(title, "UTF-8");
	    mailMessage.setSentDate(new Date());
	    Multipart mainPart = new MimeMultipart();
	    BodyPart html = new MimeBodyPart();
	    html.setContent(body, "text/html; charset=utf-8");
	    mainPart.addBodyPart(html);
	    mailMessage.setContent(mainPart);
	    Transport.send(mailMessage);
	}
  
} 