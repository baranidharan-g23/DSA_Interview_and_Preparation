package input_output;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String rts = "";
        for(int i = str.length()-1;i>=0;i--)
        {
            rts = rts+str.charAt(i);
        }
        System.out.println(rts);
        if (rts.equals(str))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
