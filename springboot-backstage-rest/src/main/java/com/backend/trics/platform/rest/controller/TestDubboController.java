package com.backend.trics.platform.rest.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.backend.trics.platform.api.service.TestDubbo;

@Controller
public class TestDubboController {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(TestDubboController.class);

	@Reference
	private TestDubbo duboTest;

	@RequestMapping("/")
	String index() {
		System.out.println("输出信息!输出信息!......." + duboTest.getDubboString("213123"));
		logger.info("===================");
		return "index";
	}

}
