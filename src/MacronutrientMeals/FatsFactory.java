package MacronutrientMeals;
import java.util.*;

public class FatsFactory {
    private static FatsFactory instance;

    private FatsFactory() {
    }

    public static FatsFactory getInstance() {
        if (instance == null) 
            instance = new FatsFactory();
        return instance;
    }

    private Random random = new Random();

    public Fats getFats(DietPlan plan) {
        switch (plan) {
            case NO_RESTRICTION:
                return select("Avocado", "Sour cream", "Tuna", "Peanuts");
            case PALEO:
                return select("Avocado", "Tuna", "Peanuts");
            case VEGAN:
                return select("Avocado", "Peanuts");
            case NUT_ALLERGY:
                return select("Avocado", "Sour cream", "Tuna");
            default:
                throw new IllegalArgumentException("This plan is unknown: " + plan);
        }
    }

    private Fats select(String... options) {
        return new Fats(options[random.nextInt(options.length)]);
    }
}