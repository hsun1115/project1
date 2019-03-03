package com.hsun.project1.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {
	@Autowired
	private MailService MailService;
	
	@Test
	public void testSimpleMail() throws Exception{
		MailService.sendSimpleMail("sunhao1115@gmail.com", "Simple Mail Test", "Hello, this is a simple mail send by Spring boot project.");
	}
}
