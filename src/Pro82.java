public class Pro82 {
    public ListNode deleteDuplicates(ListNode head) {
        if( head == null){
            return head;
        }

        ListNode dummy = new ListNode(0, head);
        ListNode current = head;
        ListNode pointer = dummy;

        while (current != null && current.next != null){
            if (current.val != current.next.val){
                current = current.next;
                pointer = pointer.next;
            } else {
                while (current != null && current.next != null && current.val == current.next.val){
                    current = current.next;
                }

                pointer.next = current.next;
                current = current.next;
            }
        }

        return dummy.next;

    }


}
