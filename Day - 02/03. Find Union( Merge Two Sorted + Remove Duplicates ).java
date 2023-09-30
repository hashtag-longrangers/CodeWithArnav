import java.util.*;
public class Solution {
    public static List<Integer> removeDuplicate(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while ( i < a.length && j < b.length ){
            if ( a[i] < b[j] ) {
                list.add(a[i]);
                i++;
            }
            else {
                list.add(b[j]);
                j++;
            }
        }
        while ( i < a.length ) {
            list.add(a[i]);
            i++;
        }
        while ( j < b.length ) {
            list.add(b[j]);
            j++;
        }
        return removeDuplicate(list);
    }
}
