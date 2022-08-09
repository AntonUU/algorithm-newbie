package cn.anton.factory;

/**
 * <p>双链表工具</p>
 *
 * @author itanton
 * @create_date 2022/8/9 14:30
 */
public class DoubleLinkedUtil {

    public static DoubleNode byArray(int[] arr){
        if(arr == null || arr.length == 0) return null;
        DoubleNode doubleNode = new DoubleNode(arr[0]);
        DoubleNode tmp = doubleNode;
        for (int i = 1; i < arr.length; i++) {
            tmp.next = new DoubleNode(arr[i]);
            tmp.next.pre = tmp;
            tmp = tmp.next;
        }

        return doubleNode;
    }

    public static void print(DoubleNode root){
        if (root == null) return;
        while (root != null) {
            System.out.println(printVal(root, true) + " " + root.val + " " + printVal(root, false));
            root = root.next;
        }
    }

    private static Integer printVal(DoubleNode node, boolean flag){
        return flag
                ? node.pre != null ? node.pre.val : null
                : node.next != null ? node.next.val : null;
    }

}
