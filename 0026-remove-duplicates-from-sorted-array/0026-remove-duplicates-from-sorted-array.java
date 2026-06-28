class Solution {
    public int removeDuplicates(int[] nums) {
        int k=nums.length;

        for(int i=1; i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                nums[i-1]=Integer.MAX_VALUE;
                k--;
            }
        }
        Arrays.sort(nums);
        return k;
    }
}