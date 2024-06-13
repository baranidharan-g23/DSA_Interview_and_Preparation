class Solution {
    public int romanToInt(String a) {
        int sum = 0;
    for(int i = 0;i<a.length();i++)
    {
        if(a.charAt(i)=='M')
        sum = sum+1000;
        else if(a.charAt(i)=='C'&&(i+1)!=a.length()&&a.charAt(i+1)=='M')
        {
            sum = sum + 900;
            i++;
        }
        else if(a.charAt(i)=='D')
        sum = sum+500;
        else if(a.charAt(i)=='C'&&(i+1)!=a.length()&&a.charAt(i+1)=='D')
        {
            sum = sum + 400;
            i++;
        }
        else if(a.charAt(i)=='X'&&(i+1)!=a.length()&&a.charAt(i+1)=='C')
        {
            sum = sum + 90;
            i++;
        }
        else if(a.charAt(i)=='X'&&(i+1)!=a.length()&&a.charAt(i+1)=='L')
        {
            sum = sum + 40;
            i++;
        }
        else if (a.charAt(i)=='C')
        sum = sum + 100;
        else if (a.charAt(i)=='L')
        sum = sum+50;
        
        else if (a.charAt(i)=='V')
        sum = sum + 5;
        else if (a.charAt(i)=='I'&&(i+1)!=a.length()&&a.charAt(i+1)=='V')
        {sum = sum + 4;
        i++;}
        else if (a.charAt(i)=='I'&&(i+1)!=a.length()&&a.charAt(i+1)!='V'&&a.charAt(i+1)=='X')
        {
            sum = sum+9;
            i++;
        }
        else if(a.charAt(i)=='I')
        {
            sum = sum+1;
        }
        else if(a.charAt(i)=='X')
        sum = sum+10;
    }
    return sum;
    }
}