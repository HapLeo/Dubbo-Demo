package com.books.dubbo.demo.api;

import java.util.concurrent.CompletableFuture;

/**
 * 异步调用
 */
public interface GrettingServiceAsync {


	CompletableFuture<String> sayHello(String name);
}