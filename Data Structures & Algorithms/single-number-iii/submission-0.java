class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0 ;
        for(int i : nums ){
            xor = xor ^ i ;
        }

        int rightMostSetBit = xor & (-xor);

        int grp1 = 0 ;
        int grp2 = 0 ; 

        for(int i : nums ){
            int ans = (i & rightMostSetBit);
            if(ans == 0){
                grp1 = grp1 ^ i ;
            }else{
                grp2 = grp2 ^ i;
            }
        }

        return new int[] {grp1 , grp2};
    }
}