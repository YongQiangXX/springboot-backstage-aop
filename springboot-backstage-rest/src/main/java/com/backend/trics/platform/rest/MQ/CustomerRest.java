package com.backend.trics.platform.rest.MQ;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by liyongqiang on 2018/12/25 下午7:46
 */
@Service
public class CustomerRest {

    @JmsListener(destination = "${activemq.trade2}")
    public void getQueue(String info) {
        System.out.println("成功监听beyondLiQueueTest消息队列，传来的值为:" + info);
    }

    @JmsListener(destination = "${activemq.trade1}")
    public void getDelayQueue(String info) {
        System.out.println("成功监听beyondLiQueueTest消息队列，传来的值为:" + info + "当前时间为" + LocalDateTime.now());
    }

}
