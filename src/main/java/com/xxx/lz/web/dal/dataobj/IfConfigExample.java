package com.xxx.lz.web.dal.dataobj;

import java.util.ArrayList;
import java.util.List;

public class IfConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public IfConfigExample() {
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

        public Criteria andIfKIsNull() {
            addCriterion("if_k is null");
            return (Criteria) this;
        }

        public Criteria andIfKIsNotNull() {
            addCriterion("if_k is not null");
            return (Criteria) this;
        }

        public Criteria andIfKEqualTo(String value) {
            addCriterion("if_k =", value, "ifK");
            return (Criteria) this;
        }

        public Criteria andIfKNotEqualTo(String value) {
            addCriterion("if_k <>", value, "ifK");
            return (Criteria) this;
        }

        public Criteria andIfKGreaterThan(String value) {
            addCriterion("if_k >", value, "ifK");
            return (Criteria) this;
        }

        public Criteria andIfKGreaterThanOrEqualTo(String value) {
            addCriterion("if_k >=", value, "ifK");
            return (Criteria) this;
        }

        public Criteria andIfKLessThan(String value) {
            addCriterion("if_k <", value, "ifK");
            return (Criteria) this;
        }

        public Criteria andIfKLessThanOrEqualTo(String value) {
            addCriterion("if_k <=", value, "ifK");
            return (Criteria) this;
        }

        public Criteria andIfKLike(String value) {
            addCriterion("if_k like", value, "ifK");
            return (Criteria) this;
        }

        public Criteria andIfKNotLike(String value) {
            addCriterion("if_k not like", value, "ifK");
            return (Criteria) this;
        }

        public Criteria andIfKIn(List<String> values) {
            addCriterion("if_k in", values, "ifK");
            return (Criteria) this;
        }

        public Criteria andIfKNotIn(List<String> values) {
            addCriterion("if_k not in", values, "ifK");
            return (Criteria) this;
        }

        public Criteria andIfKBetween(String value1, String value2) {
            addCriterion("if_k between", value1, value2, "ifK");
            return (Criteria) this;
        }

        public Criteria andIfKNotBetween(String value1, String value2) {
            addCriterion("if_k not between", value1, value2, "ifK");
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