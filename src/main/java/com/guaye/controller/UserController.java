package com.guaye.controller;

import java.util.Map;
import java.util.HashMap;
import com.guaye.pojo.User;
import com.guaye.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/insert")
	@ResponseBody
	public Map<String, Object> hello() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		User user = new User();
		user.setName("guaye1");
		
		userService.insertSelective(user);
		
		map.put("data", user);
		
		return map;
	}
}
