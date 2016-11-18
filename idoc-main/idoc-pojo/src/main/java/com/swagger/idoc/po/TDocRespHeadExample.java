package com.swagger.idoc.po;

import java.util.ArrayList;
import java.util.List;

public class TDocRespHeadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDocRespHeadExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNull() {
            addCriterion("appname is null");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNotNull() {
            addCriterion("appname is not null");
            return (Criteria) this;
        }

        public Criteria andAppnameEqualTo(String value) {
            addCriterion("appname =", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotEqualTo(String value) {
            addCriterion("appname <>", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThan(String value) {
            addCriterion("appname >", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThanOrEqualTo(String value) {
            addCriterion("appname >=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThan(String value) {
            addCriterion("appname <", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThanOrEqualTo(String value) {
            addCriterion("appname <=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLike(String value) {
            addCriterion("appname like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotLike(String value) {
            addCriterion("appname not like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameIn(List<String> values) {
            addCriterion("appname in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotIn(List<String> values) {
            addCriterion("appname not in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameBetween(String value1, String value2) {
            addCriterion("appname between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotBetween(String value1, String value2) {
            addCriterion("appname not between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andRequesturlIsNull() {
            addCriterion("requestUrl is null");
            return (Criteria) this;
        }

        public Criteria andRequesturlIsNotNull() {
            addCriterion("requestUrl is not null");
            return (Criteria) this;
        }

        public Criteria andRequesturlEqualTo(String value) {
            addCriterion("requestUrl =", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlNotEqualTo(String value) {
            addCriterion("requestUrl <>", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlGreaterThan(String value) {
            addCriterion("requestUrl >", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlGreaterThanOrEqualTo(String value) {
            addCriterion("requestUrl >=", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlLessThan(String value) {
            addCriterion("requestUrl <", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlLessThanOrEqualTo(String value) {
            addCriterion("requestUrl <=", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlLike(String value) {
            addCriterion("requestUrl like", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlNotLike(String value) {
            addCriterion("requestUrl not like", value, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlIn(List<String> values) {
            addCriterion("requestUrl in", values, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlNotIn(List<String> values) {
            addCriterion("requestUrl not in", values, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlBetween(String value1, String value2) {
            addCriterion("requestUrl between", value1, value2, "requesturl");
            return (Criteria) this;
        }

        public Criteria andRequesturlNotBetween(String value1, String value2) {
            addCriterion("requestUrl not between", value1, value2, "requesturl");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIsNull() {
            addCriterion("errorcode is null");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIsNotNull() {
            addCriterion("errorcode is not null");
            return (Criteria) this;
        }

        public Criteria andErrorcodeEqualTo(String value) {
            addCriterion("errorcode =", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotEqualTo(String value) {
            addCriterion("errorcode <>", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeGreaterThan(String value) {
            addCriterion("errorcode >", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("errorcode >=", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLessThan(String value) {
            addCriterion("errorcode <", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLessThanOrEqualTo(String value) {
            addCriterion("errorcode <=", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeLike(String value) {
            addCriterion("errorcode like", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotLike(String value) {
            addCriterion("errorcode not like", value, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeIn(List<String> values) {
            addCriterion("errorcode in", values, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotIn(List<String> values) {
            addCriterion("errorcode not in", values, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeBetween(String value1, String value2) {
            addCriterion("errorcode between", value1, value2, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrorcodeNotBetween(String value1, String value2) {
            addCriterion("errorcode not between", value1, value2, "errorcode");
            return (Criteria) this;
        }

        public Criteria andErrormsgIsNull() {
            addCriterion("errormsg is null");
            return (Criteria) this;
        }

        public Criteria andErrormsgIsNotNull() {
            addCriterion("errormsg is not null");
            return (Criteria) this;
        }

        public Criteria andErrormsgEqualTo(String value) {
            addCriterion("errormsg =", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotEqualTo(String value) {
            addCriterion("errormsg <>", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgGreaterThan(String value) {
            addCriterion("errormsg >", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgGreaterThanOrEqualTo(String value) {
            addCriterion("errormsg >=", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLessThan(String value) {
            addCriterion("errormsg <", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLessThanOrEqualTo(String value) {
            addCriterion("errormsg <=", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLike(String value) {
            addCriterion("errormsg like", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotLike(String value) {
            addCriterion("errormsg not like", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgIn(List<String> values) {
            addCriterion("errormsg in", values, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotIn(List<String> values) {
            addCriterion("errormsg not in", values, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgBetween(String value1, String value2) {
            addCriterion("errormsg between", value1, value2, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotBetween(String value1, String value2) {
            addCriterion("errormsg not between", value1, value2, "errormsg");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNull() {
            addCriterion("success is null");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNotNull() {
            addCriterion("success is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessEqualTo(Long value) {
            addCriterion("success =", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotEqualTo(Long value) {
            addCriterion("success <>", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThan(Long value) {
            addCriterion("success >", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThanOrEqualTo(Long value) {
            addCriterion("success >=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThan(Long value) {
            addCriterion("success <", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThanOrEqualTo(Long value) {
            addCriterion("success <=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessIn(List<Long> values) {
            addCriterion("success in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotIn(List<Long> values) {
            addCriterion("success not in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessBetween(Long value1, Long value2) {
            addCriterion("success between", value1, value2, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotBetween(Long value1, Long value2) {
            addCriterion("success not between", value1, value2, "success");
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