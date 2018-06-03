package com.backend.trics.platform.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.backend.trics.platform.api.service.TestDubbo;

@Service
public class TestDubboImpl implements TestDubbo {

	@Override
	public String getDubboString(String str) {
		System.out.println("开始调用dubbo服务=============");
		return str;
	}

}
