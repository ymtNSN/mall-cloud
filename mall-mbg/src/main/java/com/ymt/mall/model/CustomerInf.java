package com.ymt.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CustomerInf implements Serializable {
    @ApiModelProperty(value = "自增主键ID")
    private Integer customerInfId;

    @ApiModelProperty(value = "customer_login表的自增ID")
    private Integer customerId;

    @ApiModelProperty(value = "用户真实姓名")
    private String customerName;

    @ApiModelProperty(value = "证件类型：1 身份证，2 军官证，3 护照")
    private Byte identityCardType;

    @ApiModelProperty(value = "证件号码")
    private String identityCardNo;

    @ApiModelProperty(value = "手机号")
    private Integer mobilePhone;

    @ApiModelProperty(value = "邮箱")
    private String customerEmail;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "用户积分")
    private Integer userPoint;

    @ApiModelProperty(value = "注册时间")
    private Date registerTime;

    @ApiModelProperty(value = "会员生日")
    private Date birthday;

    @ApiModelProperty(value = "会员级别：1 普通会员，2 青铜，3白银，4黄金，5钻石")
    private Byte customerLevel;

    @ApiModelProperty(value = "用户余额")
    private BigDecimal userMoney;

    @ApiModelProperty(value = "最后修改时间")
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;

    public Integer getCustomerInfId() {
        return customerInfId;
    }

    public void setCustomerInfId(Integer customerInfId) {
        this.customerInfId = customerInfId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Byte getIdentityCardType() {
        return identityCardType;
    }

    public void setIdentityCardType(Byte identityCardType) {
        this.identityCardType = identityCardType;
    }

    public String getIdentityCardNo() {
        return identityCardNo;
    }

    public void setIdentityCardNo(String identityCardNo) {
        this.identityCardNo = identityCardNo;
    }

    public Integer getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Integer mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(Integer userPoint) {
        this.userPoint = userPoint;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Byte getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(Byte customerLevel) {
        this.customerLevel = customerLevel;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerInfId=").append(customerInfId);
        sb.append(", customerId=").append(customerId);
        sb.append(", customerName=").append(customerName);
        sb.append(", identityCardType=").append(identityCardType);
        sb.append(", identityCardNo=").append(identityCardNo);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", customerEmail=").append(customerEmail);
        sb.append(", gender=").append(gender);
        sb.append(", userPoint=").append(userPoint);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", birthday=").append(birthday);
        sb.append(", customerLevel=").append(customerLevel);
        sb.append(", userMoney=").append(userMoney);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}