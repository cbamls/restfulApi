package com.swagger.idoc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TRightDocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRightDocExample() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andLicenceIsNull() {
            addCriterion("licence is null");
            return (Criteria) this;
        }

        public Criteria andLicenceIsNotNull() {
            addCriterion("licence is not null");
            return (Criteria) this;
        }

        public Criteria andLicenceEqualTo(Date value) {
            addCriterion("licence =", value, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceNotEqualTo(Date value) {
            addCriterion("licence <>", value, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceGreaterThan(Date value) {
            addCriterion("licence >", value, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceGreaterThanOrEqualTo(Date value) {
            addCriterion("licence >=", value, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceLessThan(Date value) {
            addCriterion("licence <", value, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceLessThanOrEqualTo(Date value) {
            addCriterion("licence <=", value, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceIn(List<Date> values) {
            addCriterion("licence in", values, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceNotIn(List<Date> values) {
            addCriterion("licence not in", values, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceBetween(Date value1, Date value2) {
            addCriterion("licence between", value1, value2, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceNotBetween(Date value1, Date value2) {
            addCriterion("licence not between", value1, value2, "licence");
            return (Criteria) this;
        }

        public Criteria andRightStrIsNull() {
            addCriterion("right_str is null");
            return (Criteria) this;
        }

        public Criteria andRightStrIsNotNull() {
            addCriterion("right_str is not null");
            return (Criteria) this;
        }

        public Criteria andRightStrEqualTo(String value) {
            addCriterion("right_str =", value, "rightStr");
            return (Criteria) this;
        }

        public Criteria andRightStrNotEqualTo(String value) {
            addCriterion("right_str <>", value, "rightStr");
            return (Criteria) this;
        }

        public Criteria andRightStrGreaterThan(String value) {
            addCriterion("right_str >", value, "rightStr");
            return (Criteria) this;
        }

        public Criteria andRightStrGreaterThanOrEqualTo(String value) {
            addCriterion("right_str >=", value, "rightStr");
            return (Criteria) this;
        }

        public Criteria andRightStrLessThan(String value) {
            addCriterion("right_str <", value, "rightStr");
            return (Criteria) this;
        }

        public Criteria andRightStrLessThanOrEqualTo(String value) {
            addCriterion("right_str <=", value, "rightStr");
            return (Criteria) this;
        }

        public Criteria andRightStrLike(String value) {
            addCriterion("right_str like", value, "rightStr");
            return (Criteria) this;
        }

        public Criteria andRightStrNotLike(String value) {
            addCriterion("right_str not like", value, "rightStr");
            return (Criteria) this;
        }

        public Criteria andRightStrIn(List<String> values) {
            addCriterion("right_str in", values, "rightStr");
            return (Criteria) this;
        }

        public Criteria andRightStrNotIn(List<String> values) {
            addCriterion("right_str not in", values, "rightStr");
            return (Criteria) this;
        }

        public Criteria andRightStrBetween(String value1, String value2) {
            addCriterion("right_str between", value1, value2, "rightStr");
            return (Criteria) this;
        }

        public Criteria andRightStrNotBetween(String value1, String value2) {
            addCriterion("right_str not between", value1, value2, "rightStr");
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