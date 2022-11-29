public class OrdersTest {
    public static void main(String[] args) {
        //item 1
        Item item1 = new Item();
        item1.setName("mocha");
        item1.setPrice(2.20);
        //item 2
        Item item2 = new Item();
        item2.setName("latte");
        item2.setPrice(3.20);
        //item 3
        Item item3 = new Item();
        item3.setName("drip coffee");
        item3.setPrice(5.20);
        //item 4
        Item item4 = new Item();
        item4.setName("cappuccino");
        item4.setPrice(7.20);
        //oder 1
        Order order1 = new Order();
        order1.addItem(item1);
        order1.addItem(item3);
        order1.setReady(true);
        //oder 2
        Order order2 = new Order();
        order2.addItem(item2);
        order2.addItem(item1);
        order2.setReady(true);
        //oder 3
        Order order3 = new Order("Jeffy");
        order3.addItem(item1);
        order3.addItem(item3);
        //oder 4
        Order order4 = new Order("Jimmy");
        order4.addItem(item3);
        order4.addItem(item2);
        //oder 5
        Order order5 = new Order("Jammy");
        order5.addItem(item4);
        order5.addItem(item2);


        System.out.println(order4.getName());
        System.out.println(order3.getTotal());
        System.out.println(order2.getStatus());
        System.out.println(order3.getItems());
        System.out.println("---------------Display------------");
        System.out.println(order2.display());
        
        
        
    }
}
