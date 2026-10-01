class Solution {
    public int findKthPositive(int[] arr, int k) {
       HashSet<Integer> hs = new HashSet<>();

        for (int i : arr) {
            hs.add(i);
        }

        int count = 0;

        // Check positive integers starting from 1
        for (int i = 1; ; i++) {

            if (!hs.contains(i)) {
                count++;

                if (count == k) {
                    return i;
                }
            }
        }
    }
}