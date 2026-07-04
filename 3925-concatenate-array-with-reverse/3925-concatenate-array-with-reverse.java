class Solution {
    public int[] concatWithReverse(int[] nums) {

        int[] ans = new int[2*nums.length];
        int j = nums.length-1;

        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
        }

        for(int i=nums.length;i<ans.length;i++){
            ans[i] = nums[j];
            j--;
        }
        return ans;
    }
}