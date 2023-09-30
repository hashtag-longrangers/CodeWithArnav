//           FOR CHECKING ONLY ROTATE
import java.util.*;
public class Solution {

    
    public static int isSorted(int n, int []arr) {
        // Write your code here.

        boolean ans = true;
        for ( int i = 1; i < arr.length; i++ ) {
            if ( arr[i] < arr[i - 1] ) {
                ans = false;
                break;
            }
        }
        return ans ? 1 : 0;
    }
}

//                FOR CHECKING ROTATE TOO
