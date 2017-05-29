package com.sdu.spark.rpc.netty;

import com.sdu.spark.rpc.RpcAddress;

/**
 * @author hanhan.zhang
 * */
public class LocalNettyRpcCallContext extends NettyRpcCallContext {

    public LocalNettyRpcCallContext(RpcAddress senderAddress) {
        super(senderAddress);
    }

    @Override
    public void send(Object message) {
        System.out.println("消息响应: " + message.getClass().getName());
    }
}
