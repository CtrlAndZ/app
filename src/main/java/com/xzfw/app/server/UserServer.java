package com.xzfw.app.server;

import com.xzfw.app.entity.User;

/**
 * 用户server层接口
 * @author 刘靖
 */

public interface UserServer {

    /**
     * 验证用户登陆信息
     */
    User LoginByIphone(User user);

    /**
     * 注册用户
     * @author 苏鹏翔
     */
    Integer RegisterByUser(User user);

}
