package com.spring.netty.protocol.message.decoder;

import com.spring.netty.protocol.message.HeartbeatRequestPacket;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/*
 * @ClassName
 * @Decription TOO
 * @Author HanniOvO
 */
@Slf4j
public class HeartbeatDecoder extends ByteToMessageDecoder {
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        byte version = in.readByte();
        byte command = in.readByte();
        log.info("version : {}, command : {}", version, command);
        HeartbeatRequestPacket requestPacket = new HeartbeatRequestPacket();
        requestPacket.setVersion(version);
        out.add(requestPacket);
    }

}
