class Solution {
    public int[] reverseArray (int[] a, int start, int end) {
        while (start <= end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start ++;
            end--;       
        }

        return a;
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverseArray (nums, 0, nums.length - k - 1);
        reverseArray (nums, nums.length - k, nums.length - 1);
        reverseArray (nums, 0, nums.length - 1);
    }
}