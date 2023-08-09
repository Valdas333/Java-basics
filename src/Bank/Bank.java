package Bank;
public class Bank{
    /*
    public and private class access
     */
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank(){
        accountOne = new CheckingAccount("Margie", 100, "1");
        accountTwo = new CheckingAccount("Bart", 200, "2");
    }

    public static void main(String[] args){
        Bank bankOfSimpsons = new Bank();
        System.out.println(bankOfSimpsons.accountOne.getBalance());
        bankOfSimpsons.accountOne.setBalance(5000);
        System.out.println(bankOfSimpsons.accountOne.getBalance());
        System.out.println(bankOfSimpsons.accountOne.getMonthlyInterest());
    }

}
