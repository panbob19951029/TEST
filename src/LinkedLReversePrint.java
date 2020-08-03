import java.util.ArrayList;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/3 15:30
 */
public class LinkedLReversePrint {

        ArrayList<Integer> tmp = new ArrayList<Integer>();
        public int[] reversePrint(ListNode head) {
            recur(head);
            int[] res = new int[tmp.size()];
            for(int i = 0; i < res.length; i++)
                res[i] = tmp.get(i);
            return res;
        }
        void recur(ListNode head) {
            if(head == null) return;
            recur(head.next);
            tmp.add(head.val);
        }
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

}
