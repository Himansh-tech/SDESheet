// class Solution {
//     public void rotate(int[][] matrix) {
//         int row = matrix.length-1;
//         int col = matrix[0].length-1;

//         int ans[][] = new int[row+1][col+1];

//         int dig = 0;
//         for(int i=0;i<=row;i++){
//             int val = 0;
//             for(int j=0;j<=col;j++){
//                 ans[i][j] = matrix[row-val][dig];
//                 val++;
//             }
//             dig++;
//         }
//         for(int i=0;i<=row;i++){
//             for(int j=0;j<=col;j++){
//                 matrix[i][j] = ans[i][j];
//             }
//         }
//     }
// }
// //above method is not good cause it uses extra space which is matrix



class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<row;i++){
           
                int low = 0;
                int high = col-1;

                while(low<=high){
                    int temp = matrix[i][low];
                    matrix[i][low] = matrix[i][high];
                    matrix[i][high] = temp;
                    low++;
                    high--;
                }
         
        }
        
    }
}









