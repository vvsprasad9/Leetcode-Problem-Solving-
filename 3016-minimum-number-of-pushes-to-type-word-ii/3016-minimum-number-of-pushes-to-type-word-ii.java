class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer>hm = new HashMap<>();
        for(char ch : word.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int arr[] = new int[hm.size()];
        int i = 0;
        for(char ch : hm.keySet()){
            arr[i++] = hm.get(ch);
            System.out.println(arr[i-1]);
        }
        Arrays.sort(arr);

        int c  = 0,ans = 0,j = 0;
        for(i = hm.size()-1;i>=0;i--){
            if(j % 8 == 0){
                c += 1;
            }
            ans += c * arr[i];
            j++;
        }
        return ans;

    }
}