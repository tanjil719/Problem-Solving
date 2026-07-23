import java.util.HashMap;

public class Pro25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode current = head;
        int position = 0;

        while (current != null) {
            map.put(++position, current);
            current = current.next;
        }

        int n = (position / k);

        if (n == 0) {
            return head;
        }

        int stopPoint = 0;

        for (int i = 0; i < n; i++) {
            int firstIndex = stopPoint + 1;
            int lastIndex = stopPoint + k;

            stopPoint = lastIndex;

            while (firstIndex < lastIndex) {
                ListNode l = map.get(firstIndex);
                ListNode r = map.get(lastIndex);

                int tempVal = l.val;
                l.val = r.val;
                r.val = tempVal;

                firstIndex++;
                lastIndex--;
            }

        }

        return head;
    }
}
