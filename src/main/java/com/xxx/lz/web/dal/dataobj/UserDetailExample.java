package com.xxx.lz.web.dal.dataobj;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public UserDetailExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
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

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNull() {
            addCriterion("mobile_no is null");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNotNull() {
            addCriterion("mobile_no is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNoEqualTo(String value) {
            addCriterion("mobile_no =", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotEqualTo(String value) {
            addCriterion("mobile_no <>", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThan(String value) {
            addCriterion("mobile_no >", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_no >=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThan(String value) {
            addCriterion("mobile_no <", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThanOrEqualTo(String value) {
            addCriterion("mobile_no <=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLike(String value) {
            addCriterion("mobile_no like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotLike(String value) {
            addCriterion("mobile_no not like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoIn(List<String> values) {
            addCriterion("mobile_no in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotIn(List<String> values) {
            addCriterion("mobile_no not in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoBetween(String value1, String value2) {
            addCriterion("mobile_no between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotBetween(String value1, String value2) {
            addCriterion("mobile_no not between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNull() {
            addCriterion("modified_by is null");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNotNull() {
            addCriterion("modified_by is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedByEqualTo(String value) {
            addCriterion("modified_by =", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotEqualTo(String value) {
            addCriterion("modified_by <>", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThan(String value) {
            addCriterion("modified_by >", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("modified_by >=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThan(String value) {
            addCriterion("modified_by <", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThanOrEqualTo(String value) {
            addCriterion("modified_by <=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLike(String value) {
            addCriterion("modified_by like", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotLike(String value) {
            addCriterion("modified_by not like", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByIn(List<String> values) {
            addCriterion("modified_by in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotIn(List<String> values) {
            addCriterion("modified_by not in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByBetween(String value1, String value2) {
            addCriterion("modified_by between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotBetween(String value1, String value2) {
            addCriterion("modified_by not between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andUserSourceIsNull() {
            addCriterion("user_source is null");
            return (Criteria) this;
        }

        public Criteria andUserSourceIsNotNull() {
            addCriterion("user_source is not null");
            return (Criteria) this;
        }

        public Criteria andUserSourceEqualTo(String value) {
            addCriterion("user_source =", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotEqualTo(String value) {
            addCriterion("user_source <>", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceGreaterThan(String value) {
            addCriterion("user_source >", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceGreaterThanOrEqualTo(String value) {
            addCriterion("user_source >=", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLessThan(String value) {
            addCriterion("user_source <", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLessThanOrEqualTo(String value) {
            addCriterion("user_source <=", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLike(String value) {
            addCriterion("user_source like", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotLike(String value) {
            addCriterion("user_source not like", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceIn(List<String> values) {
            addCriterion("user_source in", values, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotIn(List<String> values) {
            addCriterion("user_source not in", values, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceBetween(String value1, String value2) {
            addCriterion("user_source between", value1, value2, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotBetween(String value1, String value2) {
            addCriterion("user_source not between", value1, value2, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIsNull() {
            addCriterion("user_referee is null");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIsNotNull() {
            addCriterion("user_referee is not null");
            return (Criteria) this;
        }

        public Criteria andUserRefereeEqualTo(String value) {
            addCriterion("user_referee =", value, "userReferee");
            return (Criteria) this;
        }

        public Criteria andUserRefereeNotEqualTo(String value) {
            addCriterion("user_referee <>", value, "userReferee");
            return (Criteria) this;
        }

        public Criteria andUserRefereeGreaterThan(String value) {
            addCriterion("user_referee >", value, "userReferee");
            return (Criteria) this;
        }

        public Criteria andUserRefereeGreaterThanOrEqualTo(String value) {
            addCriterion("user_referee >=", value, "userReferee");
            return (Criteria) this;
        }

        public Criteria andUserRefereeLessThan(String value) {
            addCriterion("user_referee <", value, "userReferee");
            return (Criteria) this;
        }

        public Criteria andUserRefereeLessThanOrEqualTo(String value) {
            addCriterion("user_referee <=", value, "userReferee");
            return (Criteria) this;
        }

        public Criteria andUserRefereeLike(String value) {
            addCriterion("user_referee like", value, "userReferee");
            return (Criteria) this;
        }

        public Criteria andUserRefereeNotLike(String value) {
            addCriterion("user_referee not like", value, "userReferee");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIn(List<String> values) {
            addCriterion("user_referee in", values, "userReferee");
            return (Criteria) this;
        }

        public Criteria andUserRefereeNotIn(List<String> values) {
            addCriterion("user_referee not in", values, "userReferee");
            return (Criteria) this;
        }

        public Criteria andUserRefereeBetween(String value1, String value2) {
            addCriterion("user_referee between", value1, value2, "userReferee");
            return (Criteria) this;
        }

        public Criteria andUserRefereeNotBetween(String value1, String value2) {
            addCriterion("user_referee not between", value1, value2, "userReferee");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIdsIsNull() {
            addCriterion("user_referee_ids is null");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIdsIsNotNull() {
            addCriterion("user_referee_ids is not null");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIdsEqualTo(String value) {
            addCriterion("user_referee_ids =", value, "userRefereeIds");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIdsNotEqualTo(String value) {
            addCriterion("user_referee_ids <>", value, "userRefereeIds");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIdsGreaterThan(String value) {
            addCriterion("user_referee_ids >", value, "userRefereeIds");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIdsGreaterThanOrEqualTo(String value) {
            addCriterion("user_referee_ids >=", value, "userRefereeIds");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIdsLessThan(String value) {
            addCriterion("user_referee_ids <", value, "userRefereeIds");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIdsLessThanOrEqualTo(String value) {
            addCriterion("user_referee_ids <=", value, "userRefereeIds");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIdsLike(String value) {
            addCriterion("user_referee_ids like", value, "userRefereeIds");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIdsNotLike(String value) {
            addCriterion("user_referee_ids not like", value, "userRefereeIds");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIdsIn(List<String> values) {
            addCriterion("user_referee_ids in", values, "userRefereeIds");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIdsNotIn(List<String> values) {
            addCriterion("user_referee_ids not in", values, "userRefereeIds");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIdsBetween(String value1, String value2) {
            addCriterion("user_referee_ids between", value1, value2, "userRefereeIds");
            return (Criteria) this;
        }

        public Criteria andUserRefereeIdsNotBetween(String value1, String value2) {
            addCriterion("user_referee_ids not between", value1, value2, "userRefereeIds");
            return (Criteria) this;
        }

        public Criteria andMarkerIsNull() {
            addCriterion("marker is null");
            return (Criteria) this;
        }

        public Criteria andMarkerIsNotNull() {
            addCriterion("marker is not null");
            return (Criteria) this;
        }

        public Criteria andMarkerEqualTo(String value) {
            addCriterion("marker =", value, "marker");
            return (Criteria) this;
        }

        public Criteria andMarkerNotEqualTo(String value) {
            addCriterion("marker <>", value, "marker");
            return (Criteria) this;
        }

        public Criteria andMarkerGreaterThan(String value) {
            addCriterion("marker >", value, "marker");
            return (Criteria) this;
        }

        public Criteria andMarkerGreaterThanOrEqualTo(String value) {
            addCriterion("marker >=", value, "marker");
            return (Criteria) this;
        }

        public Criteria andMarkerLessThan(String value) {
            addCriterion("marker <", value, "marker");
            return (Criteria) this;
        }

        public Criteria andMarkerLessThanOrEqualTo(String value) {
            addCriterion("marker <=", value, "marker");
            return (Criteria) this;
        }

        public Criteria andMarkerLike(String value) {
            addCriterion("marker like", value, "marker");
            return (Criteria) this;
        }

        public Criteria andMarkerNotLike(String value) {
            addCriterion("marker not like", value, "marker");
            return (Criteria) this;
        }

        public Criteria andMarkerIn(List<String> values) {
            addCriterion("marker in", values, "marker");
            return (Criteria) this;
        }

        public Criteria andMarkerNotIn(List<String> values) {
            addCriterion("marker not in", values, "marker");
            return (Criteria) this;
        }

        public Criteria andMarkerBetween(String value1, String value2) {
            addCriterion("marker between", value1, value2, "marker");
            return (Criteria) this;
        }

        public Criteria andMarkerNotBetween(String value1, String value2) {
            addCriterion("marker not between", value1, value2, "marker");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("reg_date is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("reg_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Date value) {
            addCriterionForJDBCDate("reg_date =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("reg_date <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Date value) {
            addCriterionForJDBCDate("reg_date >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reg_date >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Date value) {
            addCriterionForJDBCDate("reg_date <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reg_date <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Date> values) {
            addCriterionForJDBCDate("reg_date in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("reg_date not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reg_date between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reg_date not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNull() {
            addCriterion("avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNotNull() {
            addCriterion("avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlEqualTo(String value) {
            addCriterion("avatar_url =", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotEqualTo(String value) {
            addCriterion("avatar_url <>", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThan(String value) {
            addCriterion("avatar_url >", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("avatar_url >=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThan(String value) {
            addCriterion("avatar_url <", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("avatar_url <=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLike(String value) {
            addCriterion("avatar_url like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotLike(String value) {
            addCriterion("avatar_url not like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIn(List<String> values) {
            addCriterion("avatar_url in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotIn(List<String> values) {
            addCriterion("avatar_url not in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlBetween(String value1, String value2) {
            addCriterion("avatar_url between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("avatar_url not between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andRegUrlIsNull() {
            addCriterion("reg_url is null");
            return (Criteria) this;
        }

        public Criteria andRegUrlIsNotNull() {
            addCriterion("reg_url is not null");
            return (Criteria) this;
        }

        public Criteria andRegUrlEqualTo(String value) {
            addCriterion("reg_url =", value, "regUrl");
            return (Criteria) this;
        }

        public Criteria andRegUrlNotEqualTo(String value) {
            addCriterion("reg_url <>", value, "regUrl");
            return (Criteria) this;
        }

        public Criteria andRegUrlGreaterThan(String value) {
            addCriterion("reg_url >", value, "regUrl");
            return (Criteria) this;
        }

        public Criteria andRegUrlGreaterThanOrEqualTo(String value) {
            addCriterion("reg_url >=", value, "regUrl");
            return (Criteria) this;
        }

        public Criteria andRegUrlLessThan(String value) {
            addCriterion("reg_url <", value, "regUrl");
            return (Criteria) this;
        }

        public Criteria andRegUrlLessThanOrEqualTo(String value) {
            addCriterion("reg_url <=", value, "regUrl");
            return (Criteria) this;
        }

        public Criteria andRegUrlLike(String value) {
            addCriterion("reg_url like", value, "regUrl");
            return (Criteria) this;
        }

        public Criteria andRegUrlNotLike(String value) {
            addCriterion("reg_url not like", value, "regUrl");
            return (Criteria) this;
        }

        public Criteria andRegUrlIn(List<String> values) {
            addCriterion("reg_url in", values, "regUrl");
            return (Criteria) this;
        }

        public Criteria andRegUrlNotIn(List<String> values) {
            addCriterion("reg_url not in", values, "regUrl");
            return (Criteria) this;
        }

        public Criteria andRegUrlBetween(String value1, String value2) {
            addCriterion("reg_url between", value1, value2, "regUrl");
            return (Criteria) this;
        }

        public Criteria andRegUrlNotBetween(String value1, String value2) {
            addCriterion("reg_url not between", value1, value2, "regUrl");
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