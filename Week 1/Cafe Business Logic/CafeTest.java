import java.util.ArrayList;

public class CafeTest {
public static void main(String[] args) {
    CafeUtil cafeUtil = new CafeUtil();
    int goal = cafeUtil.getStreakGoal(8);
    double[] prices ={2.2,1.5,7.2};
    double total = cafeUtil.getTotal(prices);
    System.out.println(goal);
    System.out.println(total);
    ArrayList<String> menu = new ArrayList<String>();
    menu.add("Drip Coffee");
    menu.add("Cappuccino");
    menu.add("Latte");
    menu.add("Mocha");
    cafeUtil.displayMenu(menu);

    System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        
        for (int i = 0; i < 4; i++) {
            cafeUtil.addCustomer(customers);
            System.out.println("\n");
        }

}

}
