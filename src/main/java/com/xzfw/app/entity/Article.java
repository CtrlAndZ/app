package com.xzfw.app.entity;

import java.math.BigDecimal;

/**
 * 商品实体类
 */
public class Article {
    /**
     * 所属用户
     */
    private User user;

    /**
     * 商品编号
     */
    private Integer articleId;

    /**
     * 商品名称
     */
    private String articleName;

    /**
     * 商品详情
     */
    private String articleParticulars;

    /**
     * 商品类型
     */
    private String articleType;

    /**
     * 商品价格
     */
    private BigDecimal articlePrice;

    /**
     * 商品数量
     */
    private Integer articleQuantity;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getArticleParticulars() {
        return articleParticulars;
    }

    public void setArticleParticulars(String articleParticulars) {
        this.articleParticulars = articleParticulars;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public BigDecimal getArticlePrice() {
        return articlePrice;
    }

    public void setArticlePrice(BigDecimal articlePrice) {
        this.articlePrice = articlePrice;
    }

    public Integer getArticleQuantity() {
        return articleQuantity;
    }

    public void setArticleQuantity(Integer articleQuantity) {
        this.articleQuantity = articleQuantity;
    }

    @Override
    public String toString() {
        return "Article{" +
                "user=" + user +
                ", articleId=" + articleId +
                ", articleName='" + articleName + '\'' +
                ", articleParticulars='" + articleParticulars + '\'' +
                ", articleType='" + articleType + '\'' +
                ", articlePrice=" + articlePrice +
                ", articleQuantity=" + articleQuantity +
                '}';
    }
}
