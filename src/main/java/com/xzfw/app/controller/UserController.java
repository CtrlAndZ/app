package com.xzfw.app.controller;

import com.xzfw.app.entity.User;
import com.xzfw.app.myException.MyServerException;
import com.xzfw.app.server.UserServer;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户控制层
 * @author 刘靖
 */

@RestController
public class UserController {

    //注入userServer
    private UserServer userServer;

    /**
     * 用户通过手机号码登陆
     */
    public Object loginByIphone(HttpSession session, User user){
        Map<String,String> map = new HashMap<String,String>();
        //判断用户数据是否存在
        if (user == null){
            map.put("error","数据异常");
        }else {
            //处理异常
            try {
                user = userServer.LoginByIphone(user);
                //登陆成功把从数据库取出的用户信息放入session中
                session.setAttribute("user",user);
                map.put("result","success");
            } catch (MyServerException.iphoneEmptyException e) {
                map.put("error",e.getMessage());
            } catch (MyServerException.passWordEmptyException e){
                map.put("error",e.getMessage());
            } catch (MyServerException.userNotException e){
                map.put("error",e.getMessage());
            }catch (MyServerException.passWordWrongException e){
                map.put("error",e.getMessage());
            }
        }
        return map;
    }


}
