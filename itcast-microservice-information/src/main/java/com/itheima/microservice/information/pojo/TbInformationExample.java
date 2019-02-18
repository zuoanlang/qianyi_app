package com.itheima.microservice.information.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbInformationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andInfoIdIsNull() {
            addCriterion("info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(String value) {
            addCriterion("info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(String value) {
            addCriterion("info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(String value) {
            addCriterion("info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(String value) {
            addCriterion("info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(String value) {
            addCriterion("info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLike(String value) {
            addCriterion("info_id like", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotLike(String value) {
            addCriterion("info_id not like", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<String> values) {
            addCriterion("info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<String> values) {
            addCriterion("info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(String value1, String value2) {
            addCriterion("info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(String value1, String value2) {
            addCriterion("info_id not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIsNull() {
            addCriterion("info_type is null");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIsNotNull() {
            addCriterion("info_type is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTypeEqualTo(String value) {
            addCriterion("info_type =", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotEqualTo(String value) {
            addCriterion("info_type <>", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeGreaterThan(String value) {
            addCriterion("info_type >", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("info_type >=", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLessThan(String value) {
            addCriterion("info_type <", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLessThanOrEqualTo(String value) {
            addCriterion("info_type <=", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLike(String value) {
            addCriterion("info_type like", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotLike(String value) {
            addCriterion("info_type not like", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIn(List<String> values) {
            addCriterion("info_type in", values, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotIn(List<String> values) {
            addCriterion("info_type not in", values, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeBetween(String value1, String value2) {
            addCriterion("info_type between", value1, value2, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotBetween(String value1, String value2) {
            addCriterion("info_type not between", value1, value2, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoWriterIsNull() {
            addCriterion("info_writer is null");
            return (Criteria) this;
        }

        public Criteria andInfoWriterIsNotNull() {
            addCriterion("info_writer is not null");
            return (Criteria) this;
        }

        public Criteria andInfoWriterEqualTo(String value) {
            addCriterion("info_writer =", value, "infoWriter");
            return (Criteria) this;
        }

        public Criteria andInfoWriterNotEqualTo(String value) {
            addCriterion("info_writer <>", value, "infoWriter");
            return (Criteria) this;
        }

        public Criteria andInfoWriterGreaterThan(String value) {
            addCriterion("info_writer >", value, "infoWriter");
            return (Criteria) this;
        }

        public Criteria andInfoWriterGreaterThanOrEqualTo(String value) {
            addCriterion("info_writer >=", value, "infoWriter");
            return (Criteria) this;
        }

        public Criteria andInfoWriterLessThan(String value) {
            addCriterion("info_writer <", value, "infoWriter");
            return (Criteria) this;
        }

        public Criteria andInfoWriterLessThanOrEqualTo(String value) {
            addCriterion("info_writer <=", value, "infoWriter");
            return (Criteria) this;
        }

        public Criteria andInfoWriterLike(String value) {
            addCriterion("info_writer like", value, "infoWriter");
            return (Criteria) this;
        }

        public Criteria andInfoWriterNotLike(String value) {
            addCriterion("info_writer not like", value, "infoWriter");
            return (Criteria) this;
        }

        public Criteria andInfoWriterIn(List<String> values) {
            addCriterion("info_writer in", values, "infoWriter");
            return (Criteria) this;
        }

        public Criteria andInfoWriterNotIn(List<String> values) {
            addCriterion("info_writer not in", values, "infoWriter");
            return (Criteria) this;
        }

        public Criteria andInfoWriterBetween(String value1, String value2) {
            addCriterion("info_writer between", value1, value2, "infoWriter");
            return (Criteria) this;
        }

        public Criteria andInfoWriterNotBetween(String value1, String value2) {
            addCriterion("info_writer not between", value1, value2, "infoWriter");
            return (Criteria) this;
        }

        public Criteria andInfoTitleIsNull() {
            addCriterion("info_title is null");
            return (Criteria) this;
        }

        public Criteria andInfoTitleIsNotNull() {
            addCriterion("info_title is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEqualTo(String value) {
            addCriterion("info_title =", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleNotEqualTo(String value) {
            addCriterion("info_title <>", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleGreaterThan(String value) {
            addCriterion("info_title >", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("info_title >=", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleLessThan(String value) {
            addCriterion("info_title <", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleLessThanOrEqualTo(String value) {
            addCriterion("info_title <=", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleLike(String value) {
            addCriterion("info_title like", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleNotLike(String value) {
            addCriterion("info_title not like", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleIn(List<String> values) {
            addCriterion("info_title in", values, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleNotIn(List<String> values) {
            addCriterion("info_title not in", values, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleBetween(String value1, String value2) {
            addCriterion("info_title between", value1, value2, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleNotBetween(String value1, String value2) {
            addCriterion("info_title not between", value1, value2, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoViewTimesIsNull() {
            addCriterion("info_view_times is null");
            return (Criteria) this;
        }

        public Criteria andInfoViewTimesIsNotNull() {
            addCriterion("info_view_times is not null");
            return (Criteria) this;
        }

        public Criteria andInfoViewTimesEqualTo(Long value) {
            addCriterion("info_view_times =", value, "infoViewTimes");
            return (Criteria) this;
        }

        public Criteria andInfoViewTimesNotEqualTo(Long value) {
            addCriterion("info_view_times <>", value, "infoViewTimes");
            return (Criteria) this;
        }

        public Criteria andInfoViewTimesGreaterThan(Long value) {
            addCriterion("info_view_times >", value, "infoViewTimes");
            return (Criteria) this;
        }

        public Criteria andInfoViewTimesGreaterThanOrEqualTo(Long value) {
            addCriterion("info_view_times >=", value, "infoViewTimes");
            return (Criteria) this;
        }

        public Criteria andInfoViewTimesLessThan(Long value) {
            addCriterion("info_view_times <", value, "infoViewTimes");
            return (Criteria) this;
        }

        public Criteria andInfoViewTimesLessThanOrEqualTo(Long value) {
            addCriterion("info_view_times <=", value, "infoViewTimes");
            return (Criteria) this;
        }

        public Criteria andInfoViewTimesIn(List<Long> values) {
            addCriterion("info_view_times in", values, "infoViewTimes");
            return (Criteria) this;
        }

        public Criteria andInfoViewTimesNotIn(List<Long> values) {
            addCriterion("info_view_times not in", values, "infoViewTimes");
            return (Criteria) this;
        }

        public Criteria andInfoViewTimesBetween(Long value1, Long value2) {
            addCriterion("info_view_times between", value1, value2, "infoViewTimes");
            return (Criteria) this;
        }

        public Criteria andInfoViewTimesNotBetween(Long value1, Long value2) {
            addCriterion("info_view_times not between", value1, value2, "infoViewTimes");
            return (Criteria) this;
        }

        public Criteria andInfoImgPathIsNull() {
            addCriterion("info_img_path is null");
            return (Criteria) this;
        }

        public Criteria andInfoImgPathIsNotNull() {
            addCriterion("info_img_path is not null");
            return (Criteria) this;
        }

        public Criteria andInfoImgPathEqualTo(String value) {
            addCriterion("info_img_path =", value, "infoImgPath");
            return (Criteria) this;
        }

        public Criteria andInfoImgPathNotEqualTo(String value) {
            addCriterion("info_img_path <>", value, "infoImgPath");
            return (Criteria) this;
        }

        public Criteria andInfoImgPathGreaterThan(String value) {
            addCriterion("info_img_path >", value, "infoImgPath");
            return (Criteria) this;
        }

        public Criteria andInfoImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("info_img_path >=", value, "infoImgPath");
            return (Criteria) this;
        }

        public Criteria andInfoImgPathLessThan(String value) {
            addCriterion("info_img_path <", value, "infoImgPath");
            return (Criteria) this;
        }

        public Criteria andInfoImgPathLessThanOrEqualTo(String value) {
            addCriterion("info_img_path <=", value, "infoImgPath");
            return (Criteria) this;
        }

        public Criteria andInfoImgPathLike(String value) {
            addCriterion("info_img_path like", value, "infoImgPath");
            return (Criteria) this;
        }

        public Criteria andInfoImgPathNotLike(String value) {
            addCriterion("info_img_path not like", value, "infoImgPath");
            return (Criteria) this;
        }

        public Criteria andInfoImgPathIn(List<String> values) {
            addCriterion("info_img_path in", values, "infoImgPath");
            return (Criteria) this;
        }

        public Criteria andInfoImgPathNotIn(List<String> values) {
            addCriterion("info_img_path not in", values, "infoImgPath");
            return (Criteria) this;
        }

        public Criteria andInfoImgPathBetween(String value1, String value2) {
            addCriterion("info_img_path between", value1, value2, "infoImgPath");
            return (Criteria) this;
        }

        public Criteria andInfoImgPathNotBetween(String value1, String value2) {
            addCriterion("info_img_path not between", value1, value2, "infoImgPath");
            return (Criteria) this;
        }

        public Criteria andEffectFlagIsNull() {
            addCriterion("effect_flag is null");
            return (Criteria) this;
        }

        public Criteria andEffectFlagIsNotNull() {
            addCriterion("effect_flag is not null");
            return (Criteria) this;
        }

        public Criteria andEffectFlagEqualTo(String value) {
            addCriterion("effect_flag =", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagNotEqualTo(String value) {
            addCriterion("effect_flag <>", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagGreaterThan(String value) {
            addCriterion("effect_flag >", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagGreaterThanOrEqualTo(String value) {
            addCriterion("effect_flag >=", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagLessThan(String value) {
            addCriterion("effect_flag <", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagLessThanOrEqualTo(String value) {
            addCriterion("effect_flag <=", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagLike(String value) {
            addCriterion("effect_flag like", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagNotLike(String value) {
            addCriterion("effect_flag not like", value, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagIn(List<String> values) {
            addCriterion("effect_flag in", values, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagNotIn(List<String> values) {
            addCriterion("effect_flag not in", values, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagBetween(String value1, String value2) {
            addCriterion("effect_flag between", value1, value2, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andEffectFlagNotBetween(String value1, String value2) {
            addCriterion("effect_flag not between", value1, value2, "effectFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(String value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(String value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(String value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(String value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(String value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(String value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLike(String value) {
            addCriterion("delete_flag like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotLike(String value) {
            addCriterion("delete_flag not like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<String> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<String> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(String value1, String value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(String value1, String value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeIsNull() {
            addCriterion("published_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeIsNotNull() {
            addCriterion("published_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeEqualTo(Date value) {
            addCriterion("published_time =", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeNotEqualTo(Date value) {
            addCriterion("published_time <>", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeGreaterThan(Date value) {
            addCriterion("published_time >", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("published_time >=", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeLessThan(Date value) {
            addCriterion("published_time <", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeLessThanOrEqualTo(Date value) {
            addCriterion("published_time <=", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeIn(List<Date> values) {
            addCriterion("published_time in", values, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeNotIn(List<Date> values) {
            addCriterion("published_time not in", values, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeBetween(Date value1, Date value2) {
            addCriterion("published_time between", value1, value2, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeNotBetween(Date value1, Date value2) {
            addCriterion("published_time not between", value1, value2, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andInfoSourceIsNull() {
            addCriterion("info_source is null");
            return (Criteria) this;
        }

        public Criteria andInfoSourceIsNotNull() {
            addCriterion("info_source is not null");
            return (Criteria) this;
        }

        public Criteria andInfoSourceEqualTo(String value) {
            addCriterion("info_source =", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotEqualTo(String value) {
            addCriterion("info_source <>", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceGreaterThan(String value) {
            addCriterion("info_source >", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceGreaterThanOrEqualTo(String value) {
            addCriterion("info_source >=", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceLessThan(String value) {
            addCriterion("info_source <", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceLessThanOrEqualTo(String value) {
            addCriterion("info_source <=", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceLike(String value) {
            addCriterion("info_source like", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotLike(String value) {
            addCriterion("info_source not like", value, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceIn(List<String> values) {
            addCriterion("info_source in", values, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotIn(List<String> values) {
            addCriterion("info_source not in", values, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceBetween(String value1, String value2) {
            addCriterion("info_source between", value1, value2, "infoSource");
            return (Criteria) this;
        }

        public Criteria andInfoSourceNotBetween(String value1, String value2) {
            addCriterion("info_source not between", value1, value2, "infoSource");
            return (Criteria) this;
        }

        public Criteria andRemark5IsNull() {
            addCriterion("remark5 is null");
            return (Criteria) this;
        }

        public Criteria andRemark5IsNotNull() {
            addCriterion("remark5 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark5EqualTo(String value) {
            addCriterion("remark5 =", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotEqualTo(String value) {
            addCriterion("remark5 <>", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5GreaterThan(String value) {
            addCriterion("remark5 >", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5GreaterThanOrEqualTo(String value) {
            addCriterion("remark5 >=", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5LessThan(String value) {
            addCriterion("remark5 <", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5LessThanOrEqualTo(String value) {
            addCriterion("remark5 <=", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5Like(String value) {
            addCriterion("remark5 like", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotLike(String value) {
            addCriterion("remark5 not like", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5In(List<String> values) {
            addCriterion("remark5 in", values, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotIn(List<String> values) {
            addCriterion("remark5 not in", values, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5Between(String value1, String value2) {
            addCriterion("remark5 between", value1, value2, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotBetween(String value1, String value2) {
            addCriterion("remark5 not between", value1, value2, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNull() {
            addCriterion("remark4 is null");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNotNull() {
            addCriterion("remark4 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark4EqualTo(String value) {
            addCriterion("remark4 =", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotEqualTo(String value) {
            addCriterion("remark4 <>", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThan(String value) {
            addCriterion("remark4 >", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThanOrEqualTo(String value) {
            addCriterion("remark4 >=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThan(String value) {
            addCriterion("remark4 <", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThanOrEqualTo(String value) {
            addCriterion("remark4 <=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Like(String value) {
            addCriterion("remark4 like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotLike(String value) {
            addCriterion("remark4 not like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4In(List<String> values) {
            addCriterion("remark4 in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotIn(List<String> values) {
            addCriterion("remark4 not in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Between(String value1, String value2) {
            addCriterion("remark4 between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotBetween(String value1, String value2) {
            addCriterion("remark4 not between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNull() {
            addCriterion("remark3 is null");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNotNull() {
            addCriterion("remark3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark3EqualTo(String value) {
            addCriterion("remark3 =", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotEqualTo(String value) {
            addCriterion("remark3 <>", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThan(String value) {
            addCriterion("remark3 >", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("remark3 >=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThan(String value) {
            addCriterion("remark3 <", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThanOrEqualTo(String value) {
            addCriterion("remark3 <=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Like(String value) {
            addCriterion("remark3 like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotLike(String value) {
            addCriterion("remark3 not like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3In(List<String> values) {
            addCriterion("remark3 in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotIn(List<String> values) {
            addCriterion("remark3 not in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Between(String value1, String value2) {
            addCriterion("remark3 between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotBetween(String value1, String value2) {
            addCriterion("remark3 not between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}