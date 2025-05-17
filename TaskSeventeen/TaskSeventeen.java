import java.util.Scanner;

public class TaskSeventeen {
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );
        System.out.println("Enter your first digit number :");
        int numberOne = input.nextInt();
        System.out.println("Enter your second digit number :");
        int numberTwo = input.nextInt();
        System.out.println("Enter your third digit number :");
        int numberThree = input.nextInt();

        int sum = numberOne + numberTwo + numberThree;
        int average = sum / 3;
        int product = numberOne * numberTwo * numberThree;
        System.out.println("The sum of the numbers is : " + sum);
        System.out.println("The average of the the numbers is :" + average);
        System.out.println("the product of the number is : " + product);
        if(numberOne > numberTwo && numberOne > numberThree){
            System.out.println("Number one is the largest");
        }
        if(numberTwo > numberOne && numberTwo > numberThree){
            System.out.println("Number two is the largest");
        }
        if(numberThree > numberOne &&  numberThree > numberTwo){
            System.out.println("Number three is the largest");
        }

        if(numberOne < numberTwo && numberOne < numberThree){
            System.out.println("Number one is the smallest");
        }
        if(numberTwo < numberOne && numberTwo < numberThree){
            System.out.println("Number two is the smallest");
        }
        if(numberThree < numberOne && numberThree < numberTwo){
            System.out.println("Number three is the smallest");
        }
    }
}
