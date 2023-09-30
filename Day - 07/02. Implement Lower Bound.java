public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here

        int ans = arr.length;
        int s = 0;
        int e = arr.length - 1;

        while ( s <= e ) {
            int mid = s + (e -s) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                //look for smaller index on the left
                e = mid - 1;
            } else {
                s = mid + 1; // look on the right
            }
        }
        return ans;
        
    }
}
