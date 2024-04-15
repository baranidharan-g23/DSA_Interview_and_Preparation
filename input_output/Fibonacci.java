package input_output;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i = 1;i<iter; i++)
        {
            b = b+a;
            a = b-a;
            System.out.println(b);
        }
        sc.close();
    }
}
