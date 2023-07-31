public class MathMagic {
    /*
    Whenever myNumber is from a value between -46341 and 46340,
    the result is 3
     */
    public static void  main(String[] args){
        int myNumber = 15348;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int steThree = stepTwo / myNumber;
        int stepFour = steThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);



    }
}
