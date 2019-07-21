package com.spring.netty.controller;

import com.spring.netty.client.NettyClient;
import com.spring.netty.protocol.protobuf.MessageBase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/*
 * @ClassName
 * @Decription TOO
 * @Author HanniOvO
 */
@RestController
@Slf4j
public class ConsumerController {

    @Autowired
    private NettyClient nettyClient;

    @GetMapping("/send")
    public String send() {


            MessageBase.Message message = new MessageBase.Message()
                    .toBuilder().setCmd(MessageBase.Message.CommandType.NORMAL)
                    .setContent("hello netty")
                    .setRequestId(UUID.randomUUID().toString()).build();

        for (int i=0;i<1000000;i++) {


            nettyClient.sendMsg(message);
            log.info("第"+i+"次..发送数据....."+message);

        }

        return "ok";

    }
}
