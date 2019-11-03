package recipe;

import java.time.LocalDate;

public class ExtendedRecipe extends RecipeDecorator {

    public ExtendedRecipe(Recipe recipeDecorator) {
        super(recipeDecorator);
    }

    @Override
    public void changeExpiryDate(LocalDate newDate) {
        recipeDecorator.changeExpiryDate(newDate);
        System.out.println("New expiry date: " + newDate);
    }
}
