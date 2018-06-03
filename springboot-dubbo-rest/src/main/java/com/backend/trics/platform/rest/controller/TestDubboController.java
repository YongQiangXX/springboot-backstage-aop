package com.backend.trics.platform.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.backend.trics.platform.api.service.TestDubbo;

@RestController
public class TestDubboController {
	@Reference
	private TestDubbo duboTest;

	@RequestMapping("/")
	String index() {
		System.out.println("输出信息!输出信息!......." + duboTest.getDubboString("213123"));
		return duboTest.getDubboString("12321313");
	}

}
