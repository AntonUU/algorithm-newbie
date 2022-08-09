package cn.anton.msb_newbie_20220809_4;

import cn.anton.factory.LinkedUtil;
import cn.anton.factory.Node;

/**
 * 链表反转
 *
 * @author itanton
 * @create_date 2022/8/9 下午12:27
 */
public class LinkedReverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Node node = LinkedUtil.byArray(arr);
        LinkedUtil.printNode(node);
        System.out.println();
        Node reverse = reverse(node);
        LinkedUtil.printNode(reverse);
    }

    public static Node reverse(Node root){
        if (root == null) return null;
        Node pre = null;
        Node next = null;
        while (root != null) {
            next = root.next; // 1、记录下一个指针   1
            root.next = pre;  // 2、下个指针指向前   1<-2
            pre = root;       // 3、头等于  2->1
            root = next;      // 4、拿回指针
        }
        return pre;
    }


}
