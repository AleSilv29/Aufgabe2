package Repository;

import Model.Food;
import Model.Ingredients;

import java.util.List;

public interface IFoodRepo extends ICrudRepository<Integer, Food>{
    List<Ingredients> getIngredients(Integer id);
    void setIngredients(Food food, Ingredients ingredients);

}
