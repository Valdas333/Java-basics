package Bank;

public class ATM{
    // Static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;

    // Instance variables
    public int money;

    public ATM(int inputMoney){
        this.money = inputMoney;

        numATMs ++;
        totalMoney += inputMoney;
    }

    public void depositMoney(int amountToDeposit){
        this.money += amountToDeposit;
    }

    public String toString(){
        return "Your current balance: " + money;
    }

    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }

    public static void averageMoney(){
        System.out.println(totalMoney / numATMs);
    }

    public static void main(String[] args){

        System.out.println("Total number of ATMs: " + ATM.numATMs);
        ATM firstATM = new ATM(1000);
        ATM secondATM = new ATM(500);
        System.out.println("Total number of ATMs: " + ATM.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);
        // calling class method without object, method created using static
        ATM.averageMoney();
        secondATM.depositMoney(300);
        System.out.println("Total money after some deposit to second ATM "+ secondATM.money);
        System.out.println(firstATM);
    }

}
