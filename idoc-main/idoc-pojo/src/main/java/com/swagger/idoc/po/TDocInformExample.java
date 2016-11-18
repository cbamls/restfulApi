package com.swagger.idoc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDocInformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDocInformExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andInformTimeIsNull() {
            addCriterion("inform_time is null");
            return (Criteria) this;
        }

        public Criteria andInformTimeIsNotNull() {
            addCriterion("inform_time is not null");
            return (Criteria) this;
        }

        public Criteria andInformTimeEqualTo(Date value) {
            addCriterion("inform_time =", value, "informTime");
            return (Criteria) this;
        }

        public Criteria andInformTimeNotEqualTo(Date value) {
            addCriterion("inform_time <>", value, "informTime");
            return (Criteria) this;
        }

        public Criteria andInformTimeGreaterThan(Date value) {
            addCriterion("inform_time >", value, "informTime");
            return (Criteria) this;
        }

        public Criteria andInformTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("inform_time >=", value, "informTime");
            return (Criteria) this;
        }

        public Criteria andInformTimeLessThan(Date value) {
            addCriterion("inform_time <", value, "informTime");
            return (Criteria) this;
        }

        public Criteria andInformTimeLessThanOrEqualTo(Date value) {
            addCriterion("inform_time <=", value, "informTime");
            return (Criteria) this;
        }

        public Criteria andInformTimeIn(List<Date> values) {
            addCriterion("inform_time in", values, "informTime");
            return (Criteria) this;
        }

        public Criteria andInformTimeNotIn(List<Date> values) {
            addCriterion("inform_time not in", values, "informTime");
            return (Criteria) this;
        }

        public Criteria andInformTimeBetween(Date value1, Date value2) {
            addCriterion("inform_time between", value1, value2, "informTime");
            return (Criteria) this;
        }

        public Criteria andInformTimeNotBetween(Date value1, Date value2) {
            addCriterion("inform_time not between", value1, value2, "informTime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andIfReadIsNull() {
            addCriterion("if_read is null");
            return (Criteria) this;
        }

        public Criteria andIfReadIsNotNull() {
            addCriterion("if_read is not null");
            return (Criteria) this;
        }

        public Criteria andIfReadEqualTo(Byte value) {
            addCriterion("if_read =", value, "ifRead");
            return (Criteria) this;
        }

        public Criteria andIfReadNotEqualTo(Byte value) {
            addCriterion("if_read <>", value, "ifRead");
            return (Criteria) this;
        }

        public Criteria andIfReadGreaterThan(Byte value) {
            addCriterion("if_read >", value, "ifRead");
            return (Criteria) this;
        }

        public Criteria andIfReadGreaterThanOrEqualTo(Byte value) {
            addCriterion("if_read >=", value, "ifRead");
            return (Criteria) this;
        }

        public Criteria andIfReadLessThan(Byte value) {
            addCriterion("if_read <", value, "ifRead");
            return (Criteria) this;
        }

        public Criteria andIfReadLessThanOrEqualTo(Byte value) {
            addCriterion("if_read <=", value, "ifRead");
            return (Criteria) this;
        }

        public Criteria andIfReadIn(List<Byte> values) {
            addCriterion("if_read in", values, "ifRead");
            return (Criteria) this;
        }

        public Criteria andIfReadNotIn(List<Byte> values) {
            addCriterion("if_read not in", values, "ifRead");
            return (Criteria) this;
        }

        public Criteria andIfReadBetween(Byte value1, Byte value2) {
            addCriterion("if_read between", value1, value2, "ifRead");
            return (Criteria) this;
        }

        public Criteria andIfReadNotBetween(Byte value1, Byte value2) {
            addCriterion("if_read not between", value1, value2, "ifRead");
            return (Criteria) this;
        }

        public Criteria andCusIdIsNull() {
            addCriterion("cus_id is null");
            return (Criteria) this;
        }

        public Criteria andCusIdIsNotNull() {
            addCriterion("cus_id is not null");
            return (Criteria) this;
        }

        public Criteria andCusIdEqualTo(Integer value) {
            addCriterion("cus_id =", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotEqualTo(Integer value) {
            addCriterion("cus_id <>", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThan(Integer value) {
            addCriterion("cus_id >", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cus_id >=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThan(Integer value) {
            addCriterion("cus_id <", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThanOrEqualTo(Integer value) {
            addCriterion("cus_id <=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdIn(List<Integer> values) {
            addCriterion("cus_id in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotIn(List<Integer> values) {
            addCriterion("cus_id not in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdBetween(Integer value1, Integer value2) {
            addCriterion("cus_id between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cus_id not between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andInformTypeIsNull() {
            addCriterion("inform_type is null");
            return (Criteria) this;
        }

        public Criteria andInformTypeIsNotNull() {
            addCriterion("inform_type is not null");
            return (Criteria) this;
        }

        public Criteria andInformTypeEqualTo(String value) {
            addCriterion("inform_type =", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeNotEqualTo(String value) {
            addCriterion("inform_type <>", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeGreaterThan(String value) {
            addCriterion("inform_type >", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeGreaterThanOrEqualTo(String value) {
            addCriterion("inform_type >=", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeLessThan(String value) {
            addCriterion("inform_type <", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeLessThanOrEqualTo(String value) {
            addCriterion("inform_type <=", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeLike(String value) {
            addCriterion("inform_type like", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeNotLike(String value) {
            addCriterion("inform_type not like", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeIn(List<String> values) {
            addCriterion("inform_type in", values, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeNotIn(List<String> values) {
            addCriterion("inform_type not in", values, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeBetween(String value1, String value2) {
            addCriterion("inform_type between", value1, value2, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeNotBetween(String value1, String value2) {
            addCriterion("inform_type not between", value1, value2, "informType");
            return (Criteria) this;
        }

        public Criteria andCancelIsNull() {
            addCriterion("cancel is null");
            return (Criteria) this;
        }

        public Criteria andCancelIsNotNull() {
            addCriterion("cancel is not null");
            return (Criteria) this;
        }

        public Criteria andCancelEqualTo(Boolean value) {
            addCriterion("cancel =", value, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelNotEqualTo(Boolean value) {
            addCriterion("cancel <>", value, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelGreaterThan(Boolean value) {
            addCriterion("cancel >", value, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cancel >=", value, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelLessThan(Boolean value) {
            addCriterion("cancel <", value, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelLessThanOrEqualTo(Boolean value) {
            addCriterion("cancel <=", value, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelIn(List<Boolean> values) {
            addCriterion("cancel in", values, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelNotIn(List<Boolean> values) {
            addCriterion("cancel not in", values, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelBetween(Boolean value1, Boolean value2) {
            addCriterion("cancel between", value1, value2, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cancel not between", value1, value2, "cancel");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("cancel_time =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("cancel_time <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("cancel_time >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_time >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("cancel_time <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("cancel_time <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("cancel_time in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("cancel_time not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("cancel_time between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("cancel_time not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(Integer value) {
            addCriterion("sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(Integer value) {
            addCriterion("sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(Integer value) {
            addCriterion("sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(Integer value) {
            addCriterion("sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(Integer value) {
            addCriterion("sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<Integer> values) {
            addCriterion("sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<Integer> values) {
            addCriterion("sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(Integer value1, Integer value2) {
            addCriterion("sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(Integer value1, Integer value2) {
            addCriterion("sender not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(Integer value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(Integer value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(Integer value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(Integer value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(Integer value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<Integer> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<Integer> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(Integer value1, Integer value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(Integer value1, Integer value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
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