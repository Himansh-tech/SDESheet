//mistake i was making is that i was swapping once if found the break point it is not like that, we have to go with next greater element and not simply put the break point element there

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        boolean done = false;

        for (int i = n - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                // Find the next larger element in the right part
                int j = n - 1;

                //this is working because elments are already in lexiographically sorted in right part of break point, hence we have to just find greater elemenbt from our current ith element and that will automatically become our next greater element 
                while (nums[j] <= nums[i - 1]) {
                    j--;
                }

                // Swap the elements
                int temp = nums[j];
                nums[j] = nums[i - 1];
                nums[i - 1] = temp;

                // Sort the right part after swapping
                Arrays.sort(nums, i, n);
                done = true;
                break;
            }
        }

        if (!done) {
            // Handling lexicographically smallest permutation case
            Arrays.sort(nums);
        }
    }
}
