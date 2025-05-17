import java.util.Scanner;

public class TaskThirty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println("Enter your five digit number :");
        int number = scanner.nextInt();


        int digit1 = number / 10000;
        int digit2 = (number % 10000) / 1000;
        int digit3 = (number % 1000) / 100;
        int digit4 = (number % 100) / 10;
        int digit5 = number  % 10;

        System.out.println(digit1);
        System.out.println("" + digit2);
        System.out.println("" + digit3);
        System.out.println("" + digit4);
        System.out.println("" + digit5);

//        scanner.close();



    }
}
