package com.janhe.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class BlogInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogInfoExample() {
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

        public Criteria andBlogUrlIsNull() {
            addCriterion("blog_url is null");
            return (Criteria) this;
        }

        public Criteria andBlogUrlIsNotNull() {
            addCriterion("blog_url is not null");
            return (Criteria) this;
        }

        public Criteria andBlogUrlEqualTo(String value) {
            addCriterion("blog_url =", value, "blogUrl");
            return (Criteria) this;
        }

        public Criteria andBlogUrlNotEqualTo(String value) {
            addCriterion("blog_url <>", value, "blogUrl");
            return (Criteria) this;
        }

        public Criteria andBlogUrlGreaterThan(String value) {
            addCriterion("blog_url >", value, "blogUrl");
            return (Criteria) this;
        }

        public Criteria andBlogUrlGreaterThanOrEqualTo(String value) {
            addCriterion("blog_url >=", value, "blogUrl");
            return (Criteria) this;
        }

        public Criteria andBlogUrlLessThan(String value) {
            addCriterion("blog_url <", value, "blogUrl");
            return (Criteria) this;
        }

        public Criteria andBlogUrlLessThanOrEqualTo(String value) {
            addCriterion("blog_url <=", value, "blogUrl");
            return (Criteria) this;
        }

        public Criteria andBlogUrlLike(String value) {
            addCriterion("blog_url like", value, "blogUrl");
            return (Criteria) this;
        }

        public Criteria andBlogUrlNotLike(String value) {
            addCriterion("blog_url not like", value, "blogUrl");
            return (Criteria) this;
        }

        public Criteria andBlogUrlIn(List<String> values) {
            addCriterion("blog_url in", values, "blogUrl");
            return (Criteria) this;
        }

        public Criteria andBlogUrlNotIn(List<String> values) {
            addCriterion("blog_url not in", values, "blogUrl");
            return (Criteria) this;
        }

        public Criteria andBlogUrlBetween(String value1, String value2) {
            addCriterion("blog_url between", value1, value2, "blogUrl");
            return (Criteria) this;
        }

        public Criteria andBlogUrlNotBetween(String value1, String value2) {
            addCriterion("blog_url not between", value1, value2, "blogUrl");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNull() {
            addCriterion("blog_title is null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNotNull() {
            addCriterion("blog_title is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleEqualTo(String value) {
            addCriterion("blog_title =", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotEqualTo(String value) {
            addCriterion("blog_title <>", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThan(String value) {
            addCriterion("blog_title >", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blog_title >=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThan(String value) {
            addCriterion("blog_title <", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThanOrEqualTo(String value) {
            addCriterion("blog_title <=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLike(String value) {
            addCriterion("blog_title like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotLike(String value) {
            addCriterion("blog_title not like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIn(List<String> values) {
            addCriterion("blog_title in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotIn(List<String> values) {
            addCriterion("blog_title not in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleBetween(String value1, String value2) {
            addCriterion("blog_title between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotBetween(String value1, String value2) {
            addCriterion("blog_title not between", value1, value2, "blogTitle");
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

        public Criteria andBackCode4IsNull() {
            addCriterion("back_code4 is null");
            return (Criteria) this;
        }

        public Criteria andBackCode4IsNotNull() {
            addCriterion("back_code4 is not null");
            return (Criteria) this;
        }

        public Criteria andBackCode4EqualTo(String value) {
            addCriterion("back_code4 =", value, "backCode4");
            return (Criteria) this;
        }

        public Criteria andBackCode4NotEqualTo(String value) {
            addCriterion("back_code4 <>", value, "backCode4");
            return (Criteria) this;
        }

        public Criteria andBackCode4GreaterThan(String value) {
            addCriterion("back_code4 >", value, "backCode4");
            return (Criteria) this;
        }

        public Criteria andBackCode4GreaterThanOrEqualTo(String value) {
            addCriterion("back_code4 >=", value, "backCode4");
            return (Criteria) this;
        }

        public Criteria andBackCode4LessThan(String value) {
            addCriterion("back_code4 <", value, "backCode4");
            return (Criteria) this;
        }

        public Criteria andBackCode4LessThanOrEqualTo(String value) {
            addCriterion("back_code4 <=", value, "backCode4");
            return (Criteria) this;
        }

        public Criteria andBackCode4Like(String value) {
            addCriterion("back_code4 like", value, "backCode4");
            return (Criteria) this;
        }

        public Criteria andBackCode4NotLike(String value) {
            addCriterion("back_code4 not like", value, "backCode4");
            return (Criteria) this;
        }

        public Criteria andBackCode4In(List<String> values) {
            addCriterion("back_code4 in", values, "backCode4");
            return (Criteria) this;
        }

        public Criteria andBackCode4NotIn(List<String> values) {
            addCriterion("back_code4 not in", values, "backCode4");
            return (Criteria) this;
        }

        public Criteria andBackCode4Between(String value1, String value2) {
            addCriterion("back_code4 between", value1, value2, "backCode4");
            return (Criteria) this;
        }

        public Criteria andBackCode4NotBetween(String value1, String value2) {
            addCriterion("back_code4 not between", value1, value2, "backCode4");
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