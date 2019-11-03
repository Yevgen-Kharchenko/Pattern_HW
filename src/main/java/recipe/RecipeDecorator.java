package recipe;

import java.time.LocalDate;

abstract class RecipeDecorator implements Recipe {
    Recipe recipeDecorator;

    public RecipeDecorator(Recipe recipeDecorator) {
        this.recipeDecorator = recipeDecorator;
    }

    public abstract void changeExpiryDate(LocalDate newDate);

}
