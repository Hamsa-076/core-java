import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the rollno: ");
        String rollno= sc.nextLine();
        System.out.println("Enter the branch: ");
        String branch= sc.nextLine();
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Enter the phonenumber: ");
        long phone_number= sc.nextLong();
        System.out.println("Enter the CGPA: ");
        float CGPA= sc.nextFloat();
    }
}
