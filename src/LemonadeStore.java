public class LemonadeStore {
    // Intro to OOP, starting with a small shop object


    // instance fields
    String productType;
    double price;

    // constructor method
    public LemonadeStore(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + price*tax;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        LemonadeStore lemonadeStand = new LemonadeStore("Lemonade", 3.75);
        LemonadeStore cookieShop = new LemonadeStore("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);
    }

}
