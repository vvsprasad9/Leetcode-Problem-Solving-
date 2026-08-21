class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        String ans = "",prev = strs[0];
        for(int i = 1;i<strs.length;i++){
            int j = 0;
            ans = "";
            String str = strs[i];
            while(j < str.length() && j < prev.length()){
                if(str.charAt(j) == prev.charAt(j)){
                    ans += str.charAt(j);
                }
                else{
                    break;
                }
                j++;
            }
            prev = ans;
        }
        return ans;
    }
}