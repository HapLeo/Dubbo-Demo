package com.books.dubbo.demo.api;

import lombok.Data;

import java.io.Serializable;

/**
 * POJO的返回值类型
 * @param <T>
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;


    private boolean sucess;

    private String msg;

    private T data;

}
