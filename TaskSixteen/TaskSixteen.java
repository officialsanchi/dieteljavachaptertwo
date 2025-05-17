import java.util.Scanner;

public class TaskSixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println("Enter one integer :");
        int number = scanner.nextInt();

        int square = number * number ;
        if (number == 100){
            System.out.println("number is equal to 100");
        }
        if (number != 100){
            System.out.println("number is not equal to 100");
        }
        if (number > 100){
            System.out.println("number is greater than 100");
        }
        if (number < 100){
            System.out.println("number is less tha 100");
        }
        if (square == 100){
            System.out.println("The square of the number is equal to 100");
        }
        if (square != 100){
            System.out.println("The square of the number is not equal to 100");
        }
        if (square > 100){
            System.out.println("The square of the number is greater than 100");
        }
        if (square < 100) {
            System.out.println("The square of the number is less than 100");
        }


    }
}
