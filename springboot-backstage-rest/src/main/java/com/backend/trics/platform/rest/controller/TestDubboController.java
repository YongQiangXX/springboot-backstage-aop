package com.backend.trics.platform.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.backend.trics.platform.api.service.TestDubbo;

@Controller
public class TestDubboController {
	@Reference
	private TestDubbo duboTest;

	@RequestMapping("/")
	String index() {
		System.out.println("输出信息!输出信息!......." + duboTest.getDubboString("213123"));
		return "index";
	}

}
