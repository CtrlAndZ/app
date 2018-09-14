package com.xzfw.app.entity;

/**
 * 收货信息实体类
 * @author 苏鹏翔
 */
public class Consignee {
    /**
     * 收货ID
     */
    private Integer id;

    /**
     *收货姓名
     */
    private String userName;

    /**
     * 收货人手机号
     */
    private String number;

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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", number='" + number + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", area='" + area + '\'' +
                ", particular='" + particular + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
