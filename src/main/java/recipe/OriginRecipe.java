package recipe;

import java.time.LocalDate;

public class OriginRecipe implements Recipe {

    private String recommendation;
    private LocalDate expiryDate;

    public OriginRecipe(String recommendation) {
        this.recommendation = recommendation;
        this.expiryDate = LocalDate.now().minusDays(3);
    }

    public String getRecommendation() {
        return recommendation;
    }

    public LocalDate getExpireDate() {
        return expiryDate;
    }

    @Override
    public void changeExpiryDate(LocalDate newDate) {
        System.out.println("First expiry date: " + expiryDate);
    }
}
