// i have not used recursion or dynamic programming here but i have simply solved using loops where next element is made from previous element of the list of list

class Solution {

    public static List<List<Integer>> dp(int num, List<List<Integer>> arrl, int curr) {
        //three inputs we are taking 
        //size of pascal triangle
        //List of List to store
        //and position from where we should start


        while (curr <= num) {
            List<Integer> arr = new ArrayList<>();

            arr.add(arrl.get(curr - 2).get(0));
        //first add first element from last list of list element of arrl as it will be same on first and last


            //now from second till last second add sum of 2 elements 
            for (int i = 0; i < arrl.get(curr - 2).size() - 1; i++) {
                arr.add(arrl.get(curr - 2).get(i) + arrl.get(curr - 2).get(i + 1));
            }

            arr.add(arrl.get(curr - 2).get(arrl.get(curr - 2).size() - 1));
        //first add first element from last list of list element of arrl as it will be same on first and last

            arrl.add(arr);
            curr++;
        }
        return arrl;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrl = new ArrayList<>();

        if (numRows >= 1) arrl.add(new ArrayList<>(Arrays.asList(1)));//if only one element 

        if (numRows >= 2) arrl.add(new ArrayList<>(Arrays.asList(1, 1)));// if only two element is there

        //if number of elements are greater than equals to 3
        if (numRows > 2) {
            int curr = 3;
            return dp(numRows, arrl, curr);
        }

        return arrl;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.generate(5));
    }
}
