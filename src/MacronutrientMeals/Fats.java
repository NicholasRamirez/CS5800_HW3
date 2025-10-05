package MacronutrientMeals;

public class Fats implements Macronutrient{
    private String name;

    public Fats(String name) {
        this.name = name;
    }

    @Override
    public String macronutrientName() {
        return name;
    }

    @Override
    public String macronutrientType() {
        return "Fats";
    }

    @Override
    public String toString() {
        return name;
    }
}