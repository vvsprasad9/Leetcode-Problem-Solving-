class Solution {
    public boolean koko(int v,int[] piles,int h){
        int c = 0;
        for(int i : piles){
            c += (i + v - 1)/v;
            if(c > h){
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1,e = 1,ans = Integer.MAX_VALUE;
        for(int i : piles){
            e = Math.max(e,i);
        }

        while(s <= e){
            int mid = s + (e - s)/2;
            if(koko(mid,piles,h)){
                ans = Math.min(ans,mid);
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
}