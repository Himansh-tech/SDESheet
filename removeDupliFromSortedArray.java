// //i can write o(n^2) since arr length max is 10^4

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int n = nums.length;
//         if(n==1){
//             return 1;
//         }
//         int count = 0;
//         for(int i=0;i<n-1;i++){
            
//             for(int j=i+1;j<n;j++){
//                 if(nums[j] == nums[i]){
//                     nums[i] = 101;
//                 }
//             }
//         }
//         for(int i=0;i<n;i++){
//             if(nums[i] != 101){
//                 count++;
//             }
//         }
//         Arrays.sort(nums);
//         return count;

//     }
// }




//o(n) time and o(1) space

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;

        for(int j=1;j<n;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}





