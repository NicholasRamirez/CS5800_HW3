package MacronutrientMeals;

public class Customer {
    private String name;
    private DietPlan plan;

    public Customer(String name, DietPlan plan) {
        this.name = name;
        this.plan = plan;
    }

    public String getName() {
        return name;
    }

    public DietPlan getPlan() {
        return plan;
    }
}