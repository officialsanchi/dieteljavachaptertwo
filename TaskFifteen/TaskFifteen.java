import java.util.Scanner;

public class TaskFifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter first number:");
        int first = scanner.nextInt();
        System.out.println("Enter second number:");
        int second = scanner.nextInt();

        int firstSquare = first * first;
        int secondSquare = second * second;
        System.out.println( "The square root of the first number is :" +firstSquare);
        System.out.println( "The square root of the second number is :"+secondSquare);
        int sumOfTheirSquare = firstSquare + secondSquare;
        System.out.println("The sum of the square root of first number and second number :"+sumOfTheirSquare);
        int differenceOfTheirSquare = firstSquare - secondSquare;
        System.out.println(" The dufference of the square root of first number and second number :"+differenceOfTheirSquare);
    }
}
