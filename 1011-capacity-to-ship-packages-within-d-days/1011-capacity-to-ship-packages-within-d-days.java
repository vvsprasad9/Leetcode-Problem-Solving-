class Solution {
    public boolean isCapacity(int m,int weights[],int days){
        int d = 1,s = 0;
        for(int i : weights){
            if(s + i <= m){
                s += i;
            }
            else{
                d+=1;
                s = i;
            }
        }
        return d <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int s = 0,e = 0;
        for(int i : weights){
            s = Math.max(s,i);
            e += i;
        }

        while(s <= e){
            int m = (s + e)/2;
            if(isCapacity(m,weights,days)){
               e = m - 1;
            }
            else{
                s = m + 1;
            }
        }
        return s;
    }
}