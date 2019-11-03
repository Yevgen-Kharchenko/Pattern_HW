package recipe;

import java.time.LocalDate;

public interface Recipe {
    void changeExpiryDate(LocalDate newDate);
}
