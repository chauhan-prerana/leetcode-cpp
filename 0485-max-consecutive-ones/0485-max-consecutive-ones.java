class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int m_count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
                m_count = Math.max(count, m_count);
            } else {
                count = 0;
            }
        }

        return m_count;
    }
}