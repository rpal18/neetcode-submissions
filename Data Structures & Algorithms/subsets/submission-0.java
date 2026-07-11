class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
         fn(nums , 0 , ans  , new ArrayList());
         return ans;
    }
    void  fn (int [] nums , int index ,
     List<List<Integer>> ans , List<Integer> current){
        if(index == nums.length){
         ans.add(new ArrayList<>(current));
         return ;
        }

        
        fn(nums , index + 1 , ans , current);

        current.add(nums[index]);

        fn(nums , index + 1 , ans , current);

        current.remove(current.size() - 1);

        
    }
}
