package pizaaBillGenerator;

public class Main {
    public static void main(String[] args) {

//        Pizza basePizza = new Pizza(false);
//
//        basePizza.addExtraToppings();
//        basePizza.getExtraCheese();
//        basePizza.takeAway();
//        basePizza.getBill();


        DeluxPizza dp = new DeluxPizza(true);

        dp.addExtraToppings();
        dp.getExtraCheese();
        dp.getBill();
    }
}

//first try only class pizza then check DeluxPizza there will add function like Inheritance to extend parent properties to child