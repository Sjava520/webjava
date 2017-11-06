package com.ssmsping.po;

import java.util.ArrayList;
import java.util.List;

public class MobilepoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MobilepoExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNull() {
            addCriterion("MobileNumber is null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNotNull() {
            addCriterion("MobileNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberEqualTo(Integer value) {
            addCriterion("MobileNumber =", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotEqualTo(Integer value) {
            addCriterion("MobileNumber <>", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThan(Integer value) {
            addCriterion("MobileNumber >", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("MobileNumber >=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThan(Integer value) {
            addCriterion("MobileNumber <", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThanOrEqualTo(Integer value) {
            addCriterion("MobileNumber <=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIn(List<Integer> values) {
            addCriterion("MobileNumber in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotIn(List<Integer> values) {
            addCriterion("MobileNumber not in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberBetween(Integer value1, Integer value2) {
            addCriterion("MobileNumber between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("MobileNumber not between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobileareaIsNull() {
            addCriterion("MobileArea is null");
            return (Criteria) this;
        }

        public Criteria andMobileareaIsNotNull() {
            addCriterion("MobileArea is not null");
            return (Criteria) this;
        }

        public Criteria andMobileareaEqualTo(String value) {
            addCriterion("MobileArea =", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaNotEqualTo(String value) {
            addCriterion("MobileArea <>", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaGreaterThan(String value) {
            addCriterion("MobileArea >", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaGreaterThanOrEqualTo(String value) {
            addCriterion("MobileArea >=", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaLessThan(String value) {
            addCriterion("MobileArea <", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaLessThanOrEqualTo(String value) {
            addCriterion("MobileArea <=", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaLike(String value) {
            addCriterion("MobileArea like", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaNotLike(String value) {
            addCriterion("MobileArea not like", value, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaIn(List<String> values) {
            addCriterion("MobileArea in", values, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaNotIn(List<String> values) {
            addCriterion("MobileArea not in", values, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaBetween(String value1, String value2) {
            addCriterion("MobileArea between", value1, value2, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobileareaNotBetween(String value1, String value2) {
            addCriterion("MobileArea not between", value1, value2, "mobilearea");
            return (Criteria) this;
        }

        public Criteria andMobiletypeIsNull() {
            addCriterion("MobileType is null");
            return (Criteria) this;
        }

        public Criteria andMobiletypeIsNotNull() {
            addCriterion("MobileType is not null");
            return (Criteria) this;
        }

        public Criteria andMobiletypeEqualTo(String value) {
            addCriterion("MobileType =", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeNotEqualTo(String value) {
            addCriterion("MobileType <>", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeGreaterThan(String value) {
            addCriterion("MobileType >", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("MobileType >=", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeLessThan(String value) {
            addCriterion("MobileType <", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeLessThanOrEqualTo(String value) {
            addCriterion("MobileType <=", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeLike(String value) {
            addCriterion("MobileType like", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeNotLike(String value) {
            addCriterion("MobileType not like", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeIn(List<String> values) {
            addCriterion("MobileType in", values, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeNotIn(List<String> values) {
            addCriterion("MobileType not in", values, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeBetween(String value1, String value2) {
            addCriterion("MobileType between", value1, value2, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeNotBetween(String value1, String value2) {
            addCriterion("MobileType not between", value1, value2, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("AreaCode is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("AreaCode is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(Integer value) {
            addCriterion("AreaCode =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(Integer value) {
            addCriterion("AreaCode <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(Integer value) {
            addCriterion("AreaCode >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AreaCode >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(Integer value) {
            addCriterion("AreaCode <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(Integer value) {
            addCriterion("AreaCode <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<Integer> values) {
            addCriterion("AreaCode in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<Integer> values) {
            addCriterion("AreaCode not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(Integer value1, Integer value2) {
            addCriterion("AreaCode between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(Integer value1, Integer value2) {
            addCriterion("AreaCode not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("PostCode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("PostCode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(Integer value) {
            addCriterion("PostCode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(Integer value) {
            addCriterion("PostCode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(Integer value) {
            addCriterion("PostCode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PostCode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(Integer value) {
            addCriterion("PostCode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(Integer value) {
            addCriterion("PostCode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<Integer> values) {
            addCriterion("PostCode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<Integer> values) {
            addCriterion("PostCode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(Integer value1, Integer value2) {
            addCriterion("PostCode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("PostCode not between", value1, value2, "postcode");
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