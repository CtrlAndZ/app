package com.xzfw.app.dao;

import com.xzfw.app.entity.Article;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 商品发布Dao层
 * @author 苏鹏翔
 */
@Mapper
public interface ArticleDao {
    /**
     * 添加商品
     */
    @Insert("insert into t_article(article_name,artice_particulars,artice_type,artice_price,artice_quantity,user_id)"+
            "values (#{article.articleName},#{article.articleParticulars},#{article.articeType},#{article.articlePrice},#{article.articleQuantity},#{article.user.userId})")
    Integer insertArticle(@Param("article") Article article);

    /**
     * 删除商品
     */
    @Delete("DELETE from t_article WHERE article_id = #{articleId}")
    Integer deleteByArticleId (@Param("articleId") Integer articleId);

}
