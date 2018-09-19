package com.xzfw.app.server.impl;

import com.xzfw.app.dao.UserDao;
import com.xzfw.app.entity.User;
import com.xzfw.app.myException.MyServerException;
import com.xzfw.app.server.UserServer;
import com.xzfw.app.util.AccountValidatorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户server层接口实现类
 */
@Service
public class UserServerImpl implements UserServer {

    //注入dao层
    @Autowired
    private UserDao userDao;

    @Transactional(rollbackFor = Exception.class, readOnly = true)
    @Override
    public User LoginByIphone(User user){
        //判断手机号码是否为空
        if(user.getIphone() == null){
            throw new MyServerException.iphoneEmptyException("手机号码为空。");
        }
        //判断密码是否为空异常
        if(user.getPassWord() == null){
            throw new MyServerException.passWordEmptyException("密码不可为空。");
        }
        String passWord = user.getPassWord();
        //查询用户
        user = userDao.findByIphone(user.getIphone());
        //判断用户是否存在
        if (user == null){
            throw new MyServerException.userNotException("登陆失败,用户不存在");
        }
        //判断密码是否正确
        if (!user.getPassWord().equals(passWord)){
            throw new MyServerException.passWordWrongException("登陆失败，密码错误");
        }
        return user;
    }

    @Transactional(rollbackFor = Exception.class, readOnly = false)
    @Override
    public Integer RegisterByUser(User user) {
        //判断用户名是否正确
        //调用正则方法抛出异常
        if(!AccountValidatorUtil.isUsername(user.getUserName())){
            throw new MyServerException.userException("你的用户名出现错误");
        }

        //判断是否为手机号码
        if(!AccountValidatorUtil.isMobile(user.getIphone())){
            throw new MyServerException.phoneNumberException("输入的手机号码不正确");
        }

        //用户密码异常
        if(AccountValidatorUtil.isPassword(user.getPassWord())){
            throw new MyServerException.passWordException("你输入的密码有误");
        }
        //向数据库插入用户
        return userDao.insertUser(user);
    }

}
