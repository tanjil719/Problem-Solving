import java.util.HashMap;

public class Pro19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

//        if (head == null || n <= 0) {
//            return head;
//        }
//
//        HashMap<Integer, ListNode> map = new HashMap<>();
//        ListNode current = head;
//        int position = 0;
//
//        while (current != null) {
//            map.put(++position, current);
//            current = current.next;
//        }
//
//        int fromLastPosition = position - n + 1;
//
//        ListNode firstNode = null;
//        ListNode lastNode = null;
//        ListNode deleteNode = map.get(fromLastPosition);
//
//        if (fromLastPosition > 1) {
//            firstNode = map.get(fromLastPosition - 1);
//        }else {
//            return deleteNode.next;
//        }
//
//        if(deleteNode.next != null) {
//            lastNode = map.get(fromLastPosition+ 1);
//        }else {
//            firstNode.next = null;
//            return head;
//        }
//
//        firstNode.next = lastNode;
//
//        return head;

        // Two pointer approach


        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;

    }

}
