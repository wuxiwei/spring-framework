package com.test.impl;

import com.test.api.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wuxiwei
 * @date 2020/3/15
 */
@Service
public class UserServiceImpl implements UserService {
	@Override
	public String hello() {
		return "hello";
	}
}
