package collections;

import java.util.Iterator;

class ListNode {
 int val;
 ListNode next;
 ListNode() {}
 ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public Iterator<Integer> iterator() {
     return next.iterator();
    }
}

public class AddLL {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();

        Iterator<Integer> itr1 = l1.iterator();
        Iterator<Integer> itr2 = l2.iterator();

        while (itr1.hasNext())
        {
            int sum;
            sum = l1.val + l2.val;
        }
        
        return l3;
    }
    
    public static void main(String...args)
    {
        
    }
}

