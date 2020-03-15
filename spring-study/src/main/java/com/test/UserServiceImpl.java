package com.test;

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
