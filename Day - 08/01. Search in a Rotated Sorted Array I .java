class Solution {
    public int search(int[] nums, int target) {
        
        //Linear Search
        // for( int i = 0 ; i < nums.length ; i++){
        //     if ( nums[i] == target ){
        //         return i;
        //     }
        // }
        // return -1;

        //Answer
        int size = nums.length;

        int left = 0;
        int right = size - 1;

        while ( left <= right ) {
            int mid = (left +  right) / 2;

            if ( nums[mid] > nums[size - 1]) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        int ans = binarySrch(nums, 0 , left - 1, target );

        if ( ans != -1 ) {
            return ans;
        }
        return binarySrch(nums,left , size - 1, target ) ;
    }

    private int binarySrch(int[] nums,int left,int right,int target){
        int start = left;
        int end = right;

        while ( start <= end ){
            int mid = (start + end ) / 2;

            if ( nums[mid] == target ) {
                return mid;
            }
            else if ( nums[mid] > target ) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
