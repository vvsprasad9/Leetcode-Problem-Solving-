class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        int val = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            val = nums[m];
            boolean isVal = true;
            if (m - 1 >= 0) {
                if (nums[m - 1] == val) {
                    isVal = false;
                    if ((m) % 2 == 0) {
                        r = m - 1;
                    } else {
                        l = m + 1;
                    }
                }
            }

            if (m + 1 <= r) {
                if (nums[m + 1] == val) {
                    isVal = false;
                    if ((m + 1) % 2 == 0) {
                        r = m - 1;
                    } else {
                        l = m + 1;
                    }
                }
            }

            if (isVal) {
                return val;
            }
        }
    return val;
    }
}