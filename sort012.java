// class Solution {
//     public void sortColors(int[] nums) {
//         int z = 0;
//         int f = 0;
//         int s = 0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] == 0){
//                 z++;
//             }
//             else if(nums[i] == 1){
//                 f++;
//             }
//             else{
//                 s++;
//             }
//         }
//         int ind = 0;
//         while(z != 0){
//             nums[ind] = 0;
//             ind++;
//             z--;
//         }
//         while(f != 0){
//             nums[ind] = 1;
//             ind++;
//             f--;
//         }
//         while(s != 0){
//             nums[ind] = 2;
//             ind++;
//             s--;
//         }
//     }
// }

//above we have one approach


class Solution {
    public void sortColors(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
