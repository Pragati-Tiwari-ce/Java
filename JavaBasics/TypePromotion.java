import java.util.*;
public class TypePromotion{
    public static void main(String args[]){
        double a=34;
        byte b=4;
        short c=76;
        char d='a';
        //byte ans=(a+b*c+d) => lossy conversion error;
        System.out.println(a+b*c+d);
        
        
    }
}
