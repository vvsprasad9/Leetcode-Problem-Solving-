class Solution {
    public int findMin(int[] arr) {
        int val = Integer.MAX_VALUE;
        int l = 0,r = arr.length-1;
        while(l <= r){
            int m = l + (r-l)/2;
            // if(m > r){
            //     return val;
            // }
            if(arr[l] <= arr[m]){
                val = Math.min(val,arr[l]);
                l = m + 1;
            }
            else{
                l+=1;
            }
        }
        return val;
    }
}