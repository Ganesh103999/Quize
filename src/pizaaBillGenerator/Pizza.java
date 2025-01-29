package pizaaBillGenerator;

public class Pizza {

    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int extrabackPAckPrice = 20;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isExtraTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;

        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void getExtraCheese() {

        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;

    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;

    }

    public void takeAway() {
        isExtraTakeAway = true;
        this.price += extrabackPAckPrice;

    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Chess Added : " + extraCheesePrice  + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings Added : " + extraToppingsPrice  + "\n";
        }
        if (isExtraTakeAway) {
            bill += "Extra TakeAway Added : " + extrabackPAckPrice  + "\n" ;
        }

        bill +=  "Bill " + this.price + "\n";

        System.out.println(bill);


    }


}
