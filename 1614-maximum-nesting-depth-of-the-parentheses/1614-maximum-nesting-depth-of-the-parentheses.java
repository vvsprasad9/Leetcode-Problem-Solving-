class Solution {
    public int maxDepth(String s) {
        int c = 0,m = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                c++;
                m = Math.max(c,m);
            }
            else if(ch == ')'){
                c--;
            }
        }
        return m;
    }
}