package MacronutrientMeals;

public class Driver {
    public static void main(String[] args) {
        Customer[] customers = {
            new Customer("Kyle", DietPlan.NO_RESTRICTION),
            new Customer("Serena", DietPlan.NUT_ALLERGY),
            new Customer("Tommy", DietPlan.VEGAN),
            new Customer("Leon", DietPlan.NO_RESTRICTION),
            new Customer("Kevin", DietPlan.PALEO),
            new Customer("Vivian", DietPlan.VEGAN)
        };

        MacronutrientFactory factory = MacronutrientFactory.getInstance();

        System.out.println("Macronutrient Meals Randomized");

        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            Meal meal = factory.createMeal(customer.getPlan());
            System.out.println("Customer: " + customer.getName() + " | Diet Plan: " + customer.getPlan()
                                + " |" + meal);
        }
    }
}