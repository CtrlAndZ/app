package com.xzfw.app.entity;

/**
 * 收货信息实体类
 * @author 苏鹏翔
 */
public class Consignee {
    /**
     * 所属用户
     */
    private User User;

    /**
     * 收货ID
     */
    private Integer csnId;

    /**
     *收货姓名
     */
    private String csnName;

    /**
     * 收货人手机号
     */
    private String csnNumber;

    /**
     * 所在省
     */
    private String province;

    /**
     * 所在市
     */
    private String city;

    /**
     * 所在县
     */
    private String county;

    /**
     * 所在区
     */
    private String area;

    /**
     * 详细地址
     */
    private String particular;

    /**
     *  邮政编码
     */
    private String mail;


    public com.xzfw.app.entity.User getUser() {
        return User;
    }

    public void setUser(com.xzfw.app.entity.User user) {
        User = user;
    }


    public Integer getCsnId() {
        return csnId;
    }

    public void setCsnId(Integer csnId) {
        this.csnId = csnId;
    }

    public String getCsnName() {
        return csnName;
    }

    public void setCsnName(String csnName) {
        this.csnName = csnName;
    }

    public String getCsnNumber() {
        return csnNumber;
    }

    public void setCsnNumber(String csnNumber) {
        this.csnNumber = csnNumber;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getParticular() {
        return particular;
    }

    public void setParticular(String particular) {
        this.particular = particular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Consignee{" +
                "User=" + User +
                ", csnId=" + csnId +
                ", csnName='" + csnName + '\'' +
                ", csnNumber='" + csnNumber + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", area='" + area + '\'' +
                ", particular='" + particular + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
