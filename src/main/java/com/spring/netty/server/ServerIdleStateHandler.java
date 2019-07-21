package com.spring.netty.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.handler.timeout.IdleStateHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/*
 * @ClassName
 * @Decription TOO 心跳空闲检测机制
 * @Author HanniOvO
 */
@Slf4j
public class ServerIdleStateHandler extends IdleStateHandler {

    /**
     * 设置空闲检测时间为 30s
     */
    private static final int READER_IDLE_TIME = 30;
    public ServerIdleStateHandler() {
        super(READER_IDLE_TIME, 0, 0, TimeUnit.SECONDS);
    }

    @Override
    protected void channelIdle(ChannelHandlerContext ctx, IdleStateEvent evt) throws Exception {
        log.info("{} 秒内没有读取到数据,关闭连接", READER_IDLE_TIME);

        //假设在30s内没有收到心跳信息，则通道关闭
        ctx.channel().close();
    }
}
