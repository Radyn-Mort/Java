import java.util.ArrayList;
public class CoffeeKiosk {

    private ArrayList<Item> menu;
    private ArrayList<Order> orders;
    private int currentOrder;
    // constructor 
    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
        this.currentOrder = 0;
    }

    //methods 
    public void addMenuItem(String name, double price){
    Item newItem = new Item(name,price);
        this.menu.add(newItem);
    }

    public void displayMenu(){
        System.out.println("-------------------Menu-----------------------");
        for(Item item : this.menu){
            System.out.println(item.getIndex()+" "+item.getName()+"---"+item.getPrice());
        }
    }

    public void newOrder(){
        String itemIndex="";
        Item item;
        Order newOrder = new Order();
        orders.add(newOrder);
        System.out.println("I will now take your order!");
        this.displayMenu();
        
        while(!itemIndex.equals("q")){
        //gets input
        itemIndex = System.console().readLine();

        if(!itemIndex.equals("q")){
        item = menu.get(Integer.parseInt(itemIndex));
        this.orders.get(currentOrder).addItem(item);
        }
        }
        // this.currentOrder++; cant INCREMENT why??
        System.out.print(orders.get(currentOrder).display());
    }


}
