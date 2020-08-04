package com.books.dubbo.demo.api;

import lombok.Data;

/**
 * 用于泛化调用时的参数转换
 */
@Data
public class PoJo {

	private String  id;

	private String name;
}
