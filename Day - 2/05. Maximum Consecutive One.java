class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int countPrev = 0;

        for ( int i = 0; i < nums.length; i++ ) {
            if ( nums[i] == 1 ) {
                count++;
            }
            else{
                count = 0;
            }
            countPrev = Math.max(count, countPrev);
        }
        return countPrev;
    }
}
