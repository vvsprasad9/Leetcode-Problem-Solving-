class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>hm = new HashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        int v = 0,c = 0;

        for(char ch : hm.keySet()){
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u'){
                v = Math.max(v,hm.get(ch));
            }
            else{
                c = Math.max(c,hm.get(ch));
            }
        }

        return v + c;
    }
}