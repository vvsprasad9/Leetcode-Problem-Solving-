class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ls = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                    List<Integer> l = new ArrayList<>();
                    int val = nums[i] + nums[j];
                    int target = -val;
                    if (hm.containsKey(target)) {
                        int k = hm.get(target);
                        if (k != i && k != j) {
                            l.add(nums[i]);
                            l.add(nums[j]);
                            l.add(val * -1);
                            Collections.sort(l);
                            hs.add(l);
                        }
                    }
                }
        }

        ls.addAll(hs);

        return ls;

    }
}