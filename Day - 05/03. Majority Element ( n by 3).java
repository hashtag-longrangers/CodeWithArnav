class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for ( int i = 0 ; i < nums.length; i++ ) {
            list.add(nums[i]);
        }

        Collections.sort(list);

        return (list.get(list.size()/3));
    }
}
