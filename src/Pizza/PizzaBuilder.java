package Pizza;
import java.util.*;

public class PizzaBuilder {
    private String pizzaChain;
    private String size;
    private List<String> toppings = new ArrayList<>();

    public PizzaBuilder() {
    }

    public PizzaBuilder setPizzaChain(String pizzaChain) {
        this.pizzaChain = pizzaChain;
        return this;
    }

    public PizzaBuilder setSize(String size) {
        if (!size.equalsIgnoreCase("Small") && 
            !size.equalsIgnoreCase("Medium") && 
            !size.equalsIgnoreCase("Large")) {
            throw new IllegalArgumentException("Invalid size: Pizza must have a size of Small, Medium, or Large.");
        }
        this.size = size;
        return this;
    }

    public static List<String> toppingOptions = Arrays.asList(
        "Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese",
        "Peppers", "Chicken", "Olives", "Spinach", "Tomato and Basil", "Beef",
        "Ham", "Pesto", "Spicy Pork", "Ham and Pineapple"
     );

    public PizzaBuilder addToppings(String toppings) {
        if (!toppingOptions.contains(toppings)) {
            throw new IllegalArgumentException("Invalid topping: " + toppings);
        }
        this.toppings.add(toppings);
        return this;
    }

    public Pizza buildPizza() {
        if (size == null || size.isEmpty())
            throw new IllegalStateException("Invalid size: Pizza must have a size of Small, Medium, or Large.");
        return new Pizza(pizzaChain, size, toppings);
    }
}