import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();
        scanner.nextLine();

        //sum
        int sum = number1+number2;
        System.out.println("sum of numbers = "+sum);

        //difference
        if (number1 > number2){
            int difference = number1 - number2;
            System.out.println("difference between numbers = "+difference);
        } else if (number2 > number1) {
            int difference = number2 - number1;
            System.out.println("difference between numbers = "+difference);
        }

        //product
        int product = number1 * number2;
        System.out.println("product of numbers = "+product);

        //division
        double division = (double) number1 / number2;
        System.out.println("division of numbers = "+division);

    }
}