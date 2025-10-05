package MacronutrientMeals;
import java.util.*;

public class ProteinFactory {
    private static ProteinFactory instance;

    private ProteinFactory() {
    }

    public static ProteinFactory getInstance() {
        if (instance == null) 
            instance = new ProteinFactory();
        return instance;
    }

    private Random random = new Random();

    public Protein getProtein(DietPlan plan) {
        switch (plan) {
            case NO_RESTRICTION:
                return select("Fish", "Chicken", "Beef", "Tofu");
            case PALEO:
                return select("Fish", "Chicken", "Beef");
            case VEGAN:
                return new Protein("Tofu");
            case NUT_ALLERGY:
                return select("Fish", "Chicken", "Beef", "Tofu");
            default:
                throw new IllegalArgumentException("This plan is unknown: " + plan);
        }
    }

    private Protein select(String... options) {
        return new Protein(options[random.nextInt(options.length)]);
    }
}