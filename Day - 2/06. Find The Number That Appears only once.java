class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums ) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for ( int num : nums ) {
            if ( map.get(num) == 1 ) {
                return num;
            }
        }
      //          CAN ALSO BE USED
      // for ( Map.Entry<Integer, Integer> entry : map.entrySet() ) {
      //     if ( entry.getValue() == 1 ) {
      //       return entry.getKey();
      //     }
      // }
      

        return nums[0];
    }
}
