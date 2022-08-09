package cn.anton.msb_newbie_20220809_4;

import cn.anton.factory.LinkedUtil;
import cn.anton.factory.Node;

/**
 * <p>两个链表相加</p>
 * A链表： 3，4，6，1
 * B链表： 7，9，7
 * <p>
 * 1653+797
 * <p>
 * 返回结果 2440
 *
 * @author itanton
 * @create_date 2022/8/9 20:52
 */
public class LinkedAddUp {


    public static void main(String[] args) {
        Node A = LinkedUtil.byArray(new int[]{2,4,3});
        Node B = LinkedUtil.byArray(new int[]{5,6,4});

        Node node = addUp2(A, B);
        LinkedUtil.printNode(node);
    }

    public static Node addUp2(Node l1, Node l2){
        Node head = new Node(0);
        Node tmp = head;

        int into = 0;
        while (l1 != null || l2 != null || into > 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sum = l1Val + l2Val + into;
            into = sum / 10;

            tmp.next = new Node(sum % 10);
            tmp = tmp.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return head.next;
    }

    public static Node addUp(Node A, Node B) {

        // 找出长短数组
        int len1 = len(A);
        int len2 = len(B);

        Node l = len1 > len2 ? A : B; // 长
        Node s = l == A ? B : A;

        Node res = null;
        Node tmp = null;
        boolean flag = false;
        while (s != null) {
            // 获得上一步的进位
            if (res != null && flag) {
                tmp.next = new Node(1);
                flag = false;
            }

            // 求这一步的进位
            int val = s.val + l.val;
            if (val >= 10) {
                val = val % 10;
                flag = true;
            }

            //相加
            if (res == null) {
                res = new Node(val);
                tmp = res;
            } else {
                if (tmp.next != null) {
                    val = 1 + val;
                    if (val >= 10) {
                        val = val % 10;
                        flag = true;
                    }
                    tmp.next.val = val;
                } else {
                    tmp.next = new Node(val);
                }
                tmp = tmp.next;
            }

            s = s.next;
            l = l.next;
        }


        // 求长数
        while (l != null) {
            if (flag) {
                flag = false;
                int val = l.val + 1;
                if (val >= 10) {
                    val = val % 10;
                    flag = true;
                }
                tmp.next = new Node(val);
            } else {
                tmp.next = new Node(l.val);
            }

            tmp = tmp.next;
            l = l.next;
        }

        if (flag) {
            tmp.next = new Node(1);
        }

        // 反转
//        res = reverse(res);
        return res;
    }

    public static Node reverse(Node head) {
        if (head == null) return null;
        Node next = null;
        Node pre = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }

    public static int len(Node node) {
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
    }


}
