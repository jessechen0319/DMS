package com.amd.dms.test.db;

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

import org.junit.Test;

import com.amd.tool.dms.Bean.MailAuthenticator;

public class MailTest {

	@Test
	public void test() throws AddressException, MessagingException {
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.163.com");
        properties.put("mail.smtp.port", 25);
        properties.put("mail.smtp.auth", "true");
        Authenticator authenticator = new MailAuthenticator("jesse_001@163.com", "4035535");
        javax.mail.Session sendMailSession = javax.mail.Session.getDefaultInstance(properties, authenticator);
        MimeMessage mailMessage = new MimeMessage(sendMailSession);
        mailMessage.setFrom(new InternetAddress("jesse_001@163.com"));
        
        mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress("48510049@qq.com"));
        mailMessage.setSubject("jesse is here", "UTF-8");
        mailMessage.setSentDate(new Date());
        // MiniMultipart类是一个容器类，包含MimeBodyPart类型的对象
        Multipart mainPart = new MimeMultipart();
        // 创建一个包含HTML内容的MimeBodyPart
        BodyPart html = new MimeBodyPart();
        html.setContent("hello I am jesse", "text/html; charset=utf-8");
        mainPart.addBodyPart(html);
        mailMessage.setContent(mainPart);
        Transport.send(mailMessage);
	}

}
