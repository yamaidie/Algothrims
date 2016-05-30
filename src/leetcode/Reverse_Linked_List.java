package leetcode;

/**
 * Created by Administrator on 2016/5/27 0027.
 */
public class Reverse_Linked_List
{
    public ListNode reverseList(ListNode head) {
        //头插法：将所有的节点依次插入头节点的前面
        ListNode curr = null;
        ListNode temp = head;
        ListNode pre = null;
        while(temp!=null){
            pre=curr;
            curr=temp;
            temp=curr.next;
            curr.next=pre;
        }
        return curr;
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
