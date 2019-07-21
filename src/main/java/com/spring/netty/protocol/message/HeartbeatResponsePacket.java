package com.spring.netty.protocol.message;

import com.spring.netty.protocol.message.command.Command;
import lombok.Data;

/*
 * @ClassName
 * @Decription TOO
 * @Author HanniOvO
 * @Date 2019/7/21 15:08
 */
@Data
public class HeartbeatResponsePacket extends Packet {

    @Override
    public Byte getCommand() {
        return Command.HEARTBEAT_RESPONSE;
    }
}
