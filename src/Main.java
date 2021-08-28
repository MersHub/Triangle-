import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Define the existence of a triangle along the sides....");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number of the side of the triangle: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number of the side of the triangle: ");
        int second = scanner.nextInt();

        System.out.print("Enter the third number of the side of the triangle: ");
        int third = scanner.nextInt();
        System.out.println();

        if ( (first + second) <= third || (first + third) <= second || (second + third) <= first)
            System.out.println(" Triangle is not exist");
        else
            System.out.println("Triangle is exist");

    }
}
