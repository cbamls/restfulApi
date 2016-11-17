package com.swagger.idoc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDocMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDocMainExample() {
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

        public Criteria andVersionSwaggerIsNull() {
            addCriterion("version_swagger is null");
            return (Criteria) this;
        }

        public Criteria andVersionSwaggerIsNotNull() {
            addCriterion("version_swagger is not null");
            return (Criteria) this;
        }

        public Criteria andVersionSwaggerEqualTo(String value) {
            addCriterion("version_swagger =", value, "versionSwagger");
            return (Criteria) this;
        }

        public Criteria andVersionSwaggerNotEqualTo(String value) {
            addCriterion("version_swagger <>", value, "versionSwagger");
            return (Criteria) this;
        }

        public Criteria andVersionSwaggerGreaterThan(String value) {
            addCriterion("version_swagger >", value, "versionSwagger");
            return (Criteria) this;
        }

        public Criteria andVersionSwaggerGreaterThanOrEqualTo(String value) {
            addCriterion("version_swagger >=", value, "versionSwagger");
            return (Criteria) this;
        }

        public Criteria andVersionSwaggerLessThan(String value) {
            addCriterion("version_swagger <", value, "versionSwagger");
            return (Criteria) this;
        }

        public Criteria andVersionSwaggerLessThanOrEqualTo(String value) {
            addCriterion("version_swagger <=", value, "versionSwagger");
            return (Criteria) this;
        }

        public Criteria andVersionSwaggerLike(String value) {
            addCriterion("version_swagger like", value, "versionSwagger");
            return (Criteria) this;
        }

        public Criteria andVersionSwaggerNotLike(String value) {
            addCriterion("version_swagger not like", value, "versionSwagger");
            return (Criteria) this;
        }

        public Criteria andVersionSwaggerIn(List<String> values) {
            addCriterion("version_swagger in", values, "versionSwagger");
            return (Criteria) this;
        }

        public Criteria andVersionSwaggerNotIn(List<String> values) {
            addCriterion("version_swagger not in", values, "versionSwagger");
            return (Criteria) this;
        }

        public Criteria andVersionSwaggerBetween(String value1, String value2) {
            addCriterion("version_swagger between", value1, value2, "versionSwagger");
            return (Criteria) this;
        }

        public Criteria andVersionSwaggerNotBetween(String value1, String value2) {
            addCriterion("version_swagger not between", value1, value2, "versionSwagger");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNull() {
            addCriterion("info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(Integer value) {
            addCriterion("info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(Integer value) {
            addCriterion("info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(Integer value) {
            addCriterion("info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(Integer value) {
            addCriterion("info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<Integer> values) {
            addCriterion("info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<Integer> values) {
            addCriterion("info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("info_id not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andHostIsNull() {
            addCriterion("host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andBasepathIsNull() {
            addCriterion("basePath is null");
            return (Criteria) this;
        }

        public Criteria andBasepathIsNotNull() {
            addCriterion("basePath is not null");
            return (Criteria) this;
        }

        public Criteria andBasepathEqualTo(String value) {
            addCriterion("basePath =", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathNotEqualTo(String value) {
            addCriterion("basePath <>", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathGreaterThan(String value) {
            addCriterion("basePath >", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathGreaterThanOrEqualTo(String value) {
            addCriterion("basePath >=", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathLessThan(String value) {
            addCriterion("basePath <", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathLessThanOrEqualTo(String value) {
            addCriterion("basePath <=", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathLike(String value) {
            addCriterion("basePath like", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathNotLike(String value) {
            addCriterion("basePath not like", value, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathIn(List<String> values) {
            addCriterion("basePath in", values, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathNotIn(List<String> values) {
            addCriterion("basePath not in", values, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathBetween(String value1, String value2) {
            addCriterion("basePath between", value1, value2, "basepath");
            return (Criteria) this;
        }

        public Criteria andBasepathNotBetween(String value1, String value2) {
            addCriterion("basePath not between", value1, value2, "basepath");
            return (Criteria) this;
        }

        public Criteria andSchemesIsNull() {
            addCriterion("schemes is null");
            return (Criteria) this;
        }

        public Criteria andSchemesIsNotNull() {
            addCriterion("schemes is not null");
            return (Criteria) this;
        }

        public Criteria andSchemesEqualTo(String value) {
            addCriterion("schemes =", value, "schemes");
            return (Criteria) this;
        }

        public Criteria andSchemesNotEqualTo(String value) {
            addCriterion("schemes <>", value, "schemes");
            return (Criteria) this;
        }

        public Criteria andSchemesGreaterThan(String value) {
            addCriterion("schemes >", value, "schemes");
            return (Criteria) this;
        }

        public Criteria andSchemesGreaterThanOrEqualTo(String value) {
            addCriterion("schemes >=", value, "schemes");
            return (Criteria) this;
        }

        public Criteria andSchemesLessThan(String value) {
            addCriterion("schemes <", value, "schemes");
            return (Criteria) this;
        }

        public Criteria andSchemesLessThanOrEqualTo(String value) {
            addCriterion("schemes <=", value, "schemes");
            return (Criteria) this;
        }

        public Criteria andSchemesLike(String value) {
            addCriterion("schemes like", value, "schemes");
            return (Criteria) this;
        }

        public Criteria andSchemesNotLike(String value) {
            addCriterion("schemes not like", value, "schemes");
            return (Criteria) this;
        }

        public Criteria andSchemesIn(List<String> values) {
            addCriterion("schemes in", values, "schemes");
            return (Criteria) this;
        }

        public Criteria andSchemesNotIn(List<String> values) {
            addCriterion("schemes not in", values, "schemes");
            return (Criteria) this;
        }

        public Criteria andSchemesBetween(String value1, String value2) {
            addCriterion("schemes between", value1, value2, "schemes");
            return (Criteria) this;
        }

        public Criteria andSchemesNotBetween(String value1, String value2) {
            addCriterion("schemes not between", value1, value2, "schemes");
            return (Criteria) this;
        }

        public Criteria andExternalDocIsNull() {
            addCriterion("external_doc is null");
            return (Criteria) this;
        }

        public Criteria andExternalDocIsNotNull() {
            addCriterion("external_doc is not null");
            return (Criteria) this;
        }

        public Criteria andExternalDocEqualTo(Integer value) {
            addCriterion("external_doc =", value, "externalDoc");
            return (Criteria) this;
        }

        public Criteria andExternalDocNotEqualTo(Integer value) {
            addCriterion("external_doc <>", value, "externalDoc");
            return (Criteria) this;
        }

        public Criteria andExternalDocGreaterThan(Integer value) {
            addCriterion("external_doc >", value, "externalDoc");
            return (Criteria) this;
        }

        public Criteria andExternalDocGreaterThanOrEqualTo(Integer value) {
            addCriterion("external_doc >=", value, "externalDoc");
            return (Criteria) this;
        }

        public Criteria andExternalDocLessThan(Integer value) {
            addCriterion("external_doc <", value, "externalDoc");
            return (Criteria) this;
        }

        public Criteria andExternalDocLessThanOrEqualTo(Integer value) {
            addCriterion("external_doc <=", value, "externalDoc");
            return (Criteria) this;
        }

        public Criteria andExternalDocIn(List<Integer> values) {
            addCriterion("external_doc in", values, "externalDoc");
            return (Criteria) this;
        }

        public Criteria andExternalDocNotIn(List<Integer> values) {
            addCriterion("external_doc not in", values, "externalDoc");
            return (Criteria) this;
        }

        public Criteria andExternalDocBetween(Integer value1, Integer value2) {
            addCriterion("external_doc between", value1, value2, "externalDoc");
            return (Criteria) this;
        }

        public Criteria andExternalDocNotBetween(Integer value1, Integer value2) {
            addCriterion("external_doc not between", value1, value2, "externalDoc");
            return (Criteria) this;
        }

        public Criteria andSecurityDefineIsNull() {
            addCriterion("security_define is null");
            return (Criteria) this;
        }

        public Criteria andSecurityDefineIsNotNull() {
            addCriterion("security_define is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityDefineEqualTo(Integer value) {
            addCriterion("security_define =", value, "securityDefine");
            return (Criteria) this;
        }

        public Criteria andSecurityDefineNotEqualTo(Integer value) {
            addCriterion("security_define <>", value, "securityDefine");
            return (Criteria) this;
        }

        public Criteria andSecurityDefineGreaterThan(Integer value) {
            addCriterion("security_define >", value, "securityDefine");
            return (Criteria) this;
        }

        public Criteria andSecurityDefineGreaterThanOrEqualTo(Integer value) {
            addCriterion("security_define >=", value, "securityDefine");
            return (Criteria) this;
        }

        public Criteria andSecurityDefineLessThan(Integer value) {
            addCriterion("security_define <", value, "securityDefine");
            return (Criteria) this;
        }

        public Criteria andSecurityDefineLessThanOrEqualTo(Integer value) {
            addCriterion("security_define <=", value, "securityDefine");
            return (Criteria) this;
        }

        public Criteria andSecurityDefineIn(List<Integer> values) {
            addCriterion("security_define in", values, "securityDefine");
            return (Criteria) this;
        }

        public Criteria andSecurityDefineNotIn(List<Integer> values) {
            addCriterion("security_define not in", values, "securityDefine");
            return (Criteria) this;
        }

        public Criteria andSecurityDefineBetween(Integer value1, Integer value2) {
            addCriterion("security_define between", value1, value2, "securityDefine");
            return (Criteria) this;
        }

        public Criteria andSecurityDefineNotBetween(Integer value1, Integer value2) {
            addCriterion("security_define not between", value1, value2, "securityDefine");
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

        public Criteria andPublishIsNull() {
            addCriterion("publish is null");
            return (Criteria) this;
        }

        public Criteria andPublishIsNotNull() {
            addCriterion("publish is not null");
            return (Criteria) this;
        }

        public Criteria andPublishEqualTo(Boolean value) {
            addCriterion("publish =", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotEqualTo(Boolean value) {
            addCriterion("publish <>", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThan(Boolean value) {
            addCriterion("publish >", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThanOrEqualTo(Boolean value) {
            addCriterion("publish >=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThan(Boolean value) {
            addCriterion("publish <", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThanOrEqualTo(Boolean value) {
            addCriterion("publish <=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishIn(List<Boolean> values) {
            addCriterion("publish in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotIn(List<Boolean> values) {
            addCriterion("publish not in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishBetween(Boolean value1, Boolean value2) {
            addCriterion("publish between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotBetween(Boolean value1, Boolean value2) {
            addCriterion("publish not between", value1, value2, "publish");
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