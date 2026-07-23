import java.util.HashMap;
import java.util.Map;

public class Pro92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right)
            return head;

        Map<Integer, ListNode> map = new HashMap<>();

        ListNode current = head;
        int position = 1;

        while (current != null) {
            map.put(position++, current);
            current = current.next;
        }

        while (left < right) {
            ListNode l = map.get(left);
            ListNode r = map.get(right);

            int temp = l.val;
            l.val = r.val;
            r.val = temp;

            left++;
            right--;
        }

        return head;
    }

}
