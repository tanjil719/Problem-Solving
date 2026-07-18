public class Pro138 {

    public Nnode copyRandomList(Nnode head) {

        if (head == null) {
            return null;
        }

        Nnode current = head;

        while (current != null) {
            Nnode newNode = new Nnode(current.val);
            newNode.next = current.next;
            current.next = newNode;
            current = current.next.next;
        }


        Nnode current2 = head;
        while (current2 != null) {
            if (current2.random != null) {
                current2.next.random = current2.random.next;
            }

            current2 = current2.next.next;
        }

        Nnode current3 = head;
        Nnode resultHead = head.next;
        Nnode newNode = resultHead;

        while (current3 != null) {
            current3.next = current3.next.next;
            if (newNode.next != null) {
                newNode.next = newNode.next.next;
            }
            current3 = current3.next;
            newNode = newNode.next;

        }

        return resultHead;

    }

}
