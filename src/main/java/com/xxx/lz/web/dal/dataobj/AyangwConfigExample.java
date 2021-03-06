package com.xxx.lz.web.dal.dataobj;

import java.util.ArrayList;
import java.util.List;

public class AyangwConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AyangwConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
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

        public Criteria andAyangwKIsNull() {
            addCriterion("ayangw_k is null");
            return (Criteria) this;
        }

        public Criteria andAyangwKIsNotNull() {
            addCriterion("ayangw_k is not null");
            return (Criteria) this;
        }

        public Criteria andAyangwKEqualTo(String value) {
            addCriterion("ayangw_k =", value, "ayangwK");
            return (Criteria) this;
        }

        public Criteria andAyangwKNotEqualTo(String value) {
            addCriterion("ayangw_k <>", value, "ayangwK");
            return (Criteria) this;
        }

        public Criteria andAyangwKGreaterThan(String value) {
            addCriterion("ayangw_k >", value, "ayangwK");
            return (Criteria) this;
        }

        public Criteria andAyangwKGreaterThanOrEqualTo(String value) {
            addCriterion("ayangw_k >=", value, "ayangwK");
            return (Criteria) this;
        }

        public Criteria andAyangwKLessThan(String value) {
            addCriterion("ayangw_k <", value, "ayangwK");
            return (Criteria) this;
        }

        public Criteria andAyangwKLessThanOrEqualTo(String value) {
            addCriterion("ayangw_k <=", value, "ayangwK");
            return (Criteria) this;
        }

        public Criteria andAyangwKLike(String value) {
            addCriterion("ayangw_k like", value, "ayangwK");
            return (Criteria) this;
        }

        public Criteria andAyangwKNotLike(String value) {
            addCriterion("ayangw_k not like", value, "ayangwK");
            return (Criteria) this;
        }

        public Criteria andAyangwKIn(List<String> values) {
            addCriterion("ayangw_k in", values, "ayangwK");
            return (Criteria) this;
        }

        public Criteria andAyangwKNotIn(List<String> values) {
            addCriterion("ayangw_k not in", values, "ayangwK");
            return (Criteria) this;
        }

        public Criteria andAyangwKBetween(String value1, String value2) {
            addCriterion("ayangw_k between", value1, value2, "ayangwK");
            return (Criteria) this;
        }

        public Criteria andAyangwKNotBetween(String value1, String value2) {
            addCriterion("ayangw_k not between", value1, value2, "ayangwK");
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
    }
}