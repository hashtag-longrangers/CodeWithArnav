public class Solution {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int ans = arr.length;
        int low = 0;
        int high = arr.length - 1;
        
        while ( low <= high ) {
            int mid = low + (high - low) / 2;

            if ( arr[mid] > x ) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
