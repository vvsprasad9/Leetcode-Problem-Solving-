class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ls = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    long val = 1L * nums[i] + nums[j] + nums[k];
                    long tar = (long) target - val;

                    if (tar < Integer.MIN_VALUE || tar > Integer.MAX_VALUE) {
                        continue;
                    }
                    int targ = (int)tar;
                    if (hm.containsKey(targ)) {
                        int l = hm.get(targ);
                        List<Integer> lt = new ArrayList<>();
                        if (l != i && l != j && l != k) {
                            lt.add(nums[i]);
                            lt.add(nums[j]);
                            lt.add(nums[k]);
                            lt.add(targ);
                            Collections.sort(lt);
                            hs.add(lt);
                        }
                    }
                }
            }
        }
        ls.addAll(hs);
        return ls;
    }
}