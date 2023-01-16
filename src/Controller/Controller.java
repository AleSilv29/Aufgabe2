package Controller;

import Model.Food;
import Model.Ingredients;
import Repository.IFoodRepo;
import Repository.IIngredientsRepo;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private IFoodRepo iFoodRepo;
    private IIngredientsRepo iIngredientsRepo;

    public IFoodRepo getiFoodRepo() {
        return iFoodRepo;
    }

    public void setiFoodRepo(IFoodRepo iFoodRepo) {
        this.iFoodRepo = iFoodRepo;
    }

    public IIngredientsRepo getiIngredientsRepo() {
        return iIngredientsRepo;
    }

    public void setiIngredientsRepo(IIngredientsRepo iIngredientsRepo) {
        this.iIngredientsRepo = iIngredientsRepo;
    }

    public Controller(IFoodRepo iFoodRepo, IIngredientsRepo iIngredientsRepo) {
        this.iFoodRepo = iFoodRepo;
        this.iIngredientsRepo = iIngredientsRepo;
    }

    public List<Ingredients> filterQuantity(int quantity){
        List<Ingredients> newIng=new ArrayList<>();
        for (Food f : iFoodRepo.getAll()){
            for ( Ingredients i : iFoodRepo.getIngredients(f.getId())){
                if (i.getQuantity()==quantity)
                    newIng.add(i);
            }
        }
        return newIng;
    }
}

