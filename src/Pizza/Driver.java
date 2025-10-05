package Pizza;

public class Driver {
    public static void main(String[] args) {
        // 1)
        Pizza pizzaOne = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Small")
                        .addToppings("Pepperoni").addToppings("Sausage")
                        .addToppings("Mushrooms").buildPizza();

        Pizza pizzaTwo = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Medium")
                        .addToppings("Pepperoni").addToppings("Sausage")
                        .addToppings("Mushrooms").addToppings("Bacon")
                        .addToppings("Onions").addToppings("Extra Cheese").buildPizza();
        
        Pizza pizzaThree = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Large")
                        .addToppings("Pepperoni").addToppings("Sausage")
                        .addToppings("Mushrooms").addToppings("Bacon")
                        .addToppings("Onions").addToppings("Extra Cheese")
                        .addToppings("Peppers").addToppings("Chicken")
                        .addToppings("Olives").buildPizza();

        pizzaOne.eat();
        pizzaTwo.eat();
        pizzaThree.eat();

        // 2)
        Pizza pizzaHutOne = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Large")
                            .addToppings("Pepperoni").addToppings("Sausage")
                            .addToppings("Spicy Pork").buildPizza();
        
        Pizza pizzaHutTwo = new PizzaBuilder().setPizzaChain("Pizza Hut").setSize("Small")
                            .addToppings("Pepperoni").addToppings("Spicy Pork")
                            .buildPizza();

        Pizza littleCaesarsOne = new PizzaBuilder().setPizzaChain("Little Caesars").setSize("Medium")
                                .addToppings("Beef").addToppings("Tomato and Basil")
                                .addToppings("Spinach").addToppings("Olives")
                                .addToppings("Chicken").addToppings("Peppers")
                                .addToppings("Ham").addToppings("Pesto")
                                .buildPizza();

        Pizza littleCaesarsTwo = new PizzaBuilder().setPizzaChain("Little Caesars").setSize("Small")
                                .addToppings("Beef").addToppings("Tomato and Basil")
                                .addToppings("Spinach").addToppings("Olives")
                                .addToppings("Chicken").addToppings("Peppers")
                                .buildPizza();

        Pizza dominosOne = new PizzaBuilder().setPizzaChain("Dominos").setSize("Small")
                            .addToppings("Bacon").buildPizza();

        Pizza dominosTwo = new PizzaBuilder().setPizzaChain("Dominos").setSize("Large")
                            .addToppings("Bacon").addToppings("Onions")
                            .addToppings("Extra Cheese").buildPizza();

        pizzaHutOne.eat();
        pizzaHutTwo.eat();
        littleCaesarsOne.eat();
        littleCaesarsTwo.eat();
        dominosOne.eat();
        dominosTwo.eat();
    }
}