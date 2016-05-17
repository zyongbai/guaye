package com.guaye.controller;

import java.util.Map;
import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/demo")
@Controller
public class DemoController {
	@RequestMapping("/hello")
	@ResponseBody
	public Map<String, Object> hello() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "guaye");
		
		return map;
	}
	
	@RequestMapping("/hello1")
	public String hello1() {
		
		return "hello1";
	}
}
