class Solution {
    public int[][] merge(int[][] intervals) {

        // int n = intervals.length; // size of the array
        // //sort the given intervals:
        // Arrays.sort(intervals);
        // List<List<Integer>> ans = new ArrayList<>();

        // for (int i = 0; i < n; i++) { // select an interval:
        //     int start = intervals[i][0];
        //     int end = intervals[i][1];

        //     //Skip all the merged intervals:
        //     if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
        //         continue;
        //     }

        //     //check the rest of the intervals:
        //     for (int j = i + 1; j < n; j++) {
        //         if (intervals[j][0] <= end) {
        //             end = Math.max(end, intervals[j][1]);
        //         } else {
        //             break;
        //         }
        //     }
        //     ans.add(Arrays.asList(start, end));
        // }
        // return ans;
        
    int n = intervals.length; // size of the array

    // Sort the given intervals based on the start values:
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
    List<int[]> mergedIntervals = new ArrayList<>();

    int start = intervals[0][0];
    int end = intervals[0][1];

    for (int i = 1; i < n; i++) {
        int nextStart = intervals[i][0];
        int nextEnd = intervals[i][1];

        if (nextStart <= end) {
            // Merge overlapping intervals
            end = Math.max(end, nextEnd);
        } else {
            // Add the merged interval to the result and start a new one
            mergedIntervals.add(new int[]{start, end});
            start = nextStart;
            end = nextEnd;
        }
    }

    // Add the last merged interval
    mergedIntervals.add(new int[]{start, end});

    // Convert the ArrayList to a 2D array
    int[][] ans = new int[mergedIntervals.size()][2];
    for (int i = 0; i < mergedIntervals.size(); i++) {
        ans[i] = mergedIntervals.get(i);
    }

    return ans;
    }
}
