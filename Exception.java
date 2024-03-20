import java.util.*;
import java.util.Scanner;
public class Exception {
         public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
        try{
                int a,b;
                System.out.println("Enter the value of a::");
                a=obj.nextInt();
                System.out.println("Enter the value of b::");
                b=obj.nextInt();
                int c=a/b;
                System.out.println("The divison is "+c);
        }
        catch(ArithmeticException e){
            System.out.println("The Zero Divison Error is caught "+e.getMessage());
        }
        finally{
            System.out.println("This is finally bloak");
        }
    }
}
