// Hamsa
import java.util.Scanner;

public class arithmeticoperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition is : "+(a+b));
        System.out.println("Substraction is : "+(a-b));
        System.out.println("Multiplication is :"+(a*b));
        System.out.println("Division is : "+(a/b));
        System.out.println("Modulus is : "+(a%b));
        System.out.println("Increment is : "+(a++));
        System.out.println("Decrement is : "+(a--));

    }
}
