import CP1.*;

import java.util.Random;

/**
 * Created by 10235 on 2017/7/14.
 */
public class ExecuteProgram {
    public static void main(String[] args) {
        System.out.println("Begin");
        Random random = new Random(47);

    }

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

    public  DListNode reverse(DListNode head)
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
