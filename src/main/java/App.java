import recipe.ExtendedRecipe;
import recipe.OriginRecipe;
import recipe.Recipe;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        OriginRecipe originRecipe = new OriginRecipe("Eat twice a day");
        System.out.println("Recommendations are: " + originRecipe.getRecommendation());
        Recipe recipe = new ExtendedRecipe(originRecipe);
        recipe.changeExpiryDate(LocalDate.now().plusDays(7));
        System.out.println("Inspect first expiry date: " + originRecipe.getExpireDate());
    }
}
