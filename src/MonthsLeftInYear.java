import java.util.ArrayList;
import java.util.List;

public class MonthsLeftInYear {
    /*
    A simple function to illustrate a switch case statement.
    After selected an integer value, it prints months what are left in the year.
     */
    public static void main(String[] args) {
        int month = 2;
        List<String> futureMonths = new ArrayList<>();

        switch (month) {
            case 1:
                futureMonths.add("January");
            case 2:
                futureMonths.add("February");
            case 3:
                futureMonths.add("March");
            case 4:
                futureMonths.add("April");
            case 5:
                futureMonths.add("May");
            case 6:
                futureMonths.add("June");
            case 7:
                futureMonths.add("July");
            case 8:
                futureMonths.add("August");
            case 9:
                futureMonths.add("September");
            case 10:
                futureMonths.add("October");
            case 11:
                futureMonths.add("November");
            case 12:
                futureMonths.add("December");
                // break statement here only for clearance
                break;
            default:
                break;
        }
        System.out.println(futureMonths);
    }

}
