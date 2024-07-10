class Solution {
    public int missingNumber(int[] nums) {
    int i = 0;
int flag = 0;
int counter = 0;
    while(i<nums.length)
    {
        if(nums[i]!=i)
        {   
            if(nums[i]!=nums.length)
            {   
                int temp = nums[i];//temp = 1
                nums[i]=nums[(nums[i])];// = nums[nums[2]] = nums[1] = 3
                nums[temp]=temp;// = 
            }
            else if(nums[i]==nums.length)
            {
                flag = i;
                i++;
                counter = 1;
            }
        }
        else
         i++;

        
    }
    if(counter == 0)
    flag = nums.length;
     return flag;
    }
}