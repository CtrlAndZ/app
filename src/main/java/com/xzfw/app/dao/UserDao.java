package com.xzfw.app.dao;

import com.xzfw.app.entity.User;
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
    @Select("SELECT * FROM T_USER WHRER iphone = #{iphone}")
    User findByIphone(@Param("iphone") String iphone);

}
