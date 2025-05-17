import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
//        int numberOne = 0;
//        int numberTwo = 0;
//        int numberThree = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number :");
        int  numberOne = input.nextInt();
        System.out.print("Enter second number :");
        int  numberTwo = input.nextInt();
        System.out.print("Enter third number :");
        int  numberThree = input.nextInt();

        int result  = numberOne + numberTwo + numberThree ;
        System.out.println(result);

        System.out.printf( "Product is " + result );





    }
}
