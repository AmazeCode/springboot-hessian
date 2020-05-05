package com.zyd.hessian.service;

/**
 * Hessian(RPC)远程方法调用：
 * 1、引入hessian依赖
 * 2、创建接口UserService
 * 3、实现类
 * 4、web.xml中配置HessianServlet
 * 5、添加tomcat7插件启动服务
 */
public interface UserService {

    //服务端
    public String sayHello(String name);
}
