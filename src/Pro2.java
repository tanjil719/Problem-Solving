
public class Pro2 {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode(0);
//        ListNode current = dummy;
//        int carry = 0;
//
//        while (l1 != null || l2 != null || carry != 0) {
//            int x = (l1 != null) ? l1.val : 0;
//            int y = (l2 != null) ? l2.val : 0;
//            int total = x + y + carry;
//
//            carry = total / 10;
//            int newValue = total % 10;
//
//            current.next = new ListNode(newValue);
//            current = current.next;
//
//            if (l1 != null) l1 = l1.next;
//            if (l2 != null) l2 = l2.next;
//        }
//
//        return dummy.next;
//    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return  this.add(l1, l2, 0);
    }

    private ListNode add(ListNode l1, ListNode l2, int carry) {

        if (l1 == null && l2 == null &&  carry == 0) {
            return null;
        }

        int sum = carry;
        if (l1 != null) {
            sum += l1.val;
        }

        if (l2 != null) {
            sum += l2.val;
        }

        ListNode resultNode = new ListNode(sum % 10);
        resultNode.next = add(l1 != null ? l1.next : null, l2 != null ? l2.next : null, sum / 10);

        return resultNode;
    }


}
