public class BankTest {
    public static void main(String[] args) {
        Member member1 = new Member();
        //get account info 
        System.out.println(member1.getAccount());
        System.out.println(member1.getAccount().getCheckingBalance());
        //checking withdraws and deposits
        member1.getAccount().depositToChecking(1000);
        member1.getAccount().withdrawFromChecking(200);
        //saving withdraws and deposits\
        member1.getAccount().depositToSavings(2000);
        member1.getAccount().withdrawFromSavings(300);
        System.out.println(member1.getAccount().getTotal());
        System.out.println(member1.getAccount().getAccountNumber());
    }
}
