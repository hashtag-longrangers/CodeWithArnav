import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static void reverse(ArrayList<Integer> arr, int start, int end) {
		while ( start <= end ) {
			Collections.swap(arr, start, end);
			start++;
			end--;
		}
	}
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
		int size = arr.size();
		k = k % size;

		reverse(arr, 0, k - 1);
		reverse(arr, k, size - 1);
		reverse(arr, 0, size - 1);
		
		return arr;
    }
}
