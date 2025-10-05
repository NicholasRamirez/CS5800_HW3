package MacronutrientMeals;

public class Protein implements Macronutrient {
    private String name;

    public Protein(String name) {
        this.name = name;
    }

    @Override
    public String macronutrientName() {
        return name;
    }

    @Override
    public String macronutrientType() {
        return "Protein";
    }

    @Override
    public String toString() {
        return name;
    }
}