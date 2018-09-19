package com.xzfw.app.server;

import com.xzfw.app.entity.Article;

/**
 * 商品Server 层
 * @author 苏鹏翔
 */
public interface ArticleServer {
    /**
     * 发布商品
     */
    Integer IssueByArticle(Article article);


}
