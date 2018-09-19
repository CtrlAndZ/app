package com.xzfw.app.dao;

import com.xzfw.app.entity.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * 商品发布Dao层
 * @author 苏鹏翔
 */
public interface ArticleDao {
    /**
     * 添加商品
     */
    @Insert("insert into t_article(article_name,artice_particulars,artice_type,artice_price,artice_quantity,user_id)"+
            "values (#{articleName},#{articleParticulars},#{articeType},#{articlePrice},#{articleQuantity},#{user})")
    Integer insertArticle(@Param("article")Article article);

}
