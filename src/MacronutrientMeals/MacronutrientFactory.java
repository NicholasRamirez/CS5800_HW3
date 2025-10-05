package MacronutrientMeals;

public class MacronutrientFactory {
    private static MacronutrientFactory instance;

    private MacronutrientFactory() {
    }

    public static MacronutrientFactory getInstance() {
        if (instance == null)
            instance = new MacronutrientFactory();
        return instance;
    }

    public Carbs createCarbs(DietPlan plan) {
        return CarbsFactory.getInstance().getCarbs(plan);
    }

    public Protein createProtein(DietPlan plan) {
        return ProteinFactory.getInstance().getProtein(plan);
    }

    public Fats createFats(DietPlan plan) {
        return FatsFactory.getInstance().getFats(plan);
    }

    public Meal createMeal(DietPlan plan) {
        return new Meal(createCarbs(plan), createProtein(plan), createFats(plan));
    }
}