package Repository;

import Model.Food;
import Model.Ingredients;

import java.util.ArrayList;
import java.util.List;

public class FoodRepo implements IFoodRepo{
    List<Food> foodList=new ArrayList<>();
    @Override
    public void add(Food entity) {
        foodList.add(entity);
    }

    @Override
    public void remove(Integer integer) {
        foodList.removeIf(food -> food.getId()==integer);
    }

    @Override
    public void update(Food newEntity, Integer integer) {
        for (Food f: foodList)
        {
            if (newEntity.getId()==f.getId())
                f.setId(integer);
        }
    }

    @Override
    public Food findByID(Integer integer) {
        return null;
    }

    @Override
    public List<Food> getAll() {
        return null;
    }

    @Override
    public List<Ingredients> getIngredients(Integer id) {
        return null;
    }

    @Override
    public void setIngredients(Food food, Ingredients ingredients) {

    }
}
