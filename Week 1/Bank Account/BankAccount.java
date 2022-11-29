import java.util.Random;
public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;
    //constructors
    public BankAccount(){
        this.accountNumber = generateAccountNumber();
    }

    public void depositToChecking(double money){
        this.checkingBalance += money;
    }
    public void depositToSavings(double money){
        this.savingsBalance += money;
    }
    private String generateAccountNumber(){
        Random random = new Random();
        String number = "";
        for(int i =0; i<10;i++){
            number+= Integer.toString(random.nextInt(10));
        }
        return number;
    }
    public void withdrawFromChecking(double money){
        if(money>this.checkingBalance){
            System.out.println("not enough money sorry pal you only have"+ this.checkingBalance);
            
        }
        else{
        this.checkingBalance -= money;
        System.out.println("Your new checking balance is:"+this.checkingBalance);
        }
    }
    public void withdrawFromSavings(double money){
        
        if(money>this.savingsBalance){
            System.out.println("not enough money sorry pal you only have"+ this.savingsBalance);
            
        }
        else{
        this.savingsBalance -= money;
        System.out.println("Your new savings balance is:"+this.savingsBalance);
        }
    }
    public double getTotal(){
        return this.checkingBalance + this.savingsBalance;
    }
    //getters and setters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
}
