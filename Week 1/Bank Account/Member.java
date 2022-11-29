public class Member {
    private static int membersCreated=0;
    private static double allTheMoney=0;
    private BankAccount account;
    public Member(){
        this.account = new BankAccount();
        membersCreated++;
    }
    //getters and setters
    public BankAccount getAccount(){
        return this.account;
    }
}
    

