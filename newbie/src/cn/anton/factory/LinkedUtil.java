package cn.anton.factory;

/**
 * <p>链表工具</p>
 *
 * @author itanton
 * @create_date 2022/8/9 下午12:30
 */
public class LinkedUtil {

    /**
     * 通过数组生成链表
     */
    public static Node byArray(int[] arr){
        if (arr == null || arr.length == 0) return null;
        Node root = new Node(arr[0]);
        Node tmp = root;
        for (int i = 1; i < arr.length; i++) {
            tmp.next = new Node(arr[i]);
            tmp = tmp.next;
        }
        return root;
    }

    /**
     * 链表打印
     */
    public static void printNode(Node root){
        if (root == null) return;
        System.out.print(root.val + " ");
        if (root.next != null)
            printNode(root.next);
    }


}
