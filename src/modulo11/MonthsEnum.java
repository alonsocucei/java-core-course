package modulo11;
public class MonthsEnum {

    enum Months {

        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
        printMonth(Months.APRIL);
    }
    
    private static void printMonth(Months month) {
        System.out.println("Month is: " + month);
//        switch(month) {
//            case JANUARY:
//                System.out.println("January");
//                break;
//            case FEBRUARY:
//                System.out.println("February");
//                break;
//            default :
//                System.out.println("Different than January or Februrary");
//        }
    }
}
