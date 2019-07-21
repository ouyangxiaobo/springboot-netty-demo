package com.spring.netty.protocol.message;

import lombok.Data;

import static com.spring.netty.protocol.message.command.Command.HEARTBEAT_REQUEST;

/*
 * @ClassName
 * @Decription TOO
 * @Author HanniOvO
 */
@Data
public class HeartbeatRequestPacket extends Packet {

    @Override
    public Byte getCommand() {
        return HEARTBEAT_REQUEST;
    }
}
