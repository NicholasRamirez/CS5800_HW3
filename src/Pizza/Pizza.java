package Pizza;
import java.util.*;

public class Pizza {
    private String pizzaChain;
    private String size;
    private List<String> toppings;

    public Pizza(String pizzaChain, String size, List<String> toppings) {
        this.pizzaChain = pizzaChain;
        this.size = size;
        this.toppings = new ArrayList<>(toppings);
    }

    public void eat() {
        System.out.println("Pizza Chain: " + pizzaChain);
        System.out.println("Size: " + size);
        System.out.println("Topppings: " + toppings);
        System.out.println();
    }
}