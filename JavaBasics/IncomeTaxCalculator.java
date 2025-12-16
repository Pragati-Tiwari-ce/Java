import java.util.*;

public class IncomeTaxCalculator{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter your income: ");
        int income=sc.nextInt();
        double tax;

        if(income<500000){
            tax=0;
        }
        else if(income <=1000000){
            tax=0.2 * (income);
        }
        else{
            tax=0.3 * (income);
        }
        System.out.println("Tax is: "+ tax);
    }
}
