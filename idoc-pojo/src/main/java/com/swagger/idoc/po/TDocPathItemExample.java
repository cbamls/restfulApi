package com.swagger.idoc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDocPathItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDocPathItemExample() {
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

        public Criteria andPathIdIsNull() {
            addCriterion("path_id is null");
            return (Criteria) this;
        }

        public Criteria andPathIdIsNotNull() {
            addCriterion("path_id is not null");
            return (Criteria) this;
        }

        public Criteria andPathIdEqualTo(Integer value) {
            addCriterion("path_id =", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdNotEqualTo(Integer value) {
            addCriterion("path_id <>", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdGreaterThan(Integer value) {
            addCriterion("path_id >", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("path_id >=", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdLessThan(Integer value) {
            addCriterion("path_id <", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdLessThanOrEqualTo(Integer value) {
            addCriterion("path_id <=", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdIn(List<Integer> values) {
            addCriterion("path_id in", values, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdNotIn(List<Integer> values) {
            addCriterion("path_id not in", values, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdBetween(Integer value1, Integer value2) {
            addCriterion("path_id between", value1, value2, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdNotBetween(Integer value1, Integer value2) {
            addCriterion("path_id not between", value1, value2, "pathId");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNull() {
            addCriterion("protocol is null");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNotNull() {
            addCriterion("protocol is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolEqualTo(String value) {
            addCriterion("protocol =", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotEqualTo(String value) {
            addCriterion("protocol <>", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThan(String value) {
            addCriterion("protocol >", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThanOrEqualTo(String value) {
            addCriterion("protocol >=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThan(String value) {
            addCriterion("protocol <", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThanOrEqualTo(String value) {
            addCriterion("protocol <=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLike(String value) {
            addCriterion("protocol like", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotLike(String value) {
            addCriterion("protocol not like", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolIn(List<String> values) {
            addCriterion("protocol in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotIn(List<String> values) {
            addCriterion("protocol not in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolBetween(String value1, String value2) {
            addCriterion("protocol between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotBetween(String value1, String value2) {
            addCriterion("protocol not between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andTagIdsIsNull() {
            addCriterion("tag_ids is null");
            return (Criteria) this;
        }

        public Criteria andTagIdsIsNotNull() {
            addCriterion("tag_ids is not null");
            return (Criteria) this;
        }

        public Criteria andTagIdsEqualTo(String value) {
            addCriterion("tag_ids =", value, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsNotEqualTo(String value) {
            addCriterion("tag_ids <>", value, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsGreaterThan(String value) {
            addCriterion("tag_ids >", value, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsGreaterThanOrEqualTo(String value) {
            addCriterion("tag_ids >=", value, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsLessThan(String value) {
            addCriterion("tag_ids <", value, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsLessThanOrEqualTo(String value) {
            addCriterion("tag_ids <=", value, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsLike(String value) {
            addCriterion("tag_ids like", value, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsNotLike(String value) {
            addCriterion("tag_ids not like", value, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsIn(List<String> values) {
            addCriterion("tag_ids in", values, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsNotIn(List<String> values) {
            addCriterion("tag_ids not in", values, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsBetween(String value1, String value2) {
            addCriterion("tag_ids between", value1, value2, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsNotBetween(String value1, String value2) {
            addCriterion("tag_ids not between", value1, value2, "tagIds");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andOperationIsNull() {
            addCriterion("operation is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("operation is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(String value) {
            addCriterion("operation =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("operation <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(String value) {
            addCriterion("operation >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("operation >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(String value) {
            addCriterion("operation <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("operation <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLike(String value) {
            addCriterion("operation like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotLike(String value) {
            addCriterion("operation not like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<String> values) {
            addCriterion("operation in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<String> values) {
            addCriterion("operation not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("operation between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("operation not between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andConsumesIsNull() {
            addCriterion("consumes is null");
            return (Criteria) this;
        }

        public Criteria andConsumesIsNotNull() {
            addCriterion("consumes is not null");
            return (Criteria) this;
        }

        public Criteria andConsumesEqualTo(String value) {
            addCriterion("consumes =", value, "consumes");
            return (Criteria) this;
        }

        public Criteria andConsumesNotEqualTo(String value) {
            addCriterion("consumes <>", value, "consumes");
            return (Criteria) this;
        }

        public Criteria andConsumesGreaterThan(String value) {
            addCriterion("consumes >", value, "consumes");
            return (Criteria) this;
        }

        public Criteria andConsumesGreaterThanOrEqualTo(String value) {
            addCriterion("consumes >=", value, "consumes");
            return (Criteria) this;
        }

        public Criteria andConsumesLessThan(String value) {
            addCriterion("consumes <", value, "consumes");
            return (Criteria) this;
        }

        public Criteria andConsumesLessThanOrEqualTo(String value) {
            addCriterion("consumes <=", value, "consumes");
            return (Criteria) this;
        }

        public Criteria andConsumesLike(String value) {
            addCriterion("consumes like", value, "consumes");
            return (Criteria) this;
        }

        public Criteria andConsumesNotLike(String value) {
            addCriterion("consumes not like", value, "consumes");
            return (Criteria) this;
        }

        public Criteria andConsumesIn(List<String> values) {
            addCriterion("consumes in", values, "consumes");
            return (Criteria) this;
        }

        public Criteria andConsumesNotIn(List<String> values) {
            addCriterion("consumes not in", values, "consumes");
            return (Criteria) this;
        }

        public Criteria andConsumesBetween(String value1, String value2) {
            addCriterion("consumes between", value1, value2, "consumes");
            return (Criteria) this;
        }

        public Criteria andConsumesNotBetween(String value1, String value2) {
            addCriterion("consumes not between", value1, value2, "consumes");
            return (Criteria) this;
        }

        public Criteria andProducesIsNull() {
            addCriterion("produces is null");
            return (Criteria) this;
        }

        public Criteria andProducesIsNotNull() {
            addCriterion("produces is not null");
            return (Criteria) this;
        }

        public Criteria andProducesEqualTo(String value) {
            addCriterion("produces =", value, "produces");
            return (Criteria) this;
        }

        public Criteria andProducesNotEqualTo(String value) {
            addCriterion("produces <>", value, "produces");
            return (Criteria) this;
        }

        public Criteria andProducesGreaterThan(String value) {
            addCriterion("produces >", value, "produces");
            return (Criteria) this;
        }

        public Criteria andProducesGreaterThanOrEqualTo(String value) {
            addCriterion("produces >=", value, "produces");
            return (Criteria) this;
        }

        public Criteria andProducesLessThan(String value) {
            addCriterion("produces <", value, "produces");
            return (Criteria) this;
        }

        public Criteria andProducesLessThanOrEqualTo(String value) {
            addCriterion("produces <=", value, "produces");
            return (Criteria) this;
        }

        public Criteria andProducesLike(String value) {
            addCriterion("produces like", value, "produces");
            return (Criteria) this;
        }

        public Criteria andProducesNotLike(String value) {
            addCriterion("produces not like", value, "produces");
            return (Criteria) this;
        }

        public Criteria andProducesIn(List<String> values) {
            addCriterion("produces in", values, "produces");
            return (Criteria) this;
        }

        public Criteria andProducesNotIn(List<String> values) {
            addCriterion("produces not in", values, "produces");
            return (Criteria) this;
        }

        public Criteria andProducesBetween(String value1, String value2) {
            addCriterion("produces between", value1, value2, "produces");
            return (Criteria) this;
        }

        public Criteria andProducesNotBetween(String value1, String value2) {
            addCriterion("produces not between", value1, value2, "produces");
            return (Criteria) this;
        }

        public Criteria andAppProtocolIsNull() {
            addCriterion("app_protocol is null");
            return (Criteria) this;
        }

        public Criteria andAppProtocolIsNotNull() {
            addCriterion("app_protocol is not null");
            return (Criteria) this;
        }

        public Criteria andAppProtocolEqualTo(String value) {
            addCriterion("app_protocol =", value, "appProtocol");
            return (Criteria) this;
        }

        public Criteria andAppProtocolNotEqualTo(String value) {
            addCriterion("app_protocol <>", value, "appProtocol");
            return (Criteria) this;
        }

        public Criteria andAppProtocolGreaterThan(String value) {
            addCriterion("app_protocol >", value, "appProtocol");
            return (Criteria) this;
        }

        public Criteria andAppProtocolGreaterThanOrEqualTo(String value) {
            addCriterion("app_protocol >=", value, "appProtocol");
            return (Criteria) this;
        }

        public Criteria andAppProtocolLessThan(String value) {
            addCriterion("app_protocol <", value, "appProtocol");
            return (Criteria) this;
        }

        public Criteria andAppProtocolLessThanOrEqualTo(String value) {
            addCriterion("app_protocol <=", value, "appProtocol");
            return (Criteria) this;
        }

        public Criteria andAppProtocolLike(String value) {
            addCriterion("app_protocol like", value, "appProtocol");
            return (Criteria) this;
        }

        public Criteria andAppProtocolNotLike(String value) {
            addCriterion("app_protocol not like", value, "appProtocol");
            return (Criteria) this;
        }

        public Criteria andAppProtocolIn(List<String> values) {
            addCriterion("app_protocol in", values, "appProtocol");
            return (Criteria) this;
        }

        public Criteria andAppProtocolNotIn(List<String> values) {
            addCriterion("app_protocol not in", values, "appProtocol");
            return (Criteria) this;
        }

        public Criteria andAppProtocolBetween(String value1, String value2) {
            addCriterion("app_protocol between", value1, value2, "appProtocol");
            return (Criteria) this;
        }

        public Criteria andAppProtocolNotBetween(String value1, String value2) {
            addCriterion("app_protocol not between", value1, value2, "appProtocol");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andInterCodeIsNull() {
            addCriterion("inter_code is null");
            return (Criteria) this;
        }

        public Criteria andInterCodeIsNotNull() {
            addCriterion("inter_code is not null");
            return (Criteria) this;
        }

        public Criteria andInterCodeEqualTo(String value) {
            addCriterion("inter_code =", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeNotEqualTo(String value) {
            addCriterion("inter_code <>", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeGreaterThan(String value) {
            addCriterion("inter_code >", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("inter_code >=", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeLessThan(String value) {
            addCriterion("inter_code <", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeLessThanOrEqualTo(String value) {
            addCriterion("inter_code <=", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeLike(String value) {
            addCriterion("inter_code like", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeNotLike(String value) {
            addCriterion("inter_code not like", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeIn(List<String> values) {
            addCriterion("inter_code in", values, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeNotIn(List<String> values) {
            addCriterion("inter_code not in", values, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeBetween(String value1, String value2) {
            addCriterion("inter_code between", value1, value2, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeNotBetween(String value1, String value2) {
            addCriterion("inter_code not between", value1, value2, "interCode");
            return (Criteria) this;
        }

        public Criteria andIfValidIsNull() {
            addCriterion("if_valid is null");
            return (Criteria) this;
        }

        public Criteria andIfValidIsNotNull() {
            addCriterion("if_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIfValidEqualTo(Byte value) {
            addCriterion("if_valid =", value, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidNotEqualTo(Byte value) {
            addCriterion("if_valid <>", value, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidGreaterThan(Byte value) {
            addCriterion("if_valid >", value, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("if_valid >=", value, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidLessThan(Byte value) {
            addCriterion("if_valid <", value, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidLessThanOrEqualTo(Byte value) {
            addCriterion("if_valid <=", value, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidIn(List<Byte> values) {
            addCriterion("if_valid in", values, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidNotIn(List<Byte> values) {
            addCriterion("if_valid not in", values, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidBetween(Byte value1, Byte value2) {
            addCriterion("if_valid between", value1, value2, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidNotBetween(Byte value1, Byte value2) {
            addCriterion("if_valid not between", value1, value2, "ifValid");
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