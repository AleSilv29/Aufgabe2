package Repository;

import Model.Food;
import Model.Ingredients;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IngredientsRepo implements IIngredientsRepo {
    List<Ingredients> ingredients=new ArrayList<>();
    @Override
    public void add(Ingredients entity) {
        ingredients.add(entity);
    }

    @Override
    public void remove(String s) {
        ingredients.removeIf(food -> Objects.equals(food.getName(), s));
    }

    @Override
    public void update(Ingredients newEntity, String s) {
        for (Ingredients f: ingredients)
        {
            if (Objects.equals(newEntity.getName(), f.getName()))
                f.setName(s);
        }
    }


    @Override
    public Ingredients findByID(String name) {
        for (Ingredients i: ingredients)
        {
            if (Objects.equals(i.getName(), name))
                return i;
        }
        return null;
    }

    @Override
    public List<Ingredients> getAll() {
        return null;
    }
}
