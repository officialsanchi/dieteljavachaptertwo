import java.util.Scanner;

public class TaskTwentySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();

        int tripled = inputOne + inputOne + inputOne;
        int multiple = inputTwo * inputTwo ;
        if (tripled == multiple){
            System.out.println("First number is a multiple of second number");
        }
        else {
            System.out.println("First number  not is a multiple of second number");
        }

    }
}
