class Solution {
    public int minMoves(int[] nums) {
       int m = 0,c=0;
       for(int i : nums){
        m = Math.max(i,m);
       } 
       for(int i = 0;i<nums.length;i++){
        if(nums[i] < m){
            c += m - nums[i];
        }
       }
       return c;
    }
}