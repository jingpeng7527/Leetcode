package everythingWillBeFine;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
    private String size;
    private String base;
    private Map<String, Integer> toppings;
    private double discount;
    private static final Map<String, Double> sizePrices;
    private static final Map<String, Double> basePrices;
    private static final Map<String, Double> toppingPrices;
    private static final Map<String, Double> toppingDiscounts;

    static {
        sizePrices = new HashMap<>();
        sizePrices.put("small", 8.0);
        sizePrices.put("medium", 10.0);
        sizePrices.put("large", 12.0);

        basePrices = new HashMap<>();
        basePrices.put("thin", 2.0);
        basePrices.put("thick", 3.0);

        toppingPrices = new HashMap<>();
        toppingPrices.put("cheese", 1.0);
        toppingPrices.put("pepperoni", 1.5);
        toppingPrices.put("mushrooms", 1.2);
        toppingPrices.put("onions", 0.8);

        toppingDiscounts = new HashMap<>();
        toppingDiscounts.put("cheese", 0.1); // 10% discount
        toppingDiscounts.put("pepperoni", 0.2); // 20% discount
    }

    public Pizza(String size, String base) {
        this.size = size;
        this.base = base;
        this.toppings = new HashMap<>();
        this.discount = 0.0;
    }

    public void addTopping(String topping) {
        toppings.put(topping, toppings.getOrDefault(topping, 0) + 1);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calculatePrice() {
        double price = sizePrices.getOrDefault(size, 0.0) + basePrices.getOrDefault(base, 0.0);
        for (Map.Entry<String, Integer> entry : toppings.entrySet()) {
            double toppingPrice = toppingPrices.getOrDefault(entry.getKey(), 0.0) * entry.getValue();
            double toppingDiscount = toppingDiscounts.getOrDefault(entry.getKey(), 0.0);
            price += toppingPrice * (1 - toppingDiscount);
        }
        return price * (1 - discount);
    }

    public static void main(String[] args) {
        Pizza pizza = new Pizza("large", "thin");
        pizza.addTopping("cheese");
        pizza.addTopping("pepperoni");
        pizza.addTopping("mushrooms");
        pizza.setDiscount(0.1); // 10% discount on the whole pizza
        System.out.println("Total price: $" + pizza.calculatePrice());
    }
}