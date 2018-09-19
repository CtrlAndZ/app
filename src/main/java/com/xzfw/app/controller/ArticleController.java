package com.xzfw.app.controller;

import com.xzfw.app.entity.Article;
import com.xzfw.app.entity.User;
import com.xzfw.app.myException.MyServerException;
import com.xzfw.app.server.ArticleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 商品控制层
 * @author 刘靖
 */

@RestController
public class ArticleController {

    //注入server
    @Autowired
    private ArticleServer articleServer;

    /**
     * 发布商品
     * @param session
     * @param article
     * @return
     */
    @PostMapping(value = "/issue")
    public Object issueArticle(HttpSession session, Article article){
        //取出用户
        User user = (User) session.getAttribute("user");
        //给商品类注入用户
        article.setUser(user);
        Integer result = 0;
        try {
            //调用添加商品逻辑
            result = articleServer.IssueByArticle(article);
        }catch (NullPointerException e){
            throw e;
        }
        if(result != 1){
            throw new MyServerException.articleIssueException("商品发布失败!");
        }
        Map<String, String> map = new HashMap<String, String>();
        map.put("result","success");
        return map;
    }

}
