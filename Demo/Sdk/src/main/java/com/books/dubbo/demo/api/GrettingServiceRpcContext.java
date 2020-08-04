package com.books.dubbo.demo.api;

/**
 * RPC上下文调用
 */
public interface GrettingServiceRpcContext {


    String sayHello(String name);
}