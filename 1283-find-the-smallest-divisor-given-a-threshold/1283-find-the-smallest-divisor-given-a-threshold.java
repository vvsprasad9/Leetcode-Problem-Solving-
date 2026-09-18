class Solution {
    public boolean smallDivisor(int m,int threshold,int[]nums){
        int c = 0;
        for(int i : nums){
            c += (i + m - 1)/m;
            if(c > threshold)
                break;
        }
        return c <= threshold;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int s = 1,e = 1,min = Integer.MAX_VALUE;
        for(int i : nums){
            e = Math.max(e,i);
        }

        while(s <= e){
            int m = (s + e)/2;
            if(smallDivisor(m,threshold,nums)){
                min = m;
                e = m - 1;
            }
            else{
                s = m + 1;
            }
        }
        return min;
    }
}