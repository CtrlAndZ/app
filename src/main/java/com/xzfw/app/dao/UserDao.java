package com.xzfw.app.dao;

import com.xzfw.app.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户dao层接口
 * @author 刘靖
 */

@Mapper
public interface UserDao {  

    /**
     * 通过手机号码查询用户信息
     */
    @Select("SELECT * FROM T_USER WHERE iphone = #{iphone}")
    User findByIphone(@Param("iphone") String iphone);

    /**
     * 插入用户信息
     * @author 苏鹏翔
     */
    @Insert("INSERT into T_user (user_name,iphone,passWord,tsPassWord,headUrl) " +
            "VALUES (#{user.userName},#{user.iphone},#{user.passWord},#{user.tsPassWord},#{user.headUrl});")
    Integer insertUser(@Param("user") User user);

}
