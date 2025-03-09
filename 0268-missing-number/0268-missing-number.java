class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length == 0) {
            return -1;
        }

        int arrSum = 0;
        int sum = nums.length * (nums.length + 1) / 2;

        for(int i = 0; i < nums.length; i++) {
            arrSum += nums[i];
        }   

        return sum - arrSum;
    }
}