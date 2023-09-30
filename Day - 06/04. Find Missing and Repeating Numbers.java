import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static int[] findMissingRepeatingNumbers(int []nums) {
        // Write your code here
        int[] ans = new int[2];
        int n = nums.length;
        int xor = 0;

        // Calculate XOR of all elements and numbers from 1 to n
        for (int i = 0; i < n; i++) {
            xor ^= nums[i] ^ (i + 1);
        }

        // Find the rightmost set bit in xor
        int rightmostSetBit = xor & -xor;

        int num1 = 0, num2 = 0;

        // Split the numbers into two groups based on the rightmost set bit
        for (int i = 0; i < n; i++) {
            if ((nums[i] & rightmostSetBit) != 0) {
                num1 ^= nums[i];
            } else {
                num2 ^= nums[i];
            }
            int expected = (i + 1) & rightmostSetBit;
            if ((expected & rightmostSetBit) != 0) {
                num1 ^= (i + 1);
            } else {
                num2 ^= (i + 1);
            }
        }

        // Check which number is repeating
        for (int i : nums) {
            if (i == num1) {
                ans[0] = num1;
                ans[1] = num2;
                break;
            } else if (i == num2) {
                ans[0] = num2;
                ans[1] = num1;
                break;
            }
        }

        return ans;        
    }
}
