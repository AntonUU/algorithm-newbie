package cn.anton.msb_newbie_20220809_4;

import cn.anton.factory.DoubleLinkedUtil;
import cn.anton.factory.DoubleNode;

/**
 * <p>双链表反转</p>
 *
 * @author itanton
 * @create_date 2022/8/9 14:29
 */
public class DoubleLinkedReverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        DoubleNode doubleNode = DoubleLinkedUtil.byArray(arr);
        DoubleNode reverse = reverse(doubleNode);
        DoubleLinkedUtil.print(reverse);
    }

    public static DoubleNode reverse(DoubleNode root){
        if (root == null) return null;
        DoubleNode pre = null;
        DoubleNode next = null;

        while (root != null) {
            next = root.next; // 1、记录指针
            root.next = pre;  // 2、root下一个指针指向前
            root.pre = next;  // 3、root上一下指针指向next
            pre = root;       // 4、pre来到root
            root = next;      // 5、root来到next
        }

        return pre;
    }

}
