import java.util.Scanner;

public class armstrongwhile {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int original = n;
        int a = 0;
        while(n > 0)
        {
            int num = n % 10;
            a = a + (num*num*num);
            n = n/10;
        }
        if(a==original)
        {
            System.out.println("is armstrong");
        }
        else
        {
            System.out.println("is not armstrong");
        }
    }
}
