package com.janhe.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class LinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LinkExample() {
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

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNull() {
            addCriterion("link_name is null");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNotNull() {
            addCriterion("link_name is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNameEqualTo(String value) {
            addCriterion("link_name =", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotEqualTo(String value) {
            addCriterion("link_name <>", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThan(String value) {
            addCriterion("link_name >", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("link_name >=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThan(String value) {
            addCriterion("link_name <", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThanOrEqualTo(String value) {
            addCriterion("link_name <=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLike(String value) {
            addCriterion("link_name like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotLike(String value) {
            addCriterion("link_name not like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameIn(List<String> values) {
            addCriterion("link_name in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotIn(List<String> values) {
            addCriterion("link_name not in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameBetween(String value1, String value2) {
            addCriterion("link_name between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotBetween(String value1, String value2) {
            addCriterion("link_name not between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNull() {
            addCriterion("link_url is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("link_url is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("link_url =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("link_url <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("link_url >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("link_url >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("link_url <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("link_url <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("link_url like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("link_url not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("link_url in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("link_url not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("link_url between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("link_url not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkImgIsNull() {
            addCriterion("link_img is null");
            return (Criteria) this;
        }

        public Criteria andLinkImgIsNotNull() {
            addCriterion("link_img is not null");
            return (Criteria) this;
        }

        public Criteria andLinkImgEqualTo(String value) {
            addCriterion("link_img =", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgNotEqualTo(String value) {
            addCriterion("link_img <>", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgGreaterThan(String value) {
            addCriterion("link_img >", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgGreaterThanOrEqualTo(String value) {
            addCriterion("link_img >=", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgLessThan(String value) {
            addCriterion("link_img <", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgLessThanOrEqualTo(String value) {
            addCriterion("link_img <=", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgLike(String value) {
            addCriterion("link_img like", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgNotLike(String value) {
            addCriterion("link_img not like", value, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgIn(List<String> values) {
            addCriterion("link_img in", values, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgNotIn(List<String> values) {
            addCriterion("link_img not in", values, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgBetween(String value1, String value2) {
            addCriterion("link_img between", value1, value2, "linkImg");
            return (Criteria) this;
        }

        public Criteria andLinkImgNotBetween(String value1, String value2) {
            addCriterion("link_img not between", value1, value2, "linkImg");
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