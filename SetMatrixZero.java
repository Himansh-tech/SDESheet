// //ye mera intial approach hai jiski time complexity hai o(m*n)*o(m+n)+o(m*n)

// //ye assume karta hai ki negative test cases hai hi nahi kyuki ham code me -1 use kar rahe hai that 
// //ye code negative test case pe kaam nahi karenga and hamra last 2 case negative number se hi bhare hue hai

// //so we need efficient and working code for negative numbers as well

// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;

//         for(int i = 0; i < m; i++) {
//             for(int j = 0; j < n; j++) {
                
//                 if(matrix[i][j] == 0) {
//                     for(int x = i; x >= 0; x--) {
//                             if(matrix[x][j] != 0) {
//                                 matrix[x][j] = -1;
//                             }
//                     }
//                     for(int a = i; a < m; a++) {
//                             if(matrix[a][j] != 0) {
//                                 matrix[a][j] = -1;
//                             }
//                     }

//                     for(int x = j; x >= 0; x--) {
//                             if(matrix[i][x] != 0) {
//                                 matrix[i][x] = -1;
//                             }      
//                     }
//                     for(int a = j; a < n; a++) {
//                             if(matrix[i][a] != 0) {
//                                 matrix[i][a] = -1;
//                             }    
//                     }

//                 }
//             }
//         }
//         for(int i = 0; i < m; i++) {
//             for(int j = 0; j < n; j++) {
//                 if(matrix[i][j] == -1) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }
// }




//Approach 2:
//space complexity o(2n) 

//we are making two seprate arrays indication rows and columns now traver the matrix and if any element is 0 fill correspong row and col array as some number lets say 1

//now traverse again this time keep in mind to change elements of matrix as 0 if row[i]=1 or col[j]=1
//representing that that row or column contained a 0 elment with value


// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;

//         int row[] = new int[m];
//         int col[] = new int[n];

//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(matrix[i][j] == 0){
//                     row[i] = 1;
//                     col[j] = 1;
//                 }
//             }
//         }

//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(row[i] == 1 || col[j] == 1){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }

//     }
// }



//Most Optimal Approach

//in above approach time complexity is optimal as it is jsut traversal we just have to optimize the space complexity.
//so instead of using extra space lets use first row and column of the matrix to store the values

//and an extra variable for either row or column as matrix[0][0] will be repeated

class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        int col0 = -1;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){

                    matrix[i][0] = 0;

                    if(j != 0){
                        matrix[0][j] = 0;
                    }
                    else{
                        col0 = 0;
                    }
                    
                }
            }

            
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){

                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int i=0;i<n;i++){
                matrix[0][i] = 0;
            }
        }
        if(col0 == 0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }



    }
}
