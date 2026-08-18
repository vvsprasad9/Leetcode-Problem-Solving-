class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i = 0;i<=nums.length-k;i++){
            for(int j = i;j<i+k;j++){
                hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            }
        }

        int max = -1;
        for(int i = 0;i<=nums.length-k;i++){
            HashMap<Integer,Integer>hm1 = new HashMap<>();
            for(int j = i;j<i+k;j++){
                hm1.put(nums[j],hm1.getOrDefault(nums[j],0)+1);
            }

            for(int  v: hm1.keySet()){
                int val = hm.get(v) - hm1.get(v);
                if(val == 0){
                    max = Math.max(max,v);
                }
            }
        }
        return max;
    }
}