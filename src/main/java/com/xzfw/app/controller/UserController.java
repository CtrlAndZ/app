package com.xzfw.app.controller;

import com.xzfw.app.entity.User;
import com.xzfw.app.myException.MyServerException;
import com.xzfw.app.server.UserServer;
import com.xzfw.app.util.SmsMessage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 用户控制层
 * @author 刘靖
 */
@RestController
public class UserController {

    //存放手机验证码
    private Map<String,Integer> phoneMap = new HashMap<String,Integer>();

    //注入userServer
    @Autowired
    private UserServer userServer;

    /**
     * 用户通过手机号码登陆
     */
    @PostMapping(value = "/login")
    public Object loginByIphone(HttpSession session, User user){
        Map<String,String> map = new HashMap<String,String>();
        //判断用户数据是否存在
        if (user == null){
            throw new RuntimeException("数据异常");
        }else {
            //处理异常
            try {
                user = userServer.LoginByIphone(user);
                //登陆成功把从数据库取出的用户信息放入session中
                session.setAttribute("user",user);
                map.put("result","success");
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return map;
    }

    /**
     * 短信验证码发送
     */
    @PostMapping(value = "/sendCode")
    public Object sendCode(HttpSession session,String iphone){
        Integer num = phoneMap.get(iphone);
        //判断短信是否达到次数
        if(num != null){
            if (num >=3){
                throw new MyServerException.messageNumOutException("你的短信次数达到限制");
            }
        }
        //随机产生验证码
        Random r = new Random(new Date().getTime());
        String code = "";
        for (int i = 0; i < 4; i++) {
            code += r.nextInt(10);
        }
        //发送短信
        String result = SmsMessage.SendSmsMEssage(iphone,code);
        if("1".equals(result)){
            //判断手机号码是否被记录
            if(phoneMap.containsKey(iphone)){
                //短信验证码存在加1
                phoneMap.put(iphone,phoneMap.get(iphone)+1);
            }else {
                phoneMap.put(iphone,1);
            }
        }
        //存放手机号码与验证码进行比较
        session.setAttribute(iphone,code);
        Map map = new HashMap();
        map.put("result","success");
        return map;
    }

    /**
     * 注册用户
     */
    @PostMapping(value = "/register")
    public Object register(HttpSession session,User user,String code){
        //判断用不为空
        if(user == null){
            throw new MyServerException.userNotException("数据异常");
        }
        //比对验证码
        if(!code.equals(session.getAttribute(user.getIphone()))){
            throw new MyServerException.phoneCodeErrorException("验证码错误");
        }
        Integer result = 0;
        try {
            //注册
            result = userServer.RegisterByUser(user);
        }catch (RuntimeException e){
            throw e;
        }
        //判断是否插入成功
        if(result != 1){
            throw new MyServerException.userExistException("用户已经存在");
        }
        Map<String, String> map = new HashMap<String, String>();
        map.put("result","success");
        return map;
    }

}
