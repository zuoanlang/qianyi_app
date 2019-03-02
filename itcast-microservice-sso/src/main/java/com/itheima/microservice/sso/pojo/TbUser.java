package com.itheima.microservice.sso.pojo;

import java.util.Date;

public class TbUser {
    private String userId;

    private String userName;

    private String nickName;

    private String userPassword;

    private Date birthday;

    private String idCardNo;

    private String isAdministrator;

    private String isMaster;

    private String masterRank;

    private String isOfficial;

    private String masterIntroduction;

    private String sex;

    private String effectFlag;

    private String deleteFlag;

    private String idCardImg1;

    private String idCardImg2;

    private String headImg;

    private String hobby;

    private String qq;

    private String weixin;

    private String asign;

    private String profession;

    private String major;

    private Date registerTime;

    private Date lastLoginTime;

    private String remark1;

    private String remark2;

    private String remark3;

    private String remark4;

    private String remark5;

    public TbUser(String userId, String userName, String nickName, String userPassword, Date birthday, String idCardNo, String isAdministrator, String isMaster, String masterRank, String isOfficial, String masterIntroduction, String sex, String effectFlag, String deleteFlag, String idCardImg1, String idCardImg2, String headImg, String hobby, String qq, String weixin, String asign, String profession, String major, Date registerTime, Date lastLoginTime, String remark1, String remark2, String remark3, String remark4, String remark5) {
        this.userId = userId;
        this.userName = userName;
        this.nickName = nickName;
        this.userPassword = userPassword;
        this.birthday = birthday;
        this.idCardNo = idCardNo;
        this.isAdministrator = isAdministrator;
        this.isMaster = isMaster;
        this.masterRank = masterRank;
        this.isOfficial = isOfficial;
        this.masterIntroduction = masterIntroduction;
        this.sex = sex;
        this.effectFlag = effectFlag;
        this.deleteFlag = deleteFlag;
        this.idCardImg1 = idCardImg1;
        this.idCardImg2 = idCardImg2;
        this.headImg = headImg;
        this.hobby = hobby;
        this.qq = qq;
        this.weixin = weixin;
        this.asign = asign;
        this.profession = profession;
        this.major = major;
        this.registerTime = registerTime;
        this.lastLoginTime = lastLoginTime;
        this.remark1 = remark1;
        this.remark2 = remark2;
        this.remark3 = remark3;
        this.remark4 = remark4;
        this.remark5 = remark5;
    }

    public TbUser() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    public String getIsAdministrator() {
        return isAdministrator;
    }

    public void setIsAdministrator(String isAdministrator) {
        this.isAdministrator = isAdministrator == null ? null : isAdministrator.trim();
    }

    public String getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(String isMaster) {
        this.isMaster = isMaster == null ? null : isMaster.trim();
    }

    public String getMasterRank() {
        return masterRank;
    }

    public void setMasterRank(String masterRank) {
        this.masterRank = masterRank == null ? null : masterRank.trim();
    }

    public String getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial == null ? null : isOfficial.trim();
    }

    public String getMasterIntroduction() {
        return masterIntroduction;
    }

    public void setMasterIntroduction(String masterIntroduction) {
        this.masterIntroduction = masterIntroduction == null ? null : masterIntroduction.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEffectFlag() {
        return effectFlag;
    }

    public void setEffectFlag(String effectFlag) {
        this.effectFlag = effectFlag == null ? null : effectFlag.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public String getIdCardImg1() {
        return idCardImg1;
    }

    public void setIdCardImg1(String idCardImg1) {
        this.idCardImg1 = idCardImg1 == null ? null : idCardImg1.trim();
    }

    public String getIdCardImg2() {
        return idCardImg2;
    }

    public void setIdCardImg2(String idCardImg2) {
        this.idCardImg2 = idCardImg2 == null ? null : idCardImg2.trim();
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getAsign() {
        return asign;
    }

    public void setAsign(String asign) {
        this.asign = asign == null ? null : asign.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    public String getRemark4() {
        return remark4;
    }

    public void setRemark4(String remark4) {
        this.remark4 = remark4 == null ? null : remark4.trim();
    }

    public String getRemark5() {
        return remark5;
    }

    public void setRemark5(String remark5) {
        this.remark5 = remark5 == null ? null : remark5.trim();
    }

    @Override
    public String toString() {
        return "TbUser{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", birthday=" + birthday +
                ", idCardNo='" + idCardNo + '\'' +
                ", isAdministrator='" + isAdministrator + '\'' +
                ", isMaster='" + isMaster + '\'' +
                ", masterRank='" + masterRank + '\'' +
                ", isOfficial='" + isOfficial + '\'' +
                ", masterIntroduction='" + masterIntroduction + '\'' +
                ", sex='" + sex + '\'' +
                ", effectFlag='" + effectFlag + '\'' +
                ", deleteFlag='" + deleteFlag + '\'' +
                ", idCardImg1='" + idCardImg1 + '\'' +
                ", idCardImg2='" + idCardImg2 + '\'' +
                ", headImg='" + headImg + '\'' +
                ", hobby='" + hobby + '\'' +
                ", qq='" + qq + '\'' +
                ", weixin='" + weixin + '\'' +
                ", asign='" + asign + '\'' +
                ", profession='" + profession + '\'' +
                ", major='" + major + '\'' +
                ", registerTime=" + registerTime +
                ", lastLoginTime=" + lastLoginTime +
                ", remark1='" + remark1 + '\'' +
                ", remark2='" + remark2 + '\'' +
                ", remark3='" + remark3 + '\'' +
                ", remark4='" + remark4 + '\'' +
                ", remark5='" + remark5 + '\'' +
                '}';
    }
}