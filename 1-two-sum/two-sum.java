class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = 0;
        int sum;
        for (int i = 0 ;i < nums.length;i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                sum = nums[i]+nums[j];
                if(sum == target)
                {
                    a = i;
                    b = j;
                    break;
                }
            } 
            if(a!=0&&b!=0)
            {
                break;
            }
        }
        int[] ans = {0,0};
        ans[0] = a;
        ans[1] = b;
        return ans;
    }
}