class Solution {
    public int repeatedNTimes(int[] nums) {
        int count;
        int n=nums.length/2;
       for(int i=0;i<nums.length-1;i++)
       {
         count=0;
          for (int j=0;j<nums.length;j++)
          {
            if(nums[i]==nums[j])
            {
                count++;
            }
          }
          if(count == n)
          {
            return nums[i];
          }
       } 
       return 0;
    }
}