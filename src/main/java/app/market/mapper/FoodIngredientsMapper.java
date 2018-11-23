package app.market.mapper;

import app.market.model.FoodIngredients;
import app.market.model.FoodIngredientsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FoodIngredientsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_ingredients
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    long countByExample(FoodIngredientsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_ingredients
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    int deleteByExample(FoodIngredientsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_ingredients
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    int insert(FoodIngredients record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_ingredients
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    int insertSelective(FoodIngredients record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_ingredients
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    List<FoodIngredients> selectByExample(FoodIngredientsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_ingredients
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    int updateByExampleSelective(@Param("record") FoodIngredients record, @Param("example") FoodIngredientsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_ingredients
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    int updateByExample(@Param("record") FoodIngredients record, @Param("example") FoodIngredientsExample example);
}