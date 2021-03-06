package app.market.mapper;

import app.market.model.FoodRecipe;
import app.market.model.FoodRecipeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FoodRecipeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_recipe
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    long countByExample(FoodRecipeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_recipe
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    int deleteByExample(FoodRecipeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_recipe
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    int insert(FoodRecipe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_recipe
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    int insertSelective(FoodRecipe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_recipe
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    List<FoodRecipe> selectByExample(FoodRecipeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_recipe
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    int updateByExampleSelective(@Param("record") FoodRecipe record, @Param("example") FoodRecipeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_recipe
     *
     * @mbg.generated Fri Nov 23 12:15:53 KST 2018
     */
    int updateByExample(@Param("record") FoodRecipe record, @Param("example") FoodRecipeExample example);
}