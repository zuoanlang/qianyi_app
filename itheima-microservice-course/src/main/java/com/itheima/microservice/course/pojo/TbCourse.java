package com.itheima.microservice.course.pojo;

public class TbCourse {
    private String courseId;

    private String courseName;

    private String courseType;

    private String courseLevel;

    private String courseIsOnline;

    private Integer coursePrice;

    private String courseImg;

    private String courseFilePath;

    private String courseDescription;

    private Long courseLearningFrequency;

    private String courseBelongto;

    private String courseIsHot;

    private String effectFlag;

    private String deleteFlag;

    private String remark1;

    private String remark2;

    private String remark3;

    private String remark4;

    private String remark5;

    private String courseCatalog;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel == null ? null : courseLevel.trim();
    }

    public String getCourseIsOnline() {
        return courseIsOnline;
    }

    public void setCourseIsOnline(String courseIsOnline) {
        this.courseIsOnline = courseIsOnline == null ? null : courseIsOnline.trim();
    }

    public Integer getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(Integer coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg == null ? null : courseImg.trim();
    }

    public String getCourseFilePath() {
        return courseFilePath;
    }

    public void setCourseFilePath(String courseFilePath) {
        this.courseFilePath = courseFilePath == null ? null : courseFilePath.trim();
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription == null ? null : courseDescription.trim();
    }

    public Long getCourseLearningFrequency() {
        return courseLearningFrequency;
    }

    public void setCourseLearningFrequency(Long courseLearningFrequency) {
        this.courseLearningFrequency = courseLearningFrequency;
    }

    public String getCourseBelongto() {
        return courseBelongto;
    }

    public void setCourseBelongto(String courseBelongto) {
        this.courseBelongto = courseBelongto == null ? null : courseBelongto.trim();
    }

    public String getCourseIsHot() {
        return courseIsHot;
    }

    public void setCourseIsHot(String courseIsHot) {
        this.courseIsHot = courseIsHot == null ? null : courseIsHot.trim();
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

    public String getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(String courseCatalog) {
        this.courseCatalog = courseCatalog == null ? null : courseCatalog.trim();
    }
}