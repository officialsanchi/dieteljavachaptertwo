import java.util.Scanner;

public class TaskTwentyFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        int number = scanner.nextInt();
        if(number % 3 == 0){
            System.out.println("Number is divisible by 3");
        }
        else {
            System.out.println("Number is not divisible by 3");
        }
    }
}
