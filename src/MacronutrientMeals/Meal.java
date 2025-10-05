package MacronutrientMeals;

public class Meal {
    private Carbs carbs;
    private Protein protein;
    private Fats fats;

    public Meal(Carbs carbs, Protein protein, Fats fats) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    public Carbs carbs() {
        return carbs;
    }

    public Protein protein() {
        return protein;
    }

    public Fats fats() {
        return fats;
    }

    @Override
    public String toString() {
        return " Meal: Carbs = " + carbs + ", Protein = " + protein + ", Fats = " + fats;
    }
}