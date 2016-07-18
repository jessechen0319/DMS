package com.amd.tool.dms.controller;

import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amd.tool.dms.Bean.RandomUtil;
import com.amd.tool.dms.Bean.SimpleMailSender;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@RequestMapping(value = "confirm", method = RequestMethod.GET, produces = { "application/xml", "application/json" })
	@ResponseBody
	public Map<String, Object> register(HttpServletRequest request) throws AddressException, MessagingException {

		SimpleMailSender sender = new SimpleMailSender();
		Map<String, Object> result = new HashMap<String, Object>();
		String emailAddress = request.getParameter("registerEmail");
		sender.sendMail(emailAddress, "PassWord for DMS of AMD",
				"Your template password is : " + RandomUtil.generateString());
		result.put("status", true);
		return result;
	}
}
