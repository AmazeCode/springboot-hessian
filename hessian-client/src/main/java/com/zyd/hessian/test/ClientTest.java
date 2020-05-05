package com.zyd.hessian.test;

import com.caucho.hessian.client.HessianProxyFactory;
import com.zyd.hessian.service.UserService;

/**
 *  客户端测试类
 */
public class ClientTest {

    public static void main(String[] args) throws Exception {
        //端口要和服务端端口保质一致（/HessianServlet为web.xml中配置的地址）
        String url = "http://localhost:8888/hessianServlet";

        //创建Hessian工厂
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        UserService userService = (UserService)hessianProxyFactory.create(UserService.class,url);
        String h = userService.sayHello("hessian客户端");
        System.out.println(h);
    }
}
