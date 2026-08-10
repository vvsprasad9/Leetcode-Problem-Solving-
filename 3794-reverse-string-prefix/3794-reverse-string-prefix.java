class Solution {
    public String reversePrefix(String s, int k) {
        String v1 = "";
        String v2 = "";

        if(s.length() == k){
            for(int j = k-1;j>=0;j--){
                v2 += s.charAt(j);
            }
            return v2;
        }
        for(int i = k;i<s.length();i++){
            v1 += s.charAt(i);
        }

        for(int j = k-1;j>=0;j--){
            v2 += s.charAt(j);
        }

        v2 += v1;
        return v2;
    }
}