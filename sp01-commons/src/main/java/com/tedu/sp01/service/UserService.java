package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	//获取用户
	User getUser(Integer id);
	//增加用户得 积分（两个参数：一个用户id,一个增加的积分值）
	void addScore(Integer id, Integer score);
}