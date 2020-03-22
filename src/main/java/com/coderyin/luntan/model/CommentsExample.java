package com.coderyin.luntan.model;

import java.util.ArrayList;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNull() {
            addCriterion("QUESTION is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNotNull() {
            addCriterion("QUESTION is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionEqualTo(Integer value) {
            addCriterion("QUESTION =", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotEqualTo(Integer value) {
            addCriterion("QUESTION <>", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThan(Integer value) {
            addCriterion("QUESTION >", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUESTION >=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThan(Integer value) {
            addCriterion("QUESTION <", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThanOrEqualTo(Integer value) {
            addCriterion("QUESTION <=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionIn(List<Integer> values) {
            addCriterion("QUESTION in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotIn(List<Integer> values) {
            addCriterion("QUESTION not in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionBetween(Integer value1, Integer value2) {
            addCriterion("QUESTION between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotBetween(Integer value1, Integer value2) {
            addCriterion("QUESTION not between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andParentIsNull() {
            addCriterion("PARENT is null");
            return (Criteria) this;
        }

        public Criteria andParentIsNotNull() {
            addCriterion("PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andParentEqualTo(Long value) {
            addCriterion("PARENT =", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotEqualTo(Long value) {
            addCriterion("PARENT <>", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThan(Long value) {
            addCriterion("PARENT >", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT >=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThan(Long value) {
            addCriterion("PARENT <", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThanOrEqualTo(Long value) {
            addCriterion("PARENT <=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentIn(List<Long> values) {
            addCriterion("PARENT in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotIn(List<Long> values) {
            addCriterion("PARENT not in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentBetween(Long value1, Long value2) {
            addCriterion("PARENT between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotBetween(Long value1, Long value2) {
            addCriterion("PARENT not between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Integer value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Integer value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Integer value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Integer value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Integer> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Integer> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatDateIsNull() {
            addCriterion("CREAT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatDateIsNotNull() {
            addCriterion("CREAT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatDateEqualTo(Long value) {
            addCriterion("CREAT_DATE =", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotEqualTo(Long value) {
            addCriterion("CREAT_DATE <>", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateGreaterThan(Long value) {
            addCriterion("CREAT_DATE >", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateGreaterThanOrEqualTo(Long value) {
            addCriterion("CREAT_DATE >=", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLessThan(Long value) {
            addCriterion("CREAT_DATE <", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateLessThanOrEqualTo(Long value) {
            addCriterion("CREAT_DATE <=", value, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateIn(List<Long> values) {
            addCriterion("CREAT_DATE in", values, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotIn(List<Long> values) {
            addCriterion("CREAT_DATE not in", values, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateBetween(Long value1, Long value2) {
            addCriterion("CREAT_DATE between", value1, value2, "creatDate");
            return (Criteria) this;
        }

        public Criteria andCreatDateNotBetween(Long value1, Long value2) {
            addCriterion("CREAT_DATE not between", value1, value2, "creatDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Long value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Long value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Long value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Long value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Long value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Long> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Long> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Long value1, Long value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Long value1, Long value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andGoodCountIsNull() {
            addCriterion("GOOD_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andGoodCountIsNotNull() {
            addCriterion("GOOD_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodCountEqualTo(Long value) {
            addCriterion("GOOD_COUNT =", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountNotEqualTo(Long value) {
            addCriterion("GOOD_COUNT <>", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountGreaterThan(Long value) {
            addCriterion("GOOD_COUNT >", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountGreaterThanOrEqualTo(Long value) {
            addCriterion("GOOD_COUNT >=", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountLessThan(Long value) {
            addCriterion("GOOD_COUNT <", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountLessThanOrEqualTo(Long value) {
            addCriterion("GOOD_COUNT <=", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountIn(List<Long> values) {
            addCriterion("GOOD_COUNT in", values, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountNotIn(List<Long> values) {
            addCriterion("GOOD_COUNT not in", values, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountBetween(Long value1, Long value2) {
            addCriterion("GOOD_COUNT between", value1, value2, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountNotBetween(Long value1, Long value2) {
            addCriterion("GOOD_COUNT not between", value1, value2, "goodCount");
            return (Criteria) this;
        }

        public Criteria andBadCountIsNull() {
            addCriterion("BAD_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andBadCountIsNotNull() {
            addCriterion("BAD_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBadCountEqualTo(Long value) {
            addCriterion("BAD_COUNT =", value, "badCount");
            return (Criteria) this;
        }

        public Criteria andBadCountNotEqualTo(Long value) {
            addCriterion("BAD_COUNT <>", value, "badCount");
            return (Criteria) this;
        }

        public Criteria andBadCountGreaterThan(Long value) {
            addCriterion("BAD_COUNT >", value, "badCount");
            return (Criteria) this;
        }

        public Criteria andBadCountGreaterThanOrEqualTo(Long value) {
            addCriterion("BAD_COUNT >=", value, "badCount");
            return (Criteria) this;
        }

        public Criteria andBadCountLessThan(Long value) {
            addCriterion("BAD_COUNT <", value, "badCount");
            return (Criteria) this;
        }

        public Criteria andBadCountLessThanOrEqualTo(Long value) {
            addCriterion("BAD_COUNT <=", value, "badCount");
            return (Criteria) this;
        }

        public Criteria andBadCountIn(List<Long> values) {
            addCriterion("BAD_COUNT in", values, "badCount");
            return (Criteria) this;
        }

        public Criteria andBadCountNotIn(List<Long> values) {
            addCriterion("BAD_COUNT not in", values, "badCount");
            return (Criteria) this;
        }

        public Criteria andBadCountBetween(Long value1, Long value2) {
            addCriterion("BAD_COUNT between", value1, value2, "badCount");
            return (Criteria) this;
        }

        public Criteria andBadCountNotBetween(Long value1, Long value2) {
            addCriterion("BAD_COUNT not between", value1, value2, "badCount");
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