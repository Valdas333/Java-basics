public class SavingsAccount {
    // OOP practice
    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }
    public void checkBalance(){
        System.out.println("Hello!\nYour balance is " + balance);
    }
    public void deposit(int amountToDeposit){
        balance += amountToDeposit;
        System.out.println("You just deposited " + amountToDeposit);
    }

    public int withdraw(int amountToWithdraw){
        balance -= amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
        }
     public String toString(){
        return "Your account balance is " + balance;
     }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);
        System.out.println(savings);
        savings.withdraw(500);
        savings.deposit(854);
        savings.checkBalance();
        }
}

