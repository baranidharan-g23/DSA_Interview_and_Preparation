class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
    List<Integer> ans = new ArrayList<Integer>();

     for(int i = 0;i<matrix.length;i++)
     {
        int flag = 0;
        int min = matrix[i][0];
        int mini = 0;
        for(int j = 1;j<matrix[i].length;j++)
        {
            if(min>matrix[i][j])
            {
                min = matrix[i][j];
                mini = j;
            }
        }
        for(int j = 0;j<matrix.length;j++)
        {
            if(min<matrix[j][mini])
                flag = 1;
        }
        if(flag == 0)
            ans.add(min);
     }   
     return ans;
    }
}