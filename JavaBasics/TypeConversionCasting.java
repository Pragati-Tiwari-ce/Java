public class TypeConversionCasting {
    public static void main(String[] args) {

        // -------- Type Conversion (Widening) --------
        int a = 10;
        double d = a;   // automatic conversion: int → double
        System.out.println("Type Conversion (int to double): " + d);

        // -------- Type Casting (Narrowing) --------
        double x = 25.78;
        int y = (int) x;   // manual casting: double → int
        System.out.println("Type Casting (double to int): " + y);

        // -------- Type Casting in Division --------
        int p = 5;
        int q = 2;
        float result = (float) p / q;   // casting to get decimal result
        System.out.println("Division with casting: " + result);
    }
}
