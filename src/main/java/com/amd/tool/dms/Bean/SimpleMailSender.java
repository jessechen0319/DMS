package com.amd.tool.dms.Bean;

import java.util.Date;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SimpleMailSender {  
    public boolean sendTextMail(String targetAddress, String title, String body) {  
        MailAuthenticator authenticator = null;  
        authenticator = new MailAuthenticator("jesse_001@163.com",  "Eudcsvc7");  
        Session sendMailSession = Session  
                .getDefaultInstance(MailAuthenticator.getProperties(), authenticator);
        try {  
            Message mailMessage = new MimeMessage(sendMailSession);  
            Address from = new InternetAddress("jesse_001@163.com");  
            mailMessage.setFrom(from);  
            Address to = new InternetAddress(targetAddress);  
            mailMessage.setRecipient(Message.RecipientType.TO, to);  
            mailMessage.setSubject(title);  
            mailMessage.setSentDate(new Date());  
            String mailContent = body;  
            mailMessage.setText(mailContent);  
            Transport.send(mailMessage);  
            return true;  
        } catch (MessagingException ex) {  
            ex.printStackTrace();  
        }  
        return false;  
    }  
  
}  
