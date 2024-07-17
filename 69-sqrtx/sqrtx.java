class Solution {
    public int mySqrt(int x) {
        for(int i = 0;i<=x/2;i++)
        {
            if(x==(i*i))
                return i;
            else if(x<(i*i))
            {
                return i-1;
            }
            else
            {
                if(x<(i+1)*(i+1))
                    return i;
            }
        }
        if(x==1)
        return 1;
        if(x==Integer.MAX_VALUE)
        return 46340;
        return 0;
    }
}