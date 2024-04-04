import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number:");
        int weedDayNumber = scanner.nextInt();


        switch (weedDayNumber) {
            case 1:
                System.out.println("weekday is: Monday");
                break;
            case 2:
                System.out.println("weekday is: Tuesday");
                break;
            case 3:
                System.out.println("weekday is: Wednesday");
                break;
            case 4:
                System.out.println("weekday is: Thursday");
                break;
            case 5:
                System.out.println("weekday is: Friday");
                break;
            case 6:
                System.out.println("weekday is: Saturday");
                break;
            case 7:
                System.out.println("weekday is: Sunday");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}