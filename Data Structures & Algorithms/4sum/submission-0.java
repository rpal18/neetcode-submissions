class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
      
         List<List<Integer>> ans = new ArrayList<>();
           if(n <4) return ans;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i+1 && nums[j - 1] == nums[j]) {
                    continue;
                }

                int start = j + 1;
                int end = n - 1;
                while (start < end) {
                    long sum =0L + nums[i] + nums[j] + nums[start] + nums[end] ;
                    if (sum == target) {
                        ans.add(List.of(nums[i], nums[j], nums[start], nums[end]));
                        while(start < end && nums[start] == nums[start + 1]) start++;
                        while(start < end && nums[end] == nums[end - 1]) end--;
                        start++;
                        end--;
                    }else if(sum < target){
                        start = start + 1;
                    }else{
                        end = end - 1;
                    }
                }
            }
        }
        return ans ;
    }
}