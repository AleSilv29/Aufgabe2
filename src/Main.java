import Controller.Controller;
import Model.Ingredients;
import Repository.FoodRepo;
import Repository.IngredientsRepo;
import View.View;

public class Main {
    public static void main(String[] args) {
        FoodRepo foodRepo=new FoodRepo();
        IngredientsRepo ingredientsRepo=new IngredientsRepo();
        Controller c=new Controller(foodRepo,ingredientsRepo);
        View v=new View(c);
        v.menu();
    }
}