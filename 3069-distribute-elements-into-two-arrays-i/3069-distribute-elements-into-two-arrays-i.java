class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer>first = new ArrayList<>();
        ArrayList<Integer>second = new ArrayList<>();

        for(int i = 0;i<2;i++){
            if(i % 2 == 0){
                first.add(nums[i]);
            }
            else{
                second.add(nums[i]);
            }
        }
for(int i = 2;i<nums.length;i++){
        if(first.get(first.size()-1) > second.get(second.size()-1)){
            first.add(nums[i]);
        }
        else{
            second.add(nums[i]);
        }
}

        int i = 0;

        for(int j : first){
            nums[i++] = j;
        }

        for(int j : second){
            nums[i++] = j;
        }
        return nums;
    }
}