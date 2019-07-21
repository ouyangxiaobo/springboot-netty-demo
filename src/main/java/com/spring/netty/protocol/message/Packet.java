package com.spring.netty.protocol.message;

import lombok.Data;

/*
 * @ClassName
 * @Decription TOO
 * @Author HanniOvO
 */
@Data
public abstract  class Packet {

    /**
     * 版本
     */
    private Byte version = 1;

    public abstract Byte getCommand();
}
