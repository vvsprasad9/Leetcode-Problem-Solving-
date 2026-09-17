class Solution {

    public boolean count(int[] arr, int m, int k, int mid) {
        int c = 0, mVal = 0;

        for (int i : arr) {
            if (i <= mid) {
                c += 1;
                if (c == k) {
                    c = 0;
                    mVal += 1;
                }
            } else {
                c = 0;
            }
        }
        return mVal >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long)m*k || Integer.MAX_VALUE == m * k){
            return -1;
        }

        int s = 1,e = 1,min = Integer.MAX_VALUE;
        for(int i : bloomDay){
            e = Math.max(e,i);
        }
     

        while(s <= e){
            int mid = (s + e)/2;
            if(count(bloomDay,m,k,mid)){
                min = Math.min(min,mid);
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }

        }
        return min;
}
}