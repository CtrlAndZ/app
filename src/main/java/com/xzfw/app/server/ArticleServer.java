package com.xzfw.app.server;

import com.xzfw.app.entity.Article;
import org.apache.ibatis.annotations.Delete;

/**
 * 商品Server 层
 * @author 苏鹏翔
 */
public interface ArticleServer {
    /**
     * 发布商品
     */
    Integer IssueByArticle(Article article);

    /**
     * 通过ID删除商品
     */
    Integer deleteByArticleId(Integer articleId);

}
