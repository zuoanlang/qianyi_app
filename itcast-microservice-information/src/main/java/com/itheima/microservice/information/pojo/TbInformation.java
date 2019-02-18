package com.itheima.microservice.information.pojo;

import java.util.Date;

public class TbInformation {
    private String infoId;

    private String infoType;

    private String infoWriter;

    private String infoTitle;

    private Long infoViewTimes;

    private String infoImgPath;

    private String effectFlag;

    private String deleteFlag;

    private Date publishedTime;

    private String infoSource;

    private String remark5;

    private String remark4;

    private String remark3;

    private String remark2;

    private String remark1;

    private String infoDetails;

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId == null ? null : infoId.trim();
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType == null ? null : infoType.trim();
    }

    public String getInfoWriter() {
        return infoWriter;
    }

    public void setInfoWriter(String infoWriter) {
        this.infoWriter = infoWriter == null ? null : infoWriter.trim();
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle == null ? null : infoTitle.trim();
    }

    public Long getInfoViewTimes() {
        return infoViewTimes;
    }

    public void setInfoViewTimes(Long infoViewTimes) {
        this.infoViewTimes = infoViewTimes;
    }

    public String getInfoImgPath() {
        return infoImgPath;
    }

    public void setInfoImgPath(String infoImgPath) {
        this.infoImgPath = infoImgPath == null ? null : infoImgPath.trim();
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

    public Date getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(Date publishedTime) {
        this.publishedTime = publishedTime;
    }

    public String getInfoSource() {
        return infoSource;
    }

    public void setInfoSource(String infoSource) {
        this.infoSource = infoSource == null ? null : infoSource.trim();
    }

    public String getRemark5() {
        return remark5;
    }

    public void setRemark5(String remark5) {
        this.remark5 = remark5 == null ? null : remark5.trim();
    }

    public String getRemark4() {
        return remark4;
    }

    public void setRemark4(String remark4) {
        this.remark4 = remark4 == null ? null : remark4.trim();
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getInfoDetails() {
        return infoDetails;
    }

    public void setInfoDetails(String infoDetails) {
        this.infoDetails = infoDetails == null ? null : infoDetails.trim();
    }
}