package com.xzfw.app.server.impl;

import com.xzfw.app.dao.ArticleDao;
import com.xzfw.app.entity.Article;
import com.xzfw.app.myException.MyServerException;
import com.xzfw.app.server.ArticleServer;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 商品业务层的实现
 * @author 刘靖
 */

@Service
public class ArticleServerImpl implements ArticleServer {

    //注入articleDao
    @Autowired
    private ArticleDao articleDao;

    @Transactional(rollbackFor = Exception.class, readOnly = false)
    @Override
    public Integer IssueByArticle(Article article) {
        //验证artcile实体类是否为空
        if(article == null){
            throw new MyServerException.articleNullPointerException("数据异常!");
        }
        //验证商品名称是否为空
        if(article.getArticleName() == null){
            throw new MyServerException.articleNullPointerException("商品名称不能为空!");
        }
        //验证商品详情是否为空
        if(article.getArticleParticulars() == null){
            throw new MyServerException.articleNullPointerException("商品详情不能为空!");
        }
        //验证商品类型是否为空
        if(article.getArticleType() == null){
            throw new MyServerException.articleNullPointerException("商品类型不能为空!");
        }
        //验证商品价格是否为空
        if(article.getArticlePrice() == null){
            throw new MyServerException.articleNullPointerException("商品价格不能为空!");
        }
        //验证商品数量是否为空
        if(article.getArticleQuantity() == null){
            throw new MyServerException.articleNullPointerException("商品数量不能为空!");
        }
        //在数据库中插入一条商品信息
        return articleDao.insertArticle(article);
    }

    @Transactional(rollbackFor = Exception.class, readOnly = false)
    @Override
    public Integer deleteByArticleId(Integer articleId) {

        return articleDao.deleteByArticleId(articleId);
    }


}
