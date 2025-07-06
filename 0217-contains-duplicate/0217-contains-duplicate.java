class Solution {
    public boolean containsDuplicate(int[] nums) {
        int size = nums.length-1;
        int count = 1;
        HashMap<Integer,Integer> hm = new HashMap<>();
            for(int i = 0; i <= size ;i++){
                if( !hm.containsKey(nums[i])){
                    hm.put(nums[i],i);
                }else{
                    return true;
                }
            }
        return false;
    }
}