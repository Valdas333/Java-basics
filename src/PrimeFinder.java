import java.util.ArrayList;
public class PrimeFinder {
    /*
    A function what finds prime numbers,
    either passed by a single number or an array of numbers,
    odd or even numbers.
     */

    public boolean IsPrime(int number){
        if(number < 2){
            return false;
        }
        else if(number == 2){
            return true;
        }
        for(int i = 2; i < number; i++){
            return number % i != 0;
        }
        return false;
    }
    public ArrayList<Integer> OnlyPrimes(int [] numbers){
        ArrayList <Integer> primes = new ArrayList<Integer>();
        for (int number : numbers){
             if(IsPrime(number)){
                 primes.add(number);
             }
        }
        return primes;
    }

    public void OddOrEven(String choice, int number){
        if(choice.equals("Even") && number % 2 == 0){
            System.out.println("Number " + number+ " is even");
        }
        else {
            System.out.println("Number " + number+ " is odd");
        }
    }

    public static void main(String[] args) {

        PrimeFinder pd = new PrimeFinder();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.IsPrime(780));
        System.out.println(pd.OnlyPrimes(numbers));
        pd.OddOrEven("Even", 15);

    }

}
