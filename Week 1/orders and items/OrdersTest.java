public class OrdersTest {
    public static void main(String[] args) {
        //Items
        // item1 
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 2.20;
        //item 2
        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 3.20;
        //item 3
        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 5.20;
        //item 4
        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 7.20;
        System.out.println(item1.name);
        System.out.println(item2.name);
        System.out.println(item3.name);
        System.out.println(item4.name);

        //Orders
        //order 1
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.ready = true;
        //order 2
        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.items.add(item1);
        order2.total +=item1.price;
        order2.ready = true;
        // order 3
        Order order3 = new Order();
        order3.name = "Noah";
        order3.items.add(item4);
        order3.total+=item4.price;

        // order 4
        Order order4 = new Order();
        order4.name = "Sam";
        order4.items.add(item2);
        order4.total+= item2.price;
        order4.items.add(item2);
        order4.total+= item2.price;
        order4.items.add(item2);
        order4.total+= item2.price;
        
        System.out.println(order1);
        System.out.println(order2.total +" "+ order2.ready);//0.0
        System.out.println(order3.items);
        System.out.println(order4.total);
    }
}
