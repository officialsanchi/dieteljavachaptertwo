import java.util.Scanner;

public class TaskTwentyEight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        System.out.println("Collect the input of the tier :");
        double tier = scanner.nextDouble();

        System.out.println("Collect the input of the radius:");
        double radius = scanner.nextDouble();

        double diameter = 2 * radius;
        double circumference = 2 * tier * radius;
        double area = tier * radius * radius;

        System.out.println("The diameter of the circle is "+diameter);
        System.out.println("The circumference of the circle is "+circumference);
        System.out.println("The area of the circle is " +area);
    }
}
