package com.liyutg.plant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiseaseControlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiseaseControlExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Integer value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Integer value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Integer value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Integer value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Integer> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Integer> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andType01IsNull() {
            addCriterion("type01 is null");
            return (Criteria) this;
        }

        public Criteria andType01IsNotNull() {
            addCriterion("type01 is not null");
            return (Criteria) this;
        }

        public Criteria andType01EqualTo(String value) {
            addCriterion("type01 =", value, "type01");
            return (Criteria) this;
        }

        public Criteria andType01NotEqualTo(String value) {
            addCriterion("type01 <>", value, "type01");
            return (Criteria) this;
        }

        public Criteria andType01GreaterThan(String value) {
            addCriterion("type01 >", value, "type01");
            return (Criteria) this;
        }

        public Criteria andType01GreaterThanOrEqualTo(String value) {
            addCriterion("type01 >=", value, "type01");
            return (Criteria) this;
        }

        public Criteria andType01LessThan(String value) {
            addCriterion("type01 <", value, "type01");
            return (Criteria) this;
        }

        public Criteria andType01LessThanOrEqualTo(String value) {
            addCriterion("type01 <=", value, "type01");
            return (Criteria) this;
        }

        public Criteria andType01Like(String value) {
            addCriterion("type01 like", value, "type01");
            return (Criteria) this;
        }

        public Criteria andType01NotLike(String value) {
            addCriterion("type01 not like", value, "type01");
            return (Criteria) this;
        }

        public Criteria andType01In(List<String> values) {
            addCriterion("type01 in", values, "type01");
            return (Criteria) this;
        }

        public Criteria andType01NotIn(List<String> values) {
            addCriterion("type01 not in", values, "type01");
            return (Criteria) this;
        }

        public Criteria andType01Between(String value1, String value2) {
            addCriterion("type01 between", value1, value2, "type01");
            return (Criteria) this;
        }

        public Criteria andType01NotBetween(String value1, String value2) {
            addCriterion("type01 not between", value1, value2, "type01");
            return (Criteria) this;
        }

        public Criteria andType02IsNull() {
            addCriterion("type02 is null");
            return (Criteria) this;
        }

        public Criteria andType02IsNotNull() {
            addCriterion("type02 is not null");
            return (Criteria) this;
        }

        public Criteria andType02EqualTo(String value) {
            addCriterion("type02 =", value, "type02");
            return (Criteria) this;
        }

        public Criteria andType02NotEqualTo(String value) {
            addCriterion("type02 <>", value, "type02");
            return (Criteria) this;
        }

        public Criteria andType02GreaterThan(String value) {
            addCriterion("type02 >", value, "type02");
            return (Criteria) this;
        }

        public Criteria andType02GreaterThanOrEqualTo(String value) {
            addCriterion("type02 >=", value, "type02");
            return (Criteria) this;
        }

        public Criteria andType02LessThan(String value) {
            addCriterion("type02 <", value, "type02");
            return (Criteria) this;
        }

        public Criteria andType02LessThanOrEqualTo(String value) {
            addCriterion("type02 <=", value, "type02");
            return (Criteria) this;
        }

        public Criteria andType02Like(String value) {
            addCriterion("type02 like", value, "type02");
            return (Criteria) this;
        }

        public Criteria andType02NotLike(String value) {
            addCriterion("type02 not like", value, "type02");
            return (Criteria) this;
        }

        public Criteria andType02In(List<String> values) {
            addCriterion("type02 in", values, "type02");
            return (Criteria) this;
        }

        public Criteria andType02NotIn(List<String> values) {
            addCriterion("type02 not in", values, "type02");
            return (Criteria) this;
        }

        public Criteria andType02Between(String value1, String value2) {
            addCriterion("type02 between", value1, value2, "type02");
            return (Criteria) this;
        }

        public Criteria andType02NotBetween(String value1, String value2) {
            addCriterion("type02 not between", value1, value2, "type02");
            return (Criteria) this;
        }

        public Criteria andType03IsNull() {
            addCriterion("type03 is null");
            return (Criteria) this;
        }

        public Criteria andType03IsNotNull() {
            addCriterion("type03 is not null");
            return (Criteria) this;
        }

        public Criteria andType03EqualTo(String value) {
            addCriterion("type03 =", value, "type03");
            return (Criteria) this;
        }

        public Criteria andType03NotEqualTo(String value) {
            addCriterion("type03 <>", value, "type03");
            return (Criteria) this;
        }

        public Criteria andType03GreaterThan(String value) {
            addCriterion("type03 >", value, "type03");
            return (Criteria) this;
        }

        public Criteria andType03GreaterThanOrEqualTo(String value) {
            addCriterion("type03 >=", value, "type03");
            return (Criteria) this;
        }

        public Criteria andType03LessThan(String value) {
            addCriterion("type03 <", value, "type03");
            return (Criteria) this;
        }

        public Criteria andType03LessThanOrEqualTo(String value) {
            addCriterion("type03 <=", value, "type03");
            return (Criteria) this;
        }

        public Criteria andType03Like(String value) {
            addCriterion("type03 like", value, "type03");
            return (Criteria) this;
        }

        public Criteria andType03NotLike(String value) {
            addCriterion("type03 not like", value, "type03");
            return (Criteria) this;
        }

        public Criteria andType03In(List<String> values) {
            addCriterion("type03 in", values, "type03");
            return (Criteria) this;
        }

        public Criteria andType03NotIn(List<String> values) {
            addCriterion("type03 not in", values, "type03");
            return (Criteria) this;
        }

        public Criteria andType03Between(String value1, String value2) {
            addCriterion("type03 between", value1, value2, "type03");
            return (Criteria) this;
        }

        public Criteria andType03NotBetween(String value1, String value2) {
            addCriterion("type03 not between", value1, value2, "type03");
            return (Criteria) this;
        }

        public Criteria andType04IsNull() {
            addCriterion("type04 is null");
            return (Criteria) this;
        }

        public Criteria andType04IsNotNull() {
            addCriterion("type04 is not null");
            return (Criteria) this;
        }

        public Criteria andType04EqualTo(String value) {
            addCriterion("type04 =", value, "type04");
            return (Criteria) this;
        }

        public Criteria andType04NotEqualTo(String value) {
            addCriterion("type04 <>", value, "type04");
            return (Criteria) this;
        }

        public Criteria andType04GreaterThan(String value) {
            addCriterion("type04 >", value, "type04");
            return (Criteria) this;
        }

        public Criteria andType04GreaterThanOrEqualTo(String value) {
            addCriterion("type04 >=", value, "type04");
            return (Criteria) this;
        }

        public Criteria andType04LessThan(String value) {
            addCriterion("type04 <", value, "type04");
            return (Criteria) this;
        }

        public Criteria andType04LessThanOrEqualTo(String value) {
            addCriterion("type04 <=", value, "type04");
            return (Criteria) this;
        }

        public Criteria andType04Like(String value) {
            addCriterion("type04 like", value, "type04");
            return (Criteria) this;
        }

        public Criteria andType04NotLike(String value) {
            addCriterion("type04 not like", value, "type04");
            return (Criteria) this;
        }

        public Criteria andType04In(List<String> values) {
            addCriterion("type04 in", values, "type04");
            return (Criteria) this;
        }

        public Criteria andType04NotIn(List<String> values) {
            addCriterion("type04 not in", values, "type04");
            return (Criteria) this;
        }

        public Criteria andType04Between(String value1, String value2) {
            addCriterion("type04 between", value1, value2, "type04");
            return (Criteria) this;
        }

        public Criteria andType04NotBetween(String value1, String value2) {
            addCriterion("type04 not between", value1, value2, "type04");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andArticleMessageIsNull() {
            addCriterion("article_message is null");
            return (Criteria) this;
        }

        public Criteria andArticleMessageIsNotNull() {
            addCriterion("article_message is not null");
            return (Criteria) this;
        }

        public Criteria andArticleMessageEqualTo(String value) {
            addCriterion("article_message =", value, "articleMessage");
            return (Criteria) this;
        }

        public Criteria andArticleMessageNotEqualTo(String value) {
            addCriterion("article_message <>", value, "articleMessage");
            return (Criteria) this;
        }

        public Criteria andArticleMessageGreaterThan(String value) {
            addCriterion("article_message >", value, "articleMessage");
            return (Criteria) this;
        }

        public Criteria andArticleMessageGreaterThanOrEqualTo(String value) {
            addCriterion("article_message >=", value, "articleMessage");
            return (Criteria) this;
        }

        public Criteria andArticleMessageLessThan(String value) {
            addCriterion("article_message <", value, "articleMessage");
            return (Criteria) this;
        }

        public Criteria andArticleMessageLessThanOrEqualTo(String value) {
            addCriterion("article_message <=", value, "articleMessage");
            return (Criteria) this;
        }

        public Criteria andArticleMessageLike(String value) {
            addCriterion("article_message like", value, "articleMessage");
            return (Criteria) this;
        }

        public Criteria andArticleMessageNotLike(String value) {
            addCriterion("article_message not like", value, "articleMessage");
            return (Criteria) this;
        }

        public Criteria andArticleMessageIn(List<String> values) {
            addCriterion("article_message in", values, "articleMessage");
            return (Criteria) this;
        }

        public Criteria andArticleMessageNotIn(List<String> values) {
            addCriterion("article_message not in", values, "articleMessage");
            return (Criteria) this;
        }

        public Criteria andArticleMessageBetween(String value1, String value2) {
            addCriterion("article_message between", value1, value2, "articleMessage");
            return (Criteria) this;
        }

        public Criteria andArticleMessageNotBetween(String value1, String value2) {
            addCriterion("article_message not between", value1, value2, "articleMessage");
            return (Criteria) this;
        }

        public Criteria andDataIsNull() {
            addCriterion("data is null");
            return (Criteria) this;
        }

        public Criteria andDataIsNotNull() {
            addCriterion("data is not null");
            return (Criteria) this;
        }

        public Criteria andDataEqualTo(Date value) {
            addCriterion("data =", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotEqualTo(Date value) {
            addCriterion("data <>", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThan(Date value) {
            addCriterion("data >", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThanOrEqualTo(Date value) {
            addCriterion("data >=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThan(Date value) {
            addCriterion("data <", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThanOrEqualTo(Date value) {
            addCriterion("data <=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataIn(List<Date> values) {
            addCriterion("data in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotIn(List<Date> values) {
            addCriterion("data not in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataBetween(Date value1, Date value2) {
            addCriterion("data between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotBetween(Date value1, Date value2) {
            addCriterion("data not between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andArticleTextIsNull() {
            addCriterion("article_text is null");
            return (Criteria) this;
        }

        public Criteria andArticleTextIsNotNull() {
            addCriterion("article_text is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTextEqualTo(String value) {
            addCriterion("article_text =", value, "articleText");
            return (Criteria) this;
        }

        public Criteria andArticleTextNotEqualTo(String value) {
            addCriterion("article_text <>", value, "articleText");
            return (Criteria) this;
        }

        public Criteria andArticleTextGreaterThan(String value) {
            addCriterion("article_text >", value, "articleText");
            return (Criteria) this;
        }

        public Criteria andArticleTextGreaterThanOrEqualTo(String value) {
            addCriterion("article_text >=", value, "articleText");
            return (Criteria) this;
        }

        public Criteria andArticleTextLessThan(String value) {
            addCriterion("article_text <", value, "articleText");
            return (Criteria) this;
        }

        public Criteria andArticleTextLessThanOrEqualTo(String value) {
            addCriterion("article_text <=", value, "articleText");
            return (Criteria) this;
        }

        public Criteria andArticleTextLike(String value) {
            addCriterion("article_text like", value, "articleText");
            return (Criteria) this;
        }

        public Criteria andArticleTextNotLike(String value) {
            addCriterion("article_text not like", value, "articleText");
            return (Criteria) this;
        }

        public Criteria andArticleTextIn(List<String> values) {
            addCriterion("article_text in", values, "articleText");
            return (Criteria) this;
        }

        public Criteria andArticleTextNotIn(List<String> values) {
            addCriterion("article_text not in", values, "articleText");
            return (Criteria) this;
        }

        public Criteria andArticleTextBetween(String value1, String value2) {
            addCriterion("article_text between", value1, value2, "articleText");
            return (Criteria) this;
        }

        public Criteria andArticleTextNotBetween(String value1, String value2) {
            addCriterion("article_text not between", value1, value2, "articleText");
            return (Criteria) this;
        }

        public Criteria andIntroductionTitleIsNull() {
            addCriterion("introduction_title is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionTitleIsNotNull() {
            addCriterion("introduction_title is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionTitleEqualTo(String value) {
            addCriterion("introduction_title =", value, "introductionTitle");
            return (Criteria) this;
        }

        public Criteria andIntroductionTitleNotEqualTo(String value) {
            addCriterion("introduction_title <>", value, "introductionTitle");
            return (Criteria) this;
        }

        public Criteria andIntroductionTitleGreaterThan(String value) {
            addCriterion("introduction_title >", value, "introductionTitle");
            return (Criteria) this;
        }

        public Criteria andIntroductionTitleGreaterThanOrEqualTo(String value) {
            addCriterion("introduction_title >=", value, "introductionTitle");
            return (Criteria) this;
        }

        public Criteria andIntroductionTitleLessThan(String value) {
            addCriterion("introduction_title <", value, "introductionTitle");
            return (Criteria) this;
        }

        public Criteria andIntroductionTitleLessThanOrEqualTo(String value) {
            addCriterion("introduction_title <=", value, "introductionTitle");
            return (Criteria) this;
        }

        public Criteria andIntroductionTitleLike(String value) {
            addCriterion("introduction_title like", value, "introductionTitle");
            return (Criteria) this;
        }

        public Criteria andIntroductionTitleNotLike(String value) {
            addCriterion("introduction_title not like", value, "introductionTitle");
            return (Criteria) this;
        }

        public Criteria andIntroductionTitleIn(List<String> values) {
            addCriterion("introduction_title in", values, "introductionTitle");
            return (Criteria) this;
        }

        public Criteria andIntroductionTitleNotIn(List<String> values) {
            addCriterion("introduction_title not in", values, "introductionTitle");
            return (Criteria) this;
        }

        public Criteria andIntroductionTitleBetween(String value1, String value2) {
            addCriterion("introduction_title between", value1, value2, "introductionTitle");
            return (Criteria) this;
        }

        public Criteria andIntroductionTitleNotBetween(String value1, String value2) {
            addCriterion("introduction_title not between", value1, value2, "introductionTitle");
            return (Criteria) this;
        }

        public Criteria andIntroductionImgUrlIsNull() {
            addCriterion("introduction_img_url is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionImgUrlIsNotNull() {
            addCriterion("introduction_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionImgUrlEqualTo(String value) {
            addCriterion("introduction_img_url =", value, "introductionImgUrl");
            return (Criteria) this;
        }

        public Criteria andIntroductionImgUrlNotEqualTo(String value) {
            addCriterion("introduction_img_url <>", value, "introductionImgUrl");
            return (Criteria) this;
        }

        public Criteria andIntroductionImgUrlGreaterThan(String value) {
            addCriterion("introduction_img_url >", value, "introductionImgUrl");
            return (Criteria) this;
        }

        public Criteria andIntroductionImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("introduction_img_url >=", value, "introductionImgUrl");
            return (Criteria) this;
        }

        public Criteria andIntroductionImgUrlLessThan(String value) {
            addCriterion("introduction_img_url <", value, "introductionImgUrl");
            return (Criteria) this;
        }

        public Criteria andIntroductionImgUrlLessThanOrEqualTo(String value) {
            addCriterion("introduction_img_url <=", value, "introductionImgUrl");
            return (Criteria) this;
        }

        public Criteria andIntroductionImgUrlLike(String value) {
            addCriterion("introduction_img_url like", value, "introductionImgUrl");
            return (Criteria) this;
        }

        public Criteria andIntroductionImgUrlNotLike(String value) {
            addCriterion("introduction_img_url not like", value, "introductionImgUrl");
            return (Criteria) this;
        }

        public Criteria andIntroductionImgUrlIn(List<String> values) {
            addCriterion("introduction_img_url in", values, "introductionImgUrl");
            return (Criteria) this;
        }

        public Criteria andIntroductionImgUrlNotIn(List<String> values) {
            addCriterion("introduction_img_url not in", values, "introductionImgUrl");
            return (Criteria) this;
        }

        public Criteria andIntroductionImgUrlBetween(String value1, String value2) {
            addCriterion("introduction_img_url between", value1, value2, "introductionImgUrl");
            return (Criteria) this;
        }

        public Criteria andIntroductionImgUrlNotBetween(String value1, String value2) {
            addCriterion("introduction_img_url not between", value1, value2, "introductionImgUrl");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateIsNull() {
            addCriterion("introduction_date is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateIsNotNull() {
            addCriterion("introduction_date is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateEqualTo(String value) {
            addCriterion("introduction_date =", value, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateNotEqualTo(String value) {
            addCriterion("introduction_date <>", value, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateGreaterThan(String value) {
            addCriterion("introduction_date >", value, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateGreaterThanOrEqualTo(String value) {
            addCriterion("introduction_date >=", value, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateLessThan(String value) {
            addCriterion("introduction_date <", value, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateLessThanOrEqualTo(String value) {
            addCriterion("introduction_date <=", value, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateLike(String value) {
            addCriterion("introduction_date like", value, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateNotLike(String value) {
            addCriterion("introduction_date not like", value, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateIn(List<String> values) {
            addCriterion("introduction_date in", values, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateNotIn(List<String> values) {
            addCriterion("introduction_date not in", values, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateBetween(String value1, String value2) {
            addCriterion("introduction_date between", value1, value2, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateNotBetween(String value1, String value2) {
            addCriterion("introduction_date not between", value1, value2, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionTextIsNull() {
            addCriterion("introduction_text is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionTextIsNotNull() {
            addCriterion("introduction_text is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionTextEqualTo(String value) {
            addCriterion("introduction_text =", value, "introductionText");
            return (Criteria) this;
        }

        public Criteria andIntroductionTextNotEqualTo(String value) {
            addCriterion("introduction_text <>", value, "introductionText");
            return (Criteria) this;
        }

        public Criteria andIntroductionTextGreaterThan(String value) {
            addCriterion("introduction_text >", value, "introductionText");
            return (Criteria) this;
        }

        public Criteria andIntroductionTextGreaterThanOrEqualTo(String value) {
            addCriterion("introduction_text >=", value, "introductionText");
            return (Criteria) this;
        }

        public Criteria andIntroductionTextLessThan(String value) {
            addCriterion("introduction_text <", value, "introductionText");
            return (Criteria) this;
        }

        public Criteria andIntroductionTextLessThanOrEqualTo(String value) {
            addCriterion("introduction_text <=", value, "introductionText");
            return (Criteria) this;
        }

        public Criteria andIntroductionTextLike(String value) {
            addCriterion("introduction_text like", value, "introductionText");
            return (Criteria) this;
        }

        public Criteria andIntroductionTextNotLike(String value) {
            addCriterion("introduction_text not like", value, "introductionText");
            return (Criteria) this;
        }

        public Criteria andIntroductionTextIn(List<String> values) {
            addCriterion("introduction_text in", values, "introductionText");
            return (Criteria) this;
        }

        public Criteria andIntroductionTextNotIn(List<String> values) {
            addCriterion("introduction_text not in", values, "introductionText");
            return (Criteria) this;
        }

        public Criteria andIntroductionTextBetween(String value1, String value2) {
            addCriterion("introduction_text between", value1, value2, "introductionText");
            return (Criteria) this;
        }

        public Criteria andIntroductionTextNotBetween(String value1, String value2) {
            addCriterion("introduction_text not between", value1, value2, "introductionText");
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