package com.graphqlkafkaproducer.writepath.ampmodels;



import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Types {
    public static class PostCommentsArgs {
        private ModelCommentFilterInput filter;
        private ModelSortDirection sortDirection;
        private Integer limit;
        private String nextToken;

        public PostCommentsArgs() {}

        public ModelCommentFilterInput getFilter() { return this.filter; }
        public ModelSortDirection getSortDirection() { return this.sortDirection; }
        public Integer getLimit() { return this.limit; }
        public String getNextToken() { return this.nextToken; }
        public void setFilter(ModelCommentFilterInput filter) { this.filter = filter; }
        public void setSortDirection(ModelSortDirection sortDirection) { this.sortDirection = sortDirection; }
        public void setLimit(Integer limit) { this.limit = limit; }
        public void setNextToken(String nextToken) { this.nextToken = nextToken; }
    }

    public enum ModelSortDirection {
        ASC,
        DESC

    }


    public static class ModelStringInput {
        private String ne;
        private String eq;
        private String le;
        private String lt;
        private String ge;
        private String gt;
        private String contains;
        private String notContains;
        private Iterable<String> between;
        private String beginsWith;
        private Boolean attributeExists;
        private ModelAttributeTypes attributeType;
        private ModelSizeInput size;

        public ModelStringInput() {}

        public String getNe() { return this.ne; }
        public String getEq() { return this.eq; }
        public String getLe() { return this.le; }
        public String getLt() { return this.lt; }
        public String getGe() { return this.ge; }
        public String getGt() { return this.gt; }
        public String getContains() { return this.contains; }
        public String getNotContains() { return this.notContains; }
        public Iterable<String> getBetween() { return this.between; }
        public String getBeginsWith() { return this.beginsWith; }
        public Boolean getAttributeExists() { return this.attributeExists; }
        public ModelAttributeTypes getAttributeType() { return this.attributeType; }
        public ModelSizeInput getSize() { return this.size; }
        public void setNe(String ne) { this.ne = ne; }
        public void setEq(String eq) { this.eq = eq; }
        public void setLe(String le) { this.le = le; }
        public void setLt(String lt) { this.lt = lt; }
        public void setGe(String ge) { this.ge = ge; }
        public void setGt(String gt) { this.gt = gt; }
        public void setContains(String contains) { this.contains = contains; }
        public void setNotContains(String notContains) { this.notContains = notContains; }
        public void setBetween(Iterable<String> between) { this.between = between; }
        public void setBeginsWith(String beginsWith) { this.beginsWith = beginsWith; }
        public void setAttributeExists(Boolean attributeExists) { this.attributeExists = attributeExists; }
        public void setAttributeType(ModelAttributeTypes attributeType) { this.attributeType = attributeType; }
        public void setSize(ModelSizeInput size) { this.size = size; }
    }
    public static class ModelIdInput {
        private Object ne;
        private Object eq;
        private Object le;
        private Object lt;
        private Object ge;
        private Object gt;
        private Object contains;
        private Object notContains;
        private Iterable<Object> between;
        private Object beginsWith;
        private Boolean attributeExists;
        private ModelAttributeTypes attributeType;
        private ModelSizeInput size;

        public ModelIdInput() {}

        public Object getNe() { return this.ne; }
        public Object getEq() { return this.eq; }
        public Object getLe() { return this.le; }
        public Object getLt() { return this.lt; }
        public Object getGe() { return this.ge; }
        public Object getGt() { return this.gt; }
        public Object getContains() { return this.contains; }
        public Object getNotContains() { return this.notContains; }
        public Iterable<Object> getBetween() { return this.between; }
        public Object getBeginsWith() { return this.beginsWith; }
        public Boolean getAttributeExists() { return this.attributeExists; }
        public ModelAttributeTypes getAttributeType() { return this.attributeType; }
        public ModelSizeInput getSize() { return this.size; }
        public void setNe(Object ne) { this.ne = ne; }
        public void setEq(Object eq) { this.eq = eq; }
        public void setLe(Object le) { this.le = le; }
        public void setLt(Object lt) { this.lt = lt; }
        public void setGe(Object ge) { this.ge = ge; }
        public void setGt(Object gt) { this.gt = gt; }
        public void setContains(Object contains) { this.contains = contains; }
        public void setNotContains(Object notContains) { this.notContains = notContains; }
        public void setBetween(Iterable<Object> between) { this.between = between; }
        public void setBeginsWith(Object beginsWith) { this.beginsWith = beginsWith; }
        public void setAttributeExists(Boolean attributeExists) { this.attributeExists = attributeExists; }
        public void setAttributeType(ModelAttributeTypes attributeType) { this.attributeType = attributeType; }
        public void setSize(ModelSizeInput size) { this.size = size; }
    }
    public static class ModelIntInput {
        private Integer ne;
        private Integer eq;
        private Integer le;
        private Integer lt;
        private Integer ge;
        private Integer gt;
        private Iterable<Integer> between;
        private Boolean attributeExists;
        private ModelAttributeTypes attributeType;

        public ModelIntInput() {}

        public Integer getNe() { return this.ne; }
        public Integer getEq() { return this.eq; }
        public Integer getLe() { return this.le; }
        public Integer getLt() { return this.lt; }
        public Integer getGe() { return this.ge; }
        public Integer getGt() { return this.gt; }
        public Iterable<Integer> getBetween() { return this.between; }
        public Boolean getAttributeExists() { return this.attributeExists; }
        public ModelAttributeTypes getAttributeType() { return this.attributeType; }
        public void setNe(Integer ne) { this.ne = ne; }
        public void setEq(Integer eq) { this.eq = eq; }
        public void setLe(Integer le) { this.le = le; }
        public void setLt(Integer lt) { this.lt = lt; }
        public void setGe(Integer ge) { this.ge = ge; }
        public void setGt(Integer gt) { this.gt = gt; }
        public void setBetween(Iterable<Integer> between) { this.between = between; }
        public void setAttributeExists(Boolean attributeExists) { this.attributeExists = attributeExists; }
        public void setAttributeType(ModelAttributeTypes attributeType) { this.attributeType = attributeType; }
    }
    public static class ModelFloatInput {
        private Double ne;
        private Double eq;
        private Double le;
        private Double lt;
        private Double ge;
        private Double gt;
        private Iterable<Double> between;
        private Boolean attributeExists;
        private ModelAttributeTypes attributeType;

        public ModelFloatInput() {}

        public Double getNe() { return this.ne; }
        public Double getEq() { return this.eq; }
        public Double getLe() { return this.le; }
        public Double getLt() { return this.lt; }
        public Double getGe() { return this.ge; }
        public Double getGt() { return this.gt; }
        public Iterable<Double> getBetween() { return this.between; }
        public Boolean getAttributeExists() { return this.attributeExists; }
        public ModelAttributeTypes getAttributeType() { return this.attributeType; }
        public void setNe(Double ne) { this.ne = ne; }
        public void setEq(Double eq) { this.eq = eq; }
        public void setLe(Double le) { this.le = le; }
        public void setLt(Double lt) { this.lt = lt; }
        public void setGe(Double ge) { this.ge = ge; }
        public void setGt(Double gt) { this.gt = gt; }
        public void setBetween(Iterable<Double> between) { this.between = between; }
        public void setAttributeExists(Boolean attributeExists) { this.attributeExists = attributeExists; }
        public void setAttributeType(ModelAttributeTypes attributeType) { this.attributeType = attributeType; }
    }
    public static class ModelBooleanInput {
        private Boolean ne;
        private Boolean eq;
        private Boolean attributeExists;
        private ModelAttributeTypes attributeType;

        public ModelBooleanInput() {}

        public Boolean getNe() { return this.ne; }
        public Boolean getEq() { return this.eq; }
        public Boolean getAttributeExists() { return this.attributeExists; }
        public ModelAttributeTypes getAttributeType() { return this.attributeType; }
        public void setNe(Boolean ne) { this.ne = ne; }
        public void setEq(Boolean eq) { this.eq = eq; }
        public void setAttributeExists(Boolean attributeExists) { this.attributeExists = attributeExists; }
        public void setAttributeType(ModelAttributeTypes attributeType) { this.attributeType = attributeType; }
    }
    public static class ModelSizeInput {
        private Integer ne;
        private Integer eq;
        private Integer le;
        private Integer lt;
        private Integer ge;
        private Integer gt;
        private Iterable<Integer> between;

        public ModelSizeInput() {}

        public Integer getNe() { return this.ne; }
        public Integer getEq() { return this.eq; }
        public Integer getLe() { return this.le; }
        public Integer getLt() { return this.lt; }
        public Integer getGe() { return this.ge; }
        public Integer getGt() { return this.gt; }
        public Iterable<Integer> getBetween() { return this.between; }
        public void setNe(Integer ne) { this.ne = ne; }
        public void setEq(Integer eq) { this.eq = eq; }
        public void setLe(Integer le) { this.le = le; }
        public void setLt(Integer lt) { this.lt = lt; }
        public void setGe(Integer ge) { this.ge = ge; }
        public void setGt(Integer gt) { this.gt = gt; }
        public void setBetween(Iterable<Integer> between) { this.between = between; }
    }
    public static class ModelPostFilterInput {
        private ModelIdInput id;
        private ModelStringInput text;
        private Iterable<ModelPostFilterInput> and;
        private Iterable<ModelPostFilterInput> or;
        private ModelPostFilterInput not;

        public ModelPostFilterInput() {}

        public ModelIdInput getId() { return this.id; }
        public ModelStringInput getText() { return this.text; }
        public Iterable<ModelPostFilterInput> getAnd() { return this.and; }
        public Iterable<ModelPostFilterInput> getOr() { return this.or; }
        public ModelPostFilterInput getNot() { return this.not; }
        public void setId(ModelIdInput id) { this.id = id; }
        public void setText(ModelStringInput text) { this.text = text; }
        public void setAnd(Iterable<ModelPostFilterInput> and) { this.and = and; }
        public void setOr(Iterable<ModelPostFilterInput> or) { this.or = or; }
        public void setNot(ModelPostFilterInput not) { this.not = not; }
    }
    public enum ModelAttributeTypes {
        binary,
        binarySet,
        bool,
        list,
        map,
        number,
        numberSet,
        string,
        stringSet,
        _null

    }


    public static class CreatePostInput {
        private Object id;
        private String text;

        public CreatePostInput() {}

        public Object getId() { return this.id; }
        public String getText() { return this.text; }
        public void setId(Object id) { this.id = id; }
        public void setText(String text) { this.text = text; }
    }
    public static class UpdatePostInput {
        private Object id;
        private String text;

        public UpdatePostInput() {}

        public Object getId() { return this.id; }
        public String getText() { return this.text; }
        public void setId(Object id) { this.id = id; }
        public void setText(String text) { this.text = text; }
    }
    public static class DeletePostInput {
        private Object id;

        public DeletePostInput() {}

        public Object getId() { return this.id; }
        public void setId(Object id) { this.id = id; }
    }
    public static class MutationCreatePostArgs {
        private CreatePostInput input;
        private ModelPostConditionInput condition;

        public MutationCreatePostArgs() {}

        public CreatePostInput getInput() { return this.input; }
        public ModelPostConditionInput getCondition() { return this.condition; }
        public void setInput(CreatePostInput input) { this.input = input; }
        public void setCondition(ModelPostConditionInput condition) { this.condition = condition; }
    }
    public static class MutationCreateCommentArgs {
        private CreateCommentInput input;
        private ModelCommentConditionInput condition;

        public MutationCreateCommentArgs() {}

        public CreateCommentInput getInput() { return this.input; }
        public ModelCommentConditionInput getCondition() { return this.condition; }
        public void setInput(CreateCommentInput input) { this.input = input; }
        public void setCondition(ModelCommentConditionInput condition) { this.condition = condition; }
    }
    public static class ModelPostConditionInput {
        private ModelStringInput text;
        private Iterable<ModelPostConditionInput> and;
        private Iterable<ModelPostConditionInput> or;
        private ModelPostConditionInput not;

        public ModelPostConditionInput() {}

        public ModelStringInput getText() { return this.text; }
        public Iterable<ModelPostConditionInput> getAnd() { return this.and; }
        public Iterable<ModelPostConditionInput> getOr() { return this.or; }
        public ModelPostConditionInput getNot() { return this.not; }
        public void setText(ModelStringInput text) { this.text = text; }
        public void setAnd(Iterable<ModelPostConditionInput> and) { this.and = and; }
        public void setOr(Iterable<ModelPostConditionInput> or) { this.or = or; }
        public void setNot(ModelPostConditionInput not) { this.not = not; }
    }

    public static class ModelCommentFilterInput {
        private ModelIdInput id;
        private ModelStringInput description;
        private ModelStringInput PostId;
        private Iterable<ModelCommentFilterInput> and;
        private Iterable<ModelCommentFilterInput> or;
        private ModelCommentFilterInput not;

        public ModelCommentFilterInput() {}

        public ModelIdInput getId() { return this.id; }
        public ModelStringInput getDescription() { return this.description; }
        public ModelStringInput getPostId() { return this.PostId; }
        public Iterable<ModelCommentFilterInput> getAnd() { return this.and; }
        public Iterable<ModelCommentFilterInput> getOr() { return this.or; }
        public ModelCommentFilterInput getNot() { return this.not; }
        public void setId(ModelIdInput id) { this.id = id; }
        public void setDescription(ModelStringInput description) { this.description = description; }
        public void setPostId(ModelStringInput PostId) { this.PostId = PostId; }
        public void setAnd(Iterable<ModelCommentFilterInput> and) { this.and = and; }
        public void setOr(Iterable<ModelCommentFilterInput> or) { this.or = or; }
        public void setNot(ModelCommentFilterInput not) { this.not = not; }
    }
    public static class CreateCommentInput {
        private Object id;
        private String description;
        private String PostId;
        private Object commentPostId;

        public CreateCommentInput() {}

        public Object getId() { return this.id; }
        public String getDescription() { return this.description; }
        public String getPostId() { return this.PostId; }
        public Object getCommentPostId() { return this.commentPostId; }
        public void setId(Object id) { this.id = id; }
        public void setDescription(String description) { this.description = description; }
        public void setPostId(String PostId) { this.PostId = PostId; }
        public void setCommentPostId(Object commentPostId) { this.commentPostId = commentPostId; }
    }
    public static class UpdateCommentInput {
        private Object id;
        private String description;
        private String PostId;
        private Object commentPostId;

        public UpdateCommentInput() {}

        public Object getId() { return this.id; }
        public String getDescription() { return this.description; }
        public String getPostId() { return this.PostId; }
        public Object getCommentPostId() { return this.commentPostId; }
        public void setId(Object id) { this.id = id; }
        public void setDescription(String description) { this.description = description; }
        public void setPostId(String PostId) { this.PostId = PostId; }
        public void setCommentPostId(Object commentPostId) { this.commentPostId = commentPostId; }
    }
    public static class DeleteCommentInput {
        private Object id;

        public DeleteCommentInput() {}

        public Object getId() { return this.id; }
        public void setId(Object id) { this.id = id; }
    }
    public static class ModelCommentConditionInput {
        private ModelStringInput description;
        private ModelStringInput PostId;
        private Iterable<ModelCommentConditionInput> and;
        private Iterable<ModelCommentConditionInput> or;
        private ModelCommentConditionInput not;

        public ModelCommentConditionInput() {}

        public ModelStringInput getDescription() { return this.description; }
        public ModelStringInput getPostId() { return this.PostId; }
        public Iterable<ModelCommentConditionInput> getAnd() { return this.and; }
        public Iterable<ModelCommentConditionInput> getOr() { return this.or; }
        public ModelCommentConditionInput getNot() { return this.not; }
        public void setDescription(ModelStringInput description) { this.description = description; }
        public void setPostId(ModelStringInput PostId) { this.PostId = PostId; }
        public void setAnd(Iterable<ModelCommentConditionInput> and) { this.and = and; }
        public void setOr(Iterable<ModelCommentConditionInput> or) { this.or = or; }
        public void setNot(ModelCommentConditionInput not) { this.not = not; }
    }

    public static class Post {
        private Object id;
        private String text;

        public Post() {}

        public Object getId() { return this.id; }
        public String getText() { return this.text; }
        public void setId(Object id) { this.id = id; }
        public void setText(String text) { this.text = text; }
    }

    public static class Comment {
        private Object id;
        private String description;
        private String PostId;
        private Object commentPostId;

        public Comment() {}

        public Object getId() { return this.id; }
        public String getDescription() { return this.description; }
        public String getPostId() { return this.PostId; }
        public Object getCommentPostId() { return this.commentPostId; }
        public void setId(Object id) { this.id = id; }
        public void setDescription(String description) { this.description = description; }
        public void setPostId(String PostId) { this.PostId = PostId; }
        public void setCommentPostId(Object commentPostId) { this.commentPostId = commentPostId; }
    }
}
