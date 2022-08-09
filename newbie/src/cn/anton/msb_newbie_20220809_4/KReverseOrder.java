package cn.anton.msb_newbie_20220809_4;

import cn.anton.factory.ArrayFactory;
import cn.anton.factory.LinkedUtil;
import cn.anton.factory.Node;

/**
 * <p>K个节点内的组内逆序调整</p>
 *  示例：
 *      链表 1,2,3,4,5,6,7    k=3
 *      输出 3,2,1,6,5,4,7
 * @author itanton
 * @create_date 2022/8/9 17:21
 */
public class KReverseOrder {

    public static Node k(Node head, int k){
        if (head == null) return null;
        if (head.next == null) return head;
        // 计数器
        int t = 1;
        // 整体返回
        Node res = null;
        Node x = null;   // 左指针
        Node y = head;   // 右指针
        while (true) {
            // 当k为整除时结束
            if (y == null) break;
            x = y; // 右移
            // h的移动
            while (t <= k) {
                if (head == null) break;
                head = head.next;
                t++;
            }

            if (t <= k) {
                // 长度无法逆序
                if (res != null) {
                    Node tmp = res;
                    while (tmp.next != null)
                        tmp = tmp.next;
                    tmp.next = x;
                    return res;
                }
                return x;
            } else {
                // 开始反转
                y = head;
                Node reverseNode = reverseNode(x, head);

                if (res == null) {
                    res = reverseNode;
                } else {
                    // 指
                    Node tmp = res;
                    while (tmp.next != null)
                        tmp = tmp.next;
                    tmp.next = reverseNode;
                }
            }
            t = 1;
        }
        return res;
    }

    public static Node reverseNode(Node x, Node node){
        Node next = null;
        Node pre = null;
        while (x != node) {
            next = x.next;
            x.next = pre;
            pre = x;
            x = next;
        }
        return  pre;
    }

    public static void main(String[] args) {
//        Node head = LinkedUtil.byArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Node head = LinkedUtil.byArray(ArrayFactory.randomArray(5000));
        Node k = k(head, 5);
        LinkedUtil.printNode(k);
    }

}
