import java.util.ArrayList;
public class Order {
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<>();
    }
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getTotal(){
        return this.total;
    }
    // public void setTotal(double total){
    //     this.total = total;
    // }
    public void addToTotal(double price){
        this.total += price;
    }
    public boolean isReady(){
        return this.ready;
    }
    public String getStatus(){
        if(this.isReady()){
            return "The order is ready.";
        }
        return "the order is not ready";
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
    public ArrayList<Item> getItems(){
        return this.items;
    }
    // public void setItems(ArrayList<Item> items){
    //     this.items = items;
    // }

    public void addItem(Item item){
        this.items.add(item);
        double price = item.getPrice(); 
        this.addToTotal(price);
    }

    public String display(){
        String display = "Name: "+ this.name +"\n";
        for(Item item:this.items){
            display += item.getName()+" - "+item.getPrice()+"\n" ;
        }
        display += "Total: "+ this.total;
        return display;
    }
}
