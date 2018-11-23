package app.market.model;

import java.util.ArrayList;
import java.util.List;

public class FoodExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    public FoodExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
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

        public Criteria andFoodTypeIdIsNull() {
            addCriterion("food_type_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdIsNotNull() {
            addCriterion("food_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdEqualTo(Integer value) {
            addCriterion("food_type_id =", value, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdNotEqualTo(Integer value) {
            addCriterion("food_type_id <>", value, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdGreaterThan(Integer value) {
            addCriterion("food_type_id >", value, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_type_id >=", value, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdLessThan(Integer value) {
            addCriterion("food_type_id <", value, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("food_type_id <=", value, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdIn(List<Integer> values) {
            addCriterion("food_type_id in", values, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdNotIn(List<Integer> values) {
            addCriterion("food_type_id not in", values, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("food_type_id between", value1, value2, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("food_type_id not between", value1, value2, "foodTypeId");
            return (Criteria) this;
        }

        public Criteria andCalorieIsNull() {
            addCriterion("calorie is null");
            return (Criteria) this;
        }

        public Criteria andCalorieIsNotNull() {
            addCriterion("calorie is not null");
            return (Criteria) this;
        }

        public Criteria andCalorieEqualTo(Float value) {
            addCriterion("calorie =", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieNotEqualTo(Float value) {
            addCriterion("calorie <>", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieGreaterThan(Float value) {
            addCriterion("calorie >", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieGreaterThanOrEqualTo(Float value) {
            addCriterion("calorie >=", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieLessThan(Float value) {
            addCriterion("calorie <", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieLessThanOrEqualTo(Float value) {
            addCriterion("calorie <=", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieIn(List<Float> values) {
            addCriterion("calorie in", values, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieNotIn(List<Float> values) {
            addCriterion("calorie not in", values, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieBetween(Float value1, Float value2) {
            addCriterion("calorie between", value1, value2, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieNotBetween(Float value1, Float value2) {
            addCriterion("calorie not between", value1, value2, "calorie");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateIsNull() {
            addCriterion("carbohydrate is null");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateIsNotNull() {
            addCriterion("carbohydrate is not null");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateEqualTo(Float value) {
            addCriterion("carbohydrate =", value, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateNotEqualTo(Float value) {
            addCriterion("carbohydrate <>", value, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateGreaterThan(Float value) {
            addCriterion("carbohydrate >", value, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateGreaterThanOrEqualTo(Float value) {
            addCriterion("carbohydrate >=", value, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateLessThan(Float value) {
            addCriterion("carbohydrate <", value, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateLessThanOrEqualTo(Float value) {
            addCriterion("carbohydrate <=", value, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateIn(List<Float> values) {
            addCriterion("carbohydrate in", values, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateNotIn(List<Float> values) {
            addCriterion("carbohydrate not in", values, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateBetween(Float value1, Float value2) {
            addCriterion("carbohydrate between", value1, value2, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateNotBetween(Float value1, Float value2) {
            addCriterion("carbohydrate not between", value1, value2, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andProteinIsNull() {
            addCriterion("protein is null");
            return (Criteria) this;
        }

        public Criteria andProteinIsNotNull() {
            addCriterion("protein is not null");
            return (Criteria) this;
        }

        public Criteria andProteinEqualTo(Float value) {
            addCriterion("protein =", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinNotEqualTo(Float value) {
            addCriterion("protein <>", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinGreaterThan(Float value) {
            addCriterion("protein >", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinGreaterThanOrEqualTo(Float value) {
            addCriterion("protein >=", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinLessThan(Float value) {
            addCriterion("protein <", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinLessThanOrEqualTo(Float value) {
            addCriterion("protein <=", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinIn(List<Float> values) {
            addCriterion("protein in", values, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinNotIn(List<Float> values) {
            addCriterion("protein not in", values, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinBetween(Float value1, Float value2) {
            addCriterion("protein between", value1, value2, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinNotBetween(Float value1, Float value2) {
            addCriterion("protein not between", value1, value2, "protein");
            return (Criteria) this;
        }

        public Criteria andFatIsNull() {
            addCriterion("fat is null");
            return (Criteria) this;
        }

        public Criteria andFatIsNotNull() {
            addCriterion("fat is not null");
            return (Criteria) this;
        }

        public Criteria andFatEqualTo(Float value) {
            addCriterion("fat =", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatNotEqualTo(Float value) {
            addCriterion("fat <>", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatGreaterThan(Float value) {
            addCriterion("fat >", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatGreaterThanOrEqualTo(Float value) {
            addCriterion("fat >=", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatLessThan(Float value) {
            addCriterion("fat <", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatLessThanOrEqualTo(Float value) {
            addCriterion("fat <=", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatIn(List<Float> values) {
            addCriterion("fat in", values, "fat");
            return (Criteria) this;
        }

        public Criteria andFatNotIn(List<Float> values) {
            addCriterion("fat not in", values, "fat");
            return (Criteria) this;
        }

        public Criteria andFatBetween(Float value1, Float value2) {
            addCriterion("fat between", value1, value2, "fat");
            return (Criteria) this;
        }

        public Criteria andFatNotBetween(Float value1, Float value2) {
            addCriterion("fat not between", value1, value2, "fat");
            return (Criteria) this;
        }

        public Criteria andNatriumIsNull() {
            addCriterion("natrium is null");
            return (Criteria) this;
        }

        public Criteria andNatriumIsNotNull() {
            addCriterion("natrium is not null");
            return (Criteria) this;
        }

        public Criteria andNatriumEqualTo(Float value) {
            addCriterion("natrium =", value, "natrium");
            return (Criteria) this;
        }

        public Criteria andNatriumNotEqualTo(Float value) {
            addCriterion("natrium <>", value, "natrium");
            return (Criteria) this;
        }

        public Criteria andNatriumGreaterThan(Float value) {
            addCriterion("natrium >", value, "natrium");
            return (Criteria) this;
        }

        public Criteria andNatriumGreaterThanOrEqualTo(Float value) {
            addCriterion("natrium >=", value, "natrium");
            return (Criteria) this;
        }

        public Criteria andNatriumLessThan(Float value) {
            addCriterion("natrium <", value, "natrium");
            return (Criteria) this;
        }

        public Criteria andNatriumLessThanOrEqualTo(Float value) {
            addCriterion("natrium <=", value, "natrium");
            return (Criteria) this;
        }

        public Criteria andNatriumIn(List<Float> values) {
            addCriterion("natrium in", values, "natrium");
            return (Criteria) this;
        }

        public Criteria andNatriumNotIn(List<Float> values) {
            addCriterion("natrium not in", values, "natrium");
            return (Criteria) this;
        }

        public Criteria andNatriumBetween(Float value1, Float value2) {
            addCriterion("natrium between", value1, value2, "natrium");
            return (Criteria) this;
        }

        public Criteria andNatriumNotBetween(Float value1, Float value2) {
            addCriterion("natrium not between", value1, value2, "natrium");
            return (Criteria) this;
        }

        public Criteria andSmallImageLocationIsNull() {
            addCriterion("small_image_location is null");
            return (Criteria) this;
        }

        public Criteria andSmallImageLocationIsNotNull() {
            addCriterion("small_image_location is not null");
            return (Criteria) this;
        }

        public Criteria andSmallImageLocationEqualTo(String value) {
            addCriterion("small_image_location =", value, "smallImageLocation");
            return (Criteria) this;
        }

        public Criteria andSmallImageLocationNotEqualTo(String value) {
            addCriterion("small_image_location <>", value, "smallImageLocation");
            return (Criteria) this;
        }

        public Criteria andSmallImageLocationGreaterThan(String value) {
            addCriterion("small_image_location >", value, "smallImageLocation");
            return (Criteria) this;
        }

        public Criteria andSmallImageLocationGreaterThanOrEqualTo(String value) {
            addCriterion("small_image_location >=", value, "smallImageLocation");
            return (Criteria) this;
        }

        public Criteria andSmallImageLocationLessThan(String value) {
            addCriterion("small_image_location <", value, "smallImageLocation");
            return (Criteria) this;
        }

        public Criteria andSmallImageLocationLessThanOrEqualTo(String value) {
            addCriterion("small_image_location <=", value, "smallImageLocation");
            return (Criteria) this;
        }

        public Criteria andSmallImageLocationLike(String value) {
            addCriterion("small_image_location like", value, "smallImageLocation");
            return (Criteria) this;
        }

        public Criteria andSmallImageLocationNotLike(String value) {
            addCriterion("small_image_location not like", value, "smallImageLocation");
            return (Criteria) this;
        }

        public Criteria andSmallImageLocationIn(List<String> values) {
            addCriterion("small_image_location in", values, "smallImageLocation");
            return (Criteria) this;
        }

        public Criteria andSmallImageLocationNotIn(List<String> values) {
            addCriterion("small_image_location not in", values, "smallImageLocation");
            return (Criteria) this;
        }

        public Criteria andSmallImageLocationBetween(String value1, String value2) {
            addCriterion("small_image_location between", value1, value2, "smallImageLocation");
            return (Criteria) this;
        }

        public Criteria andSmallImageLocationNotBetween(String value1, String value2) {
            addCriterion("small_image_location not between", value1, value2, "smallImageLocation");
            return (Criteria) this;
        }

        public Criteria andBigImageLocationIsNull() {
            addCriterion("big_image_location is null");
            return (Criteria) this;
        }

        public Criteria andBigImageLocationIsNotNull() {
            addCriterion("big_image_location is not null");
            return (Criteria) this;
        }

        public Criteria andBigImageLocationEqualTo(String value) {
            addCriterion("big_image_location =", value, "bigImageLocation");
            return (Criteria) this;
        }

        public Criteria andBigImageLocationNotEqualTo(String value) {
            addCriterion("big_image_location <>", value, "bigImageLocation");
            return (Criteria) this;
        }

        public Criteria andBigImageLocationGreaterThan(String value) {
            addCriterion("big_image_location >", value, "bigImageLocation");
            return (Criteria) this;
        }

        public Criteria andBigImageLocationGreaterThanOrEqualTo(String value) {
            addCriterion("big_image_location >=", value, "bigImageLocation");
            return (Criteria) this;
        }

        public Criteria andBigImageLocationLessThan(String value) {
            addCriterion("big_image_location <", value, "bigImageLocation");
            return (Criteria) this;
        }

        public Criteria andBigImageLocationLessThanOrEqualTo(String value) {
            addCriterion("big_image_location <=", value, "bigImageLocation");
            return (Criteria) this;
        }

        public Criteria andBigImageLocationLike(String value) {
            addCriterion("big_image_location like", value, "bigImageLocation");
            return (Criteria) this;
        }

        public Criteria andBigImageLocationNotLike(String value) {
            addCriterion("big_image_location not like", value, "bigImageLocation");
            return (Criteria) this;
        }

        public Criteria andBigImageLocationIn(List<String> values) {
            addCriterion("big_image_location in", values, "bigImageLocation");
            return (Criteria) this;
        }

        public Criteria andBigImageLocationNotIn(List<String> values) {
            addCriterion("big_image_location not in", values, "bigImageLocation");
            return (Criteria) this;
        }

        public Criteria andBigImageLocationBetween(String value1, String value2) {
            addCriterion("big_image_location between", value1, value2, "bigImageLocation");
            return (Criteria) this;
        }

        public Criteria andBigImageLocationNotBetween(String value1, String value2) {
            addCriterion("big_image_location not between", value1, value2, "bigImageLocation");
            return (Criteria) this;
        }

        public Criteria andIngredientsIsNull() {
            addCriterion("ingredients is null");
            return (Criteria) this;
        }

        public Criteria andIngredientsIsNotNull() {
            addCriterion("ingredients is not null");
            return (Criteria) this;
        }

        public Criteria andIngredientsEqualTo(String value) {
            addCriterion("ingredients =", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsNotEqualTo(String value) {
            addCriterion("ingredients <>", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsGreaterThan(String value) {
            addCriterion("ingredients >", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsGreaterThanOrEqualTo(String value) {
            addCriterion("ingredients >=", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsLessThan(String value) {
            addCriterion("ingredients <", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsLessThanOrEqualTo(String value) {
            addCriterion("ingredients <=", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsLike(String value) {
            addCriterion("ingredients like", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsNotLike(String value) {
            addCriterion("ingredients not like", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsIn(List<String> values) {
            addCriterion("ingredients in", values, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsNotIn(List<String> values) {
            addCriterion("ingredients not in", values, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsBetween(String value1, String value2) {
            addCriterion("ingredients between", value1, value2, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsNotBetween(String value1, String value2) {
            addCriterion("ingredients not between", value1, value2, "ingredients");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table food
     *
     * @mbg.generated do_not_delete_during_merge Fri Nov 23 12:15:53 KST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table food
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
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