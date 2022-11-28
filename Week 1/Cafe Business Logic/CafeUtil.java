import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(int weeks){
        int goal = 0;
        while(weeks>0){
            goal+=weeks;
            weeks--;
        }
        return goal;
    }
    public double getTotal(double[] prices){
        double total = 0;
        for(int i=0; i< prices.length;i++){
            total += prices[i];
        }
        return total;
    }
    public void displayMenu(ArrayList<String> arr){
        for (int i = 0; i<arr.size();i++){
            System.out.println(i +" " +arr.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("there are "+ (customers.size()) + " customers in font of you ");
        customers.add(userName);
        System.out.println(customers);
    }
    
}
