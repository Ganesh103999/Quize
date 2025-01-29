package pizaaBillGenerator;

public class DeluxPizza extends Pizza{


    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraToppings();
        super.getExtraCheese();

    }

    @Override
    public void getExtraCheese() {

    }

    @Override
    public void addExtraToppings() {

    }
}
