package com.hsun.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsun.project1.service.MailService;

@RestController
public class MailController {
	@Autowired
	private MailService mailService;

	@RequestMapping(value = "/sendSimpleMail")
	public String sendSimpleMail() throws Exception {
		mailService.sendSimpleMail("sunhao1115@gmail.com", "Simple Mail Test",
				"Hello, this is a simple mail send by Spring boot project.");
		return "Mail Sent Success!";
	}

	@RequestMapping(value = "/sendHtmlMail")
	public String sendHtmlMail() throws Exception {
		String content="<html>\n"+"<body>\n"+"<h1>HTML Mail Title</h1>\n"+"<h3>Hello, this is a Html email send from Spring boot project</h3>\n"
	+"点击链接查看源码via github<a href='https://github.com/hsun1115/Spring-boot-mail'>Spring-boot-mail</a>"+"</body>\n"+"</html>";
		mailService.sendHtmlMail("sunhao1115@gmail.com", "Html Mail Test", content);
		return "Html Mail Send Success!";
	}
}
