package com.spring.netty.protocol.message.encode;

import com.spring.netty.protocol.message.HeartbeatRequestPacket;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/*
 * @ClassName
 * @Decription TOO
 * @Author HanniOvO
 */
public class HeartbeatEncoder extends MessageToByteEncoder<HeartbeatRequestPacket> {

    @Override
    protected void encode(ChannelHandlerContext ctx, HeartbeatRequestPacket msg, ByteBuf out) throws Exception {
        out.writeByte(msg.getVersion());
        out.writeByte(msg.getCommand());
    }
}
