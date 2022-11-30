import javafx.print.PrintColor;

public class Item {
    private static int currentIndex= 0 ;
    private int index;
    private String name;
    private double price;
public Item(){
currentIndex++;
}
public Item(String name, double price){
    this.price = price;
    this.name = name ;
    this.index = currentIndex;
    currentIndex++;
}
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getIndex(){
        return this.index;
    }
}
