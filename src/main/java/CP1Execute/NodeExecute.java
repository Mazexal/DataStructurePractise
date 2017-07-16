package CP1Execute;

import CP1.DListNode;
import CP1.ListNode;

/**
 * Created by 10235 on 2017/7/16.
 */
public class NodeExecute {

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public DListNode reverse(DListNode head)
    {
        DListNode curr=null;
        while (head!=null){
            curr=head;
            head=curr.next;
            curr.next=curr.prev;
            curr.prev=head;
        }
        return curr;
    }
}
