public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Edge case: empty or single node
        if (head == null || head.next == null) {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {  // Cycle detected!
                // Step 2: Reset slow to head
                slow = head;
                
                // Step 3: Move both at same speed
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                
                // Step 4: Return the meeting point (cycle start)
                return slow;
            }
        }
        
        // No cycle found
        return null;
    }
}