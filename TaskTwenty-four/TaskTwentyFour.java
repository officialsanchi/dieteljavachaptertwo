import java.util.Scanner;

public class TaskTwentyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println("Enter first input :");
        int one = scanner.nextInt();
        System.out.println("Enter second input :");
        int two = scanner.nextInt();
        System.out.println("Enter third input :");
        int three = scanner.nextInt();
        System.out.println("Enter four input :");
        int four = scanner.nextInt();
        System.out.println("Enter five input :");
        int five = scanner.nextInt();

        if(one > two & one >three & one > four & one > five ){
            System.out.println("Number one is the largest");
        }if(one < two & one < three & one < four & one < five ){
            System.out.println("Number one is the smallest");
        }
        if(two > one & two >three & two > four & two > five ){
            System.out.println("Number two is the largest");
        }if(two < one & two < three & two < four & two < five ){
            System.out.println("Number two is the smallest");
        }
        if(three > one & three >two & three > four & three > five ){
            System.out.println("Number three is the largest");
        }if(three < one & three < two & three < four & three < five ){
            System.out.println("Number three is the smallest");
        }
        if(four > one & four >two & four > three & four > five ){
            System.out.println("Number four is the largest");
        }if(four < one & four < two & four < three & four < five ){
            System.out.println("Number four is the smallest");
        }

        if(five > one & five >two & five > three & five > four ){
            System.out.println("Number five is the largest");
        }if(five < one & five < two & five < three & five < four ){
            System.out.println("Number five is the smallest");
        }

    }
}
