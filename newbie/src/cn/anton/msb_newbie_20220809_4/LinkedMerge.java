package cn.anton.msb_newbie_20220809_4;

import cn.anton.factory.LinkedUtil;
import cn.anton.factory.Node;

/**
 * <p>两个有序链表合并</p>
 * A: 1,6,9,33
 * B: 5,7,79
 * 输出： 1，5，6，7，9，33，79
 *
 * @author itanton
 * @create_date 2022/8/9 21:57
 */
public class LinkedMerge {

    public static void main(String[] args) {
        Node A = LinkedUtil.byArray(new int[]{1});
        Node B = LinkedUtil.byArray(new int[]{});

        Node m = merge(A, B);
        LinkedUtil.printNode(m);
    }

    private static Node merge(Node a, Node b) {
        Node head = new Node(0);
        Node tmp = head;

        while (a != null && b != null) {
            boolean flag = a.val < b.val;
            if (flag) {
                tmp.next = new Node(a.val);
                a = a.next;
            } else {
                tmp.next = new Node(b.val);
                b = b.next;
            }
            tmp = tmp.next;
        }

        while (a != null){
            tmp.next = new Node(a.val);
            a = a.next;
            tmp = tmp.next;
        }

        while (b != null) {
            tmp.next = new Node(b.val);
            b = b.next;
            tmp = tmp.next;
        }

        return head.next;
    }

}
