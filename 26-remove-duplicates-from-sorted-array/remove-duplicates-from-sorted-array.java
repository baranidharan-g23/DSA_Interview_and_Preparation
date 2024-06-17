class Solution {
    public int removeDuplicates(int[] nums) {
        int last = nums[0];
        int count=1;
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i]==last)
            {
                continue;
            }
            else
            {   nums[count]=nums[i];
                last = nums[i];
                count++;
            }
        }
        return count;
    }
}