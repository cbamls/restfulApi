package com.swagger.idoc.po;

import java.util.ArrayList;
import java.util.List;

public class TDocInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDocInfoExample() {
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

        public Criteria andDocIdIsNull() {
            addCriterion("doc_id is null");
            return (Criteria) this;
        }

        public Criteria andDocIdIsNotNull() {
            addCriterion("doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andDocIdEqualTo(Integer value) {
            addCriterion("doc_id =", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotEqualTo(Integer value) {
            addCriterion("doc_id <>", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdGreaterThan(Integer value) {
            addCriterion("doc_id >", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doc_id >=", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLessThan(Integer value) {
            addCriterion("doc_id <", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLessThanOrEqualTo(Integer value) {
            addCriterion("doc_id <=", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdIn(List<Integer> values) {
            addCriterion("doc_id in", values, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotIn(List<Integer> values) {
            addCriterion("doc_id not in", values, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdBetween(Integer value1, Integer value2) {
            addCriterion("doc_id between", value1, value2, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doc_id not between", value1, value2, "docId");
            return (Criteria) this;
        }

        public Criteria andVersionDocIsNull() {
            addCriterion("version_doc is null");
            return (Criteria) this;
        }

        public Criteria andVersionDocIsNotNull() {
            addCriterion("version_doc is not null");
            return (Criteria) this;
        }

        public Criteria andVersionDocEqualTo(String value) {
            addCriterion("version_doc =", value, "versionDoc");
            return (Criteria) this;
        }

        public Criteria andVersionDocNotEqualTo(String value) {
            addCriterion("version_doc <>", value, "versionDoc");
            return (Criteria) this;
        }

        public Criteria andVersionDocGreaterThan(String value) {
            addCriterion("version_doc >", value, "versionDoc");
            return (Criteria) this;
        }

        public Criteria andVersionDocGreaterThanOrEqualTo(String value) {
            addCriterion("version_doc >=", value, "versionDoc");
            return (Criteria) this;
        }

        public Criteria andVersionDocLessThan(String value) {
            addCriterion("version_doc <", value, "versionDoc");
            return (Criteria) this;
        }

        public Criteria andVersionDocLessThanOrEqualTo(String value) {
            addCriterion("version_doc <=", value, "versionDoc");
            return (Criteria) this;
        }

        public Criteria andVersionDocLike(String value) {
            addCriterion("version_doc like", value, "versionDoc");
            return (Criteria) this;
        }

        public Criteria andVersionDocNotLike(String value) {
            addCriterion("version_doc not like", value, "versionDoc");
            return (Criteria) this;
        }

        public Criteria andVersionDocIn(List<String> values) {
            addCriterion("version_doc in", values, "versionDoc");
            return (Criteria) this;
        }

        public Criteria andVersionDocNotIn(List<String> values) {
            addCriterion("version_doc not in", values, "versionDoc");
            return (Criteria) this;
        }

        public Criteria andVersionDocBetween(String value1, String value2) {
            addCriterion("version_doc between", value1, value2, "versionDoc");
            return (Criteria) this;
        }

        public Criteria andVersionDocNotBetween(String value1, String value2) {
            addCriterion("version_doc not between", value1, value2, "versionDoc");
            return (Criteria) this;
        }

        public Criteria andContactIdIsNull() {
            addCriterion("contact_id is null");
            return (Criteria) this;
        }

        public Criteria andContactIdIsNotNull() {
            addCriterion("contact_id is not null");
            return (Criteria) this;
        }

        public Criteria andContactIdEqualTo(Integer value) {
            addCriterion("contact_id =", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotEqualTo(Integer value) {
            addCriterion("contact_id <>", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdGreaterThan(Integer value) {
            addCriterion("contact_id >", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_id >=", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdLessThan(Integer value) {
            addCriterion("contact_id <", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdLessThanOrEqualTo(Integer value) {
            addCriterion("contact_id <=", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdIn(List<Integer> values) {
            addCriterion("contact_id in", values, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotIn(List<Integer> values) {
            addCriterion("contact_id not in", values, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdBetween(Integer value1, Integer value2) {
            addCriterion("contact_id between", value1, value2, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_id not between", value1, value2, "contactId");
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

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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