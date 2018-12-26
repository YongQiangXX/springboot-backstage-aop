package com.backend.trics.platform.rest.MQ;

import com.backend.trics.platform.rest.MQ.ActiveManager;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

/**
 * Created by liyongqiang on 2018/12/25 下午7:44
 */
@RestController
@RequestMapping(value = "/api", produces = "application/json")
public class ProducerRest {
    /**
     * 注入ActiveManager
     */
    @Autowired
    ActiveManager activeManager;

    /**
     * 新增消息队列
     */
    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public void addQueue() {
        Destination destination = new ActiveMQQueue("beyondLiQueueTest");
        //传入队列以及值
        activeManager.send(destination, "success");
    }
    /**
     * 新增消息队列
     */
    @RequestMapping(value = "/delaySend", method = RequestMethod.GET)
    public void delaySend() {
        //传入队列以及值
        activeManager.delaySend("你好", "beyondLiQueueTest1", 3000L);
    }

}


