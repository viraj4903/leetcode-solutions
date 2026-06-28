class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=0;
        for(int i=m; i<nums1.length; i++){
            nums1[i] = nums2[p];
            p++;
        }
        Arrays.sort(nums1);
    }
}