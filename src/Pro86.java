public class Pro86 {
    public ListNode partition(ListNode head, int x) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode lessHead = new ListNode(0);
        ListNode lessCurrent = lessHead;
        ListNode greaterHead = new ListNode(0);
        ListNode greaterCurrent = greaterHead;
        ListNode current = head;

        while (current != null){
            if (current.val < x) {
                lessCurrent.next = new ListNode(current.val);
                lessCurrent = lessCurrent.next;
            } else {
                greaterCurrent.next = new ListNode(current.val);
                greaterCurrent = greaterCurrent.next;
            }
            current = current.next;
        }

        lessCurrent.next = greaterHead.next;
        return lessHead.next;

    }
}
