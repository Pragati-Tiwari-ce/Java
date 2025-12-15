import java.util.*;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pi = 3.14f;
        System.out.print("Enter the radius: ");
        float r = sc.nextFloat();

        float area = pi * r * r;
        System.out.println("The area of circle is: " + area);

        sc.close();
    }
}
