import java.util.Arrays;

public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int[] ans = new int[2];

        Arrays.sort(a);
        
        int sLargest = a[n - 2];
        int sSmallest = a[1];

        ans[0] = sLargest;
        ans[1] = sSmallest;

        return ans;
    }
}
