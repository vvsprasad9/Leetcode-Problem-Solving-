class Solution {
    public int beautySum(String s) {
        int su = 0;
        for(int i = 0;i<s.length();i++){
            int[]freq = new int[26];
            for(int j = i;j<s.length();j++){
                  int ind = s.charAt(j) - 'a';
                freq[ind]++;

                int min = Integer.MAX_VALUE;
                int max = 0;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        min = Math.min(min, freq[k]);
                        max = Math.max(max, freq[k]);
                    }
                }
                su += max - min;
        }
        }
        return su;
    }
}