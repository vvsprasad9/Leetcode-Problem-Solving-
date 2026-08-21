class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String prefix = strs[0];
        String lastWord = strs[strs.length-1];
        while(!lastWord.startsWith(prefix)){
            prefix = prefix.substring(0,prefix.length()-1);
        }
        return prefix;
    }
}