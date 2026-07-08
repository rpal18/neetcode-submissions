class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Here we are given a sorted array , we can easily make use of bs .
        for(int i = 0 ; i < numbers.length ; i++){
           int start = i ;
           int end = fn(numbers , i + 1 , numbers.length -1  , target - numbers[i]) ;
           if(end != -1){
            return new int [] {start + 1 , end + 1};
           }

        }

        return new int[] {-1  ,-1};

    }
    int fn(int [] arr , int start , int end , int target){
        while(start <= end){
            int mid = start + ( end - start ) / 2;
            if(target == arr[mid]){
                return mid;
            }else if( arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
