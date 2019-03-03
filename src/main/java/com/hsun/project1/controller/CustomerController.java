package com.hsun.project1.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping(value = "/springboot")
public class CustomerController {
	@RequestMapping(value = "/getUserByPost", method = RequestMethod.POST)
	String getUserByPost(@RequestParam(value = "userName") String userName) {
		return "Hello  " + userName;
	}
	@RequestMapping(value = "/getUserByGet", method = RequestMethod.GET)
    String getUserByGet(@RequestParam(value = "userName") String userName){
        return "Hello " + userName;
    }
	@RequestMapping(value = "/getUserByJson", method = RequestMethod.POST)
	String getUserByJson(@RequestBody String data) {
		return "Json is " +data;
	}
}
