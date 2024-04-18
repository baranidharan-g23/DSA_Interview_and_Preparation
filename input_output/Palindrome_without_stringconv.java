package input_output;

public class Palindrome_without_stringconv {
public static void main(String[] args) {
    int x = 1234321;
    if(x <0)
    System.out.println("False");
    else
    {
        int temp = x%10;
        int pmet = x;
        x=x/10;
        while(x!=0)
        {
            temp = temp*10 + x%10;
            x = x/10;
        }
        if(pmet == temp)
        System.out.println("True palindrome");
        else
        System.out.println("Not palindrome");
    }
}
    
}