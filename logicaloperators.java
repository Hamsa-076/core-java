//Hamsa
import java.util.Scanner;

public class logicaloperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter true or false for a and b:");
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!(a && b));
    }
}