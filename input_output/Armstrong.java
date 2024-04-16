package input_output;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n= sc.next();
        int product = 0;
        for(int i = 0;i<n.length();i++)
        {
            int a = (n.charAt(i)-'0');
            product = product +(a*a*a);
        }
        System.out.println(product);
        sc.close();
    }
}
