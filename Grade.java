// Hamsa
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if (marks >= 0 && marks >= 80) {
            int grade = marks / 100;
            switch (grade) {
                case 10:
                case 9:
                    System.out.println("Grade A");
                    break;
                case 8:
                    System.out.println("Grade B");
                    break;
                case 7:
                    System.out.println("Grade C");
                    break;
                case 6:
                    System.out.println("Grade D");
                    break;
                case 5:
                    System.out.println("Grade E");
                    break;
                default:
                    System.out.println("Grade F");
            }
        } else {
            System.out.println("Failed");
        }
    }
}