package homework1;

public class Main {
    public static void main(String[] args) {
        HotDrink hotTeaSmall = new HotTea("Tea", 100, 150, 70);
        HotDrink hotCoffeeMedium = new HotCoffee("Coffee", 150, 200, 80);
        HotDrink hotChocolateLarge = new HotChocolate("Chocolate", 200, 250, 90);

        VendingMachine hotDrinksVending = new HotDrinksVendingMachine();

        hotDrinksVending.addProduct(hotTeaSmall);
        hotDrinksVending.addProduct(hotCoffeeMedium);
        hotDrinksVending.addProduct(hotChocolateLarge);

        System.out.println(hotDrinksVending.getProduct("Coffee"));
        System.out.println(hotDrinksVending.getProduct("Chocolate", 250, 90));
    }
}
