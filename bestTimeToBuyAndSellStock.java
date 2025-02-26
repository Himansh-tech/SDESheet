// class Solution {
//     public int maxProfit(int[] prices) {
//         int len = prices.length;
//         int ans = 0;
//         for(int i=0;i<len-1;i++){
//             for(int j=i+1;j<len;j++){
//                 if(prices[i] <= prices[j]){
//                     ans = Math.max(ans,prices[j]-prices[i]);
//                 }
//             }
//         }
//         return ans;
//     }
// }
//o(n^2) TLE


//striver ka ajeeb and gareeb algo
class Solution {
    public int maxProfit(int[] prices) {
        int maxe = 0;
        int mini = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            mini = Math.min(mini,prices[i]);
            maxe = Math.max(maxe,prices[i]-mini);
        }
        return maxe;
    }
}










