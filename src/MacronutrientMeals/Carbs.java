package MacronutrientMeals;

public class Carbs implements Macronutrient {
    private String name;
    
    public Carbs(String name) {
        this.name = name;
    }

    @Override
    public String macronutrientName() {
        return name;
    }

    @Override
    public String macronutrientType() {
        return "Carbs";
    }

    @Override
    public String toString() {
        return name;
    }
}