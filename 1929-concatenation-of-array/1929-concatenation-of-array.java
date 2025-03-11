class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        int cnt = 0;
        for (int i = nums.length; i < (2 * nums.length); i++) {
            ans[i] = nums[cnt];
            cnt++;
        }

        return ans;
    }
}