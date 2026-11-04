class Solution {
    public static String Pal(String s){
        int l = 0,r = s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return "";
            }
            l++;
            r--;
        }
        return s;
    }
    public String longestPalindrome(String s) {
        String  ans = "";
        for(int i = 0;i<s.length();i++){
            for(int j = i + 1;j<=s.length();j++){
                String si = Pal(s.substring(i,j));
                ans = (ans.length()<si.length())?si:ans;
            }
        }
        return ans;
    }
}