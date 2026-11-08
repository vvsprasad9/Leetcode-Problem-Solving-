class Solution {
    public int lengthOfLastWord(String s) {
        String val = s.trim();
        String v[] = val.split(" ");
        return v[v.length-1].length();
    }
}