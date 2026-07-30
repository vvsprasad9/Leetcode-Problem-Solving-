class Solution {
    public int minimumPushes(String word) {
        int c  = 0,ans = 0;
        for(int i = 0;i<word.length();i++){
            if(i % 8 == 0){
                c += 1;
            }
            ans += c;
        }
        return ans;
    }
}