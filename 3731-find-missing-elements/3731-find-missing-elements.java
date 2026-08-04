class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer>hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }

        List<Integer>ls = new ArrayList<>();

        for(int i = nums[0] + 1;i<nums[nums.length-1];i++){
            if(!hs.contains(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}