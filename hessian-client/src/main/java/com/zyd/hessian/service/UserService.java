package com.zyd.hessian.service;
/**
 *  Hession(客户端)远程调用步骤：
 *  1、添加hessian依赖
 *  2、创建跟service端相同的接口UserService
 *  3、创建测试类测试
 */
public interface UserService {

    //客户端
    public String sayHello(String name);
}
