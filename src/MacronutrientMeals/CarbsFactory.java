package MacronutrientMeals;
import java.util.*;

public class CarbsFactory {
    private static CarbsFactory instance;

    private CarbsFactory() {
    }

    public static CarbsFactory getInstance() {
        if (instance == null) 
            instance = new CarbsFactory();
        return instance;
    }

    private Random random = new Random();

    public Carbs getCarbs(DietPlan plan) {
        switch (plan) {
            case NO_RESTRICTION:
                return select("Cheese", "Bread", "Lentils", "Pistachio");
            case PALEO:
                return new Carbs("Pistachio");
            case VEGAN:
                return select("Bread", "Lentils", "Pistachio");
            case NUT_ALLERGY:
                return select("Cheese", "Bread", "Lentils");
            default:
                throw new IllegalArgumentException("This plan is unknown: " + plan);
        }
    }

    private Carbs select(String... options) {
        return new Carbs(options[random.nextInt(options.length)]);
    }
}
