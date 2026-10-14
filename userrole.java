import java.util.Scanner;

public class userrole {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the role");
        String role = sc.nextLine();
        System.out.println("Enter the username");
        String username = sc.nextLine();
        System.out.println("Enter the password");
        String password = sc.nextLine();
        if(role.equals("Admin"))
        {
            if(username.equals("Hamsa"))
            {
                if(password.equals("BTS"))
                {
                    System.out.println("You are eligible to get access");
                }
                else {
                    System.out.println("You are not eligible to get access");
                }
            }
        }else if(role.equals("Developer"))
        {
            System.out.println("Your role is developer");
        }
    }
}
