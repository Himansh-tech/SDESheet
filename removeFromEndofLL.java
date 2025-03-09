
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
   
        int target = len - n;
        ListNode oneBefore = head;

        if(target == 0){
            head = head.next;

        }
        else{
            while(target > 1){
                oneBefore = oneBefore.next;
                target--;
            } 
            if(oneBefore.next.next == null){
                oneBefore.next = null;
            }
            else{
                oneBefore.next = oneBefore.next.next;
            }
        }
        return head;

    }
}

