
// Hamsa
import java.util.Scanner;

public class bitwiseoperators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("bitwise and is"+(a&b));
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(a<<b);
        System.out.println(a>>b);
        System.out.println(a*b);
    }
}
