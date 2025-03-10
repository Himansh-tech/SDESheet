// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// // class Solution {
// //     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
// //         ListNode ans = new ListNode();
// //         StringBuilder sb1 = new StringBuilder();

// //         ListNode templ1 = l1;
// //         while(templ1 != null){
// //             sb1.append(templ1.val);
// //             templ1 = templ1.next;
// //         }


// //         StringBuilder sb2 = new StringBuilder();
// //         ListNode templ2 = l2;
// //         while(templ2 != null){
// //             sb2.append(templ2.val);
// //             templ2 = templ2.next;
// //         }
        
// //         String num1 = sb1.reverse().toString();
// //         String num2 = sb2.reverse().toString();


// //         int count = num1.length() + num2.length();

// //         int intNum1 = Integer.parseInt(num1);
// //         int intNum2 = Integer.parseInt(num2);

// //         int tempans = intNum1 + intNum2;

        
// //         while(count != 0){
// //             int last = tempans % 10;
// //             ans = new ListNode(last);
// //             ans = ans.next;
// //             tempans = tempans / 10;
// //             count--;

// //         }
// //         return ans;
// //     }
// // }


// import java.math.BigInteger;

// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
//         // StringBuilder to store numbers in reverse order
//         StringBuilder sb1 = new StringBuilder();
//         StringBuilder sb2 = new StringBuilder();

//         // Traverse l1 and l2 to extract numbers
//         while (l1 != null) {
//             sb1.append(l1.val);
//             l1 = l1.next;
//         }
//         while (l2 != null) {
//             sb2.append(l2.val);
//             l2 = l2.next;
//         }

//         // Reverse and convert to BigInteger
//         BigInteger num1 = new BigInteger(sb1.reverse().toString());
//         BigInteger num2 = new BigInteger(sb2.reverse().toString());

//         // Add the numbers
//         BigInteger tempans = num1.add(num2);

//         // Dummy node to construct linked list
//         ListNode dummy = new ListNode(0);
//         ListNode current = dummy;

//         // If sum is 0, return a single node with 0
//         if (tempans.equals(BigInteger.ZERO)) {
//             return new ListNode(0);
//         }

//         // Construct linked list from sum
//         while (tempans.compareTo(BigInteger.ZERO) > 0) {
//             int last = tempans.mod(BigInteger.TEN).intValue();
//             current.next = new ListNode(last);
//             current = current.next;
//             tempans = tempans.divide(BigInteger.TEN);
//         }

//         return dummy.next;
//     }
// }

//above is first approach o(m+n)



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
*/

//bhai directly add karte jana hai and carry maintain karni hai
//and ek new linked list me values falte jana hai bas 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode();
            ListNode temp = dummy;

            int carry = 0;

            while(l1 != null || l2 != null || carry ==1){
                int sum = 0;
                if(l1 != null){
                    sum = sum + l1.val;
                    l1 = l1.next;
                }
                if(l2 != null){
                    sum = sum + l2.val;
                    l2 = l2.next;
                }
                sum = sum + carry;
                carry = sum / 10;

                ListNode node = new ListNode(sum % 10);
                temp.next = node;
                temp = temp.next;
                

            }
            return dummy.next;
    }

}
