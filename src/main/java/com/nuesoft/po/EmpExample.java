package com.nuesoft.po;

import java.util.ArrayList;
import java.util.List;

public class EmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpExample() {
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

        public Criteria andEmpidIsNull() {
            addCriterion("empid is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("empid is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(Integer value) {
            addCriterion("empid =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(Integer value) {
            addCriterion("empid <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(Integer value) {
            addCriterion("empid >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("empid >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(Integer value) {
            addCriterion("empid <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("empid <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<Integer> values) {
            addCriterion("empid in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<Integer> values) {
            addCriterion("empid not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(Integer value1, Integer value2) {
            addCriterion("empid between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("empid not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNull() {
            addCriterion("empname is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("empname is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("empname =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("empname <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("empname >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("empname >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("empname <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("empname <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("empname like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("empname not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("empname in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("empname not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("empname between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("empname not between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpjobIsNull() {
            addCriterion("empjob is null");
            return (Criteria) this;
        }

        public Criteria andEmpjobIsNotNull() {
            addCriterion("empjob is not null");
            return (Criteria) this;
        }

        public Criteria andEmpjobEqualTo(String value) {
            addCriterion("empjob =", value, "empjob");
            return (Criteria) this;
        }

        public Criteria andEmpjobNotEqualTo(String value) {
            addCriterion("empjob <>", value, "empjob");
            return (Criteria) this;
        }

        public Criteria andEmpjobGreaterThan(String value) {
            addCriterion("empjob >", value, "empjob");
            return (Criteria) this;
        }

        public Criteria andEmpjobGreaterThanOrEqualTo(String value) {
            addCriterion("empjob >=", value, "empjob");
            return (Criteria) this;
        }

        public Criteria andEmpjobLessThan(String value) {
            addCriterion("empjob <", value, "empjob");
            return (Criteria) this;
        }

        public Criteria andEmpjobLessThanOrEqualTo(String value) {
            addCriterion("empjob <=", value, "empjob");
            return (Criteria) this;
        }

        public Criteria andEmpjobLike(String value) {
            addCriterion("empjob like", value, "empjob");
            return (Criteria) this;
        }

        public Criteria andEmpjobNotLike(String value) {
            addCriterion("empjob not like", value, "empjob");
            return (Criteria) this;
        }

        public Criteria andEmpjobIn(List<String> values) {
            addCriterion("empjob in", values, "empjob");
            return (Criteria) this;
        }

        public Criteria andEmpjobNotIn(List<String> values) {
            addCriterion("empjob not in", values, "empjob");
            return (Criteria) this;
        }

        public Criteria andEmpjobBetween(String value1, String value2) {
            addCriterion("empjob between", value1, value2, "empjob");
            return (Criteria) this;
        }

        public Criteria andEmpjobNotBetween(String value1, String value2) {
            addCriterion("empjob not between", value1, value2, "empjob");
            return (Criteria) this;
        }

        public Criteria andEmpwagesIsNull() {
            addCriterion("empwages is null");
            return (Criteria) this;
        }

        public Criteria andEmpwagesIsNotNull() {
            addCriterion("empwages is not null");
            return (Criteria) this;
        }

        public Criteria andEmpwagesEqualTo(Integer value) {
            addCriterion("empwages =", value, "empwages");
            return (Criteria) this;
        }

        public Criteria andEmpwagesNotEqualTo(Integer value) {
            addCriterion("empwages <>", value, "empwages");
            return (Criteria) this;
        }

        public Criteria andEmpwagesGreaterThan(Integer value) {
            addCriterion("empwages >", value, "empwages");
            return (Criteria) this;
        }

        public Criteria andEmpwagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("empwages >=", value, "empwages");
            return (Criteria) this;
        }

        public Criteria andEmpwagesLessThan(Integer value) {
            addCriterion("empwages <", value, "empwages");
            return (Criteria) this;
        }

        public Criteria andEmpwagesLessThanOrEqualTo(Integer value) {
            addCriterion("empwages <=", value, "empwages");
            return (Criteria) this;
        }

        public Criteria andEmpwagesIn(List<Integer> values) {
            addCriterion("empwages in", values, "empwages");
            return (Criteria) this;
        }

        public Criteria andEmpwagesNotIn(List<Integer> values) {
            addCriterion("empwages not in", values, "empwages");
            return (Criteria) this;
        }

        public Criteria andEmpwagesBetween(Integer value1, Integer value2) {
            addCriterion("empwages between", value1, value2, "empwages");
            return (Criteria) this;
        }

        public Criteria andEmpwagesNotBetween(Integer value1, Integer value2) {
            addCriterion("empwages not between", value1, value2, "empwages");
            return (Criteria) this;
        }

        public Criteria andEmpdeptIsNull() {
            addCriterion("empdept is null");
            return (Criteria) this;
        }

        public Criteria andEmpdeptIsNotNull() {
            addCriterion("empdept is not null");
            return (Criteria) this;
        }

        public Criteria andEmpdeptEqualTo(Integer value) {
            addCriterion("empdept =", value, "empdept");
            return (Criteria) this;
        }

        public Criteria andEmpdeptNotEqualTo(Integer value) {
            addCriterion("empdept <>", value, "empdept");
            return (Criteria) this;
        }

        public Criteria andEmpdeptGreaterThan(Integer value) {
            addCriterion("empdept >", value, "empdept");
            return (Criteria) this;
        }

        public Criteria andEmpdeptGreaterThanOrEqualTo(Integer value) {
            addCriterion("empdept >=", value, "empdept");
            return (Criteria) this;
        }

        public Criteria andEmpdeptLessThan(Integer value) {
            addCriterion("empdept <", value, "empdept");
            return (Criteria) this;
        }

        public Criteria andEmpdeptLessThanOrEqualTo(Integer value) {
            addCriterion("empdept <=", value, "empdept");
            return (Criteria) this;
        }

        public Criteria andEmpdeptIn(List<Integer> values) {
            addCriterion("empdept in", values, "empdept");
            return (Criteria) this;
        }

        public Criteria andEmpdeptNotIn(List<Integer> values) {
            addCriterion("empdept not in", values, "empdept");
            return (Criteria) this;
        }

        public Criteria andEmpdeptBetween(Integer value1, Integer value2) {
            addCriterion("empdept between", value1, value2, "empdept");
            return (Criteria) this;
        }

        public Criteria andEmpdeptNotBetween(Integer value1, Integer value2) {
            addCriterion("empdept not between", value1, value2, "empdept");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
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