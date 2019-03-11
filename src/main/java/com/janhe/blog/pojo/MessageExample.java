package com.janhe.blog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(String value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(String value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(String value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(String value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(String value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(String value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLike(String value) {
            addCriterion("oid like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotLike(String value) {
            addCriterion("oid not like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<String> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<String> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(String value1, String value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(String value1, String value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andEnableTagIsNull() {
            addCriterion("enable_tag is null");
            return (Criteria) this;
        }

        public Criteria andEnableTagIsNotNull() {
            addCriterion("enable_tag is not null");
            return (Criteria) this;
        }

        public Criteria andEnableTagEqualTo(String value) {
            addCriterion("enable_tag =", value, "enableTag");
            return (Criteria) this;
        }

        public Criteria andEnableTagNotEqualTo(String value) {
            addCriterion("enable_tag <>", value, "enableTag");
            return (Criteria) this;
        }

        public Criteria andEnableTagGreaterThan(String value) {
            addCriterion("enable_tag >", value, "enableTag");
            return (Criteria) this;
        }

        public Criteria andEnableTagGreaterThanOrEqualTo(String value) {
            addCriterion("enable_tag >=", value, "enableTag");
            return (Criteria) this;
        }

        public Criteria andEnableTagLessThan(String value) {
            addCriterion("enable_tag <", value, "enableTag");
            return (Criteria) this;
        }

        public Criteria andEnableTagLessThanOrEqualTo(String value) {
            addCriterion("enable_tag <=", value, "enableTag");
            return (Criteria) this;
        }

        public Criteria andEnableTagLike(String value) {
            addCriterion("enable_tag like", value, "enableTag");
            return (Criteria) this;
        }

        public Criteria andEnableTagNotLike(String value) {
            addCriterion("enable_tag not like", value, "enableTag");
            return (Criteria) this;
        }

        public Criteria andEnableTagIn(List<String> values) {
            addCriterion("enable_tag in", values, "enableTag");
            return (Criteria) this;
        }

        public Criteria andEnableTagNotIn(List<String> values) {
            addCriterion("enable_tag not in", values, "enableTag");
            return (Criteria) this;
        }

        public Criteria andEnableTagBetween(String value1, String value2) {
            addCriterion("enable_tag between", value1, value2, "enableTag");
            return (Criteria) this;
        }

        public Criteria andEnableTagNotBetween(String value1, String value2) {
            addCriterion("enable_tag not between", value1, value2, "enableTag");
            return (Criteria) this;
        }

        public Criteria andOrderByIsNull() {
            addCriterion("order_by is null");
            return (Criteria) this;
        }

        public Criteria andOrderByIsNotNull() {
            addCriterion("order_by is not null");
            return (Criteria) this;
        }

        public Criteria andOrderByEqualTo(Integer value) {
            addCriterion("order_by =", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotEqualTo(Integer value) {
            addCriterion("order_by <>", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByGreaterThan(Integer value) {
            addCriterion("order_by >", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_by >=", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLessThan(Integer value) {
            addCriterion("order_by <", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLessThanOrEqualTo(Integer value) {
            addCriterion("order_by <=", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByIn(List<Integer> values) {
            addCriterion("order_by in", values, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotIn(List<Integer> values) {
            addCriterion("order_by not in", values, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByBetween(Integer value1, Integer value2) {
            addCriterion("order_by between", value1, value2, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotBetween(Integer value1, Integer value2) {
            addCriterion("order_by not between", value1, value2, "orderBy");
            return (Criteria) this;
        }

        public Criteria andBackCode1IsNull() {
            addCriterion("back_code1 is null");
            return (Criteria) this;
        }

        public Criteria andBackCode1IsNotNull() {
            addCriterion("back_code1 is not null");
            return (Criteria) this;
        }

        public Criteria andBackCode1EqualTo(String value) {
            addCriterion("back_code1 =", value, "backCode1");
            return (Criteria) this;
        }

        public Criteria andBackCode1NotEqualTo(String value) {
            addCriterion("back_code1 <>", value, "backCode1");
            return (Criteria) this;
        }

        public Criteria andBackCode1GreaterThan(String value) {
            addCriterion("back_code1 >", value, "backCode1");
            return (Criteria) this;
        }

        public Criteria andBackCode1GreaterThanOrEqualTo(String value) {
            addCriterion("back_code1 >=", value, "backCode1");
            return (Criteria) this;
        }

        public Criteria andBackCode1LessThan(String value) {
            addCriterion("back_code1 <", value, "backCode1");
            return (Criteria) this;
        }

        public Criteria andBackCode1LessThanOrEqualTo(String value) {
            addCriterion("back_code1 <=", value, "backCode1");
            return (Criteria) this;
        }

        public Criteria andBackCode1Like(String value) {
            addCriterion("back_code1 like", value, "backCode1");
            return (Criteria) this;
        }

        public Criteria andBackCode1NotLike(String value) {
            addCriterion("back_code1 not like", value, "backCode1");
            return (Criteria) this;
        }

        public Criteria andBackCode1In(List<String> values) {
            addCriterion("back_code1 in", values, "backCode1");
            return (Criteria) this;
        }

        public Criteria andBackCode1NotIn(List<String> values) {
            addCriterion("back_code1 not in", values, "backCode1");
            return (Criteria) this;
        }

        public Criteria andBackCode1Between(String value1, String value2) {
            addCriterion("back_code1 between", value1, value2, "backCode1");
            return (Criteria) this;
        }

        public Criteria andBackCode1NotBetween(String value1, String value2) {
            addCriterion("back_code1 not between", value1, value2, "backCode1");
            return (Criteria) this;
        }

        public Criteria andBackCode2IsNull() {
            addCriterion("back_code2 is null");
            return (Criteria) this;
        }

        public Criteria andBackCode2IsNotNull() {
            addCriterion("back_code2 is not null");
            return (Criteria) this;
        }

        public Criteria andBackCode2EqualTo(String value) {
            addCriterion("back_code2 =", value, "backCode2");
            return (Criteria) this;
        }

        public Criteria andBackCode2NotEqualTo(String value) {
            addCriterion("back_code2 <>", value, "backCode2");
            return (Criteria) this;
        }

        public Criteria andBackCode2GreaterThan(String value) {
            addCriterion("back_code2 >", value, "backCode2");
            return (Criteria) this;
        }

        public Criteria andBackCode2GreaterThanOrEqualTo(String value) {
            addCriterion("back_code2 >=", value, "backCode2");
            return (Criteria) this;
        }

        public Criteria andBackCode2LessThan(String value) {
            addCriterion("back_code2 <", value, "backCode2");
            return (Criteria) this;
        }

        public Criteria andBackCode2LessThanOrEqualTo(String value) {
            addCriterion("back_code2 <=", value, "backCode2");
            return (Criteria) this;
        }

        public Criteria andBackCode2Like(String value) {
            addCriterion("back_code2 like", value, "backCode2");
            return (Criteria) this;
        }

        public Criteria andBackCode2NotLike(String value) {
            addCriterion("back_code2 not like", value, "backCode2");
            return (Criteria) this;
        }

        public Criteria andBackCode2In(List<String> values) {
            addCriterion("back_code2 in", values, "backCode2");
            return (Criteria) this;
        }

        public Criteria andBackCode2NotIn(List<String> values) {
            addCriterion("back_code2 not in", values, "backCode2");
            return (Criteria) this;
        }

        public Criteria andBackCode2Between(String value1, String value2) {
            addCriterion("back_code2 between", value1, value2, "backCode2");
            return (Criteria) this;
        }

        public Criteria andBackCode2NotBetween(String value1, String value2) {
            addCriterion("back_code2 not between", value1, value2, "backCode2");
            return (Criteria) this;
        }

        public Criteria andBackCode3IsNull() {
            addCriterion("back_code3 is null");
            return (Criteria) this;
        }

        public Criteria andBackCode3IsNotNull() {
            addCriterion("back_code3 is not null");
            return (Criteria) this;
        }

        public Criteria andBackCode3EqualTo(String value) {
            addCriterion("back_code3 =", value, "backCode3");
            return (Criteria) this;
        }

        public Criteria andBackCode3NotEqualTo(String value) {
            addCriterion("back_code3 <>", value, "backCode3");
            return (Criteria) this;
        }

        public Criteria andBackCode3GreaterThan(String value) {
            addCriterion("back_code3 >", value, "backCode3");
            return (Criteria) this;
        }

        public Criteria andBackCode3GreaterThanOrEqualTo(String value) {
            addCriterion("back_code3 >=", value, "backCode3");
            return (Criteria) this;
        }

        public Criteria andBackCode3LessThan(String value) {
            addCriterion("back_code3 <", value, "backCode3");
            return (Criteria) this;
        }

        public Criteria andBackCode3LessThanOrEqualTo(String value) {
            addCriterion("back_code3 <=", value, "backCode3");
            return (Criteria) this;
        }

        public Criteria andBackCode3Like(String value) {
            addCriterion("back_code3 like", value, "backCode3");
            return (Criteria) this;
        }

        public Criteria andBackCode3NotLike(String value) {
            addCriterion("back_code3 not like", value, "backCode3");
            return (Criteria) this;
        }

        public Criteria andBackCode3In(List<String> values) {
            addCriterion("back_code3 in", values, "backCode3");
            return (Criteria) this;
        }

        public Criteria andBackCode3NotIn(List<String> values) {
            addCriterion("back_code3 not in", values, "backCode3");
            return (Criteria) this;
        }

        public Criteria andBackCode3Between(String value1, String value2) {
            addCriterion("back_code3 between", value1, value2, "backCode3");
            return (Criteria) this;
        }

        public Criteria andBackCode3NotBetween(String value1, String value2) {
            addCriterion("back_code3 not between", value1, value2, "backCode3");
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