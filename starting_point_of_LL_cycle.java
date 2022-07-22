public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        
        ListNode tortoise = head;
        ListNode hare = head;
        
        do {
            if (tortoise == null || hare == null || hare.next == null)
                return null;
            tortoise = tortoise.next;
            hare = hare.next.next;
        } while (tortoise != hare);
        
        tortoise = head;
        while (tortoise != hare) {
            tortoise = tortoise.next;
            hare = hare.next;
        }
        
        return tortoise;
        
    }
}
