package com.books.dubbo.demo.api;

/**
 * 同步调用
 */
public interface GreetingService {


	String sayHello(String name);
	
	Result<String> testGeneric(PoJo poJo);
}
