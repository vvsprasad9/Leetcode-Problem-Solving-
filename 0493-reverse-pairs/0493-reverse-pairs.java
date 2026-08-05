class Solution {
    public int reversePairs(int[] nums) {
       int c = mergeSort(nums,0,nums.length-1);
       return c;
    }

    public int mergeSort(int[] nums,int l,int r){
        if(l >= r){
            return 0;
        }

        int m = l + (r - l)/2;

        int c = mergeSort(nums,l,m) + mergeSort(nums,m + 1,r);

        int j = m + 1;

        for(int left = l;left <= m;left++){
            while(j <= r && (long)nums[left] > 2L * nums[j]){
                j++;
            }
            c += j - (m + 1);
        }

        merge(nums,l,m,r);
        return c;
    }

    public void merge(int[]nums,int l ,int m,int r){
        int temp[] = new int[r - l + 1];

        int right = m + 1,k = 0,left = l;

        while(left <= m && right <= r){
            if(nums[left] <= nums[right]){
                temp[k++] = nums[left++];
            }
            else{
                temp[k++] = nums[right++];
            }
        }

        while(left <= m){
            temp[k++] = nums[left++];
        }

        while(right <= r){
            temp[k++] = nums[right++];
        }

        for(int i = 0;i<temp.length;i++){
            nums[l + i] = temp[i];
        }
    }
}