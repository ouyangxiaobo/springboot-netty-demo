package com.spring.netty.utils;

import com.spring.netty.protocol.protobuf.MessageBase;

import java.util.UUID;

/*
 * @ClassName
 * @Decription TOO
 * @Author HanniOvO
 */
public class MessageBaseTest {

    public static void main(String[] args) {
        MessageBase.Message message = MessageBase.Message.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setContent("hello world").build();
        System.out.println("message: "+message.toString());
    }
}
