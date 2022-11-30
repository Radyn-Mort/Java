public class Coffeedore {
    public static void main(String[] args) {
        CoffeeKiosk kiosk1 = new CoffeeKiosk();
        kiosk1.addMenuItem("Banana", 2.);
        kiosk1.addMenuItem("Coffee", 1.5);
        kiosk1.addMenuItem("Latte", 4.50);
        kiosk1.addMenuItem("Cappuccino", 3.00);
        kiosk1.addMenuItem("Muffin", 4.00);
        kiosk1.newOrder();

    }
}
