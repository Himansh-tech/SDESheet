// class Solution {
//     public int maxSubArray(int[] nums) {
        
//         int maxe = Integer.MIN_VALUE;
//         int n = nums.length;
//         int sum = 0;

//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){   
//                 for(int k=i;k<=j;k++){
//                     sum = sum + nums[k];
//                 }
//                 maxe = Math.max(maxe,sum);
//                 sum = 0;
//             }
//         }
//         return maxe;
//     }
// }
//above is o(n^3)



// class Solution {
//     public int maxSubArray(int[] nums) {
        
//         int maxe = Integer.MIN_VALUE;
//         int n = nums.length;
//         int sum = 0;

//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 sum = sum +nums[j];
//                 maxe = Math.max(maxe,sum);
//             }
//             sum = 0;
//         }
//         return maxe;
//     }
// }
//abovr is o(n^2)


//most optimal o(n) kadanes algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxe = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i=0;i<n;i++){
            sum = sum + nums[i];
            maxe = Math.max(maxe,sum);
            if(sum < 0){
                sum = 0;
            }

        }
        return maxe;
    }
}
