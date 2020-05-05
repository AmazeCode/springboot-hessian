package com.zyd.hessian.service.impl;

import com.zyd.hessian.service.UserService;

/**
 *  实现类
 */
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String name) {
        return name+"客户端调用了hessian服务端的服务";
    }
}
