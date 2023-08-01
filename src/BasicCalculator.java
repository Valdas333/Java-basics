public class BasicCalculator {

    public BasicCalculator(){
    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return  a / b;
    }

    public int modulo(int a, int b){
        return a % b;
    }

    public static void main(String args[]){
        BasicCalculator myCalculator = new BasicCalculator();
        System.out.println(myCalculator.add(5,6));
        System.out.println(myCalculator.subtract(8,9));
        System.out.println(myCalculator.multiply(88,22));
        System.out.println(myCalculator.divide(8, 3));
        System.out.println(myCalculator.modulo(25,2));
    }
}

