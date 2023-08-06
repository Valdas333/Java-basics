import java.util.ArrayList;
public class PrimeFinder {
    /*
    A function what finds prime numbers,
    either passed by a single number or an array of numbers.
     */

    // Add your methods here:
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
    public ArrayList OnlyPrimes(int [] numbers){
        ArrayList <Integer> primes = new ArrayList<Integer>();
        for (int number : numbers){
             if(IsPrime(number)){
                 primes.add(number);
             }
        }
        return primes;
    }

    public static void main(String[] args) {

        PrimeFinder pd = new PrimeFinder();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.IsPrime(780));
        System.out.println(pd.OnlyPrimes(numbers));

    }

}
