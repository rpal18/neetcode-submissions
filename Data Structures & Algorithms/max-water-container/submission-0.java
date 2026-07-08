class Solution {
    public int maxArea(int[] heights) {
        int left = 0 ; 
        int right = heights.length - 1;
        int quantity = 0 ;
        while(left <= right){
           quantity = Math.max(quantity , Math.min(heights[left] , heights[right]) * (right - left));
           if(heights[left] <= heights[right]){
            left++;
           }else{
            right--;
           }
        }
        return quantity ;
    }
}
