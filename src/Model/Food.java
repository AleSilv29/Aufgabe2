package Model;

import java.util.List;

public class Food {
    int id;
    String name;
    List<Ingredients> ingredientsList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredients> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<Ingredients> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public Food(int id, String name, List<Ingredients> ingredientsList) {
        this.id = id;
        this.name = name;
        this.ingredientsList = ingredientsList;
    }
}
