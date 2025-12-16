import java.util.*;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int A = sc.nextInt();

        System.out.print("Enter second number: ");
        int B = sc.nextInt();

        System.out.print("Enter third number: ");
        int C = sc.nextInt();

        if (A >= B && A >= C) {
            System.out.println("Largest number is: " + A);
        }
        else if (B >= A && B >= C) {
            System.out.println("Largest number is: " + B);
        }
        else {
            System.out.println("Largest number is: " + C);
        }

        sc.close();
    }
}
