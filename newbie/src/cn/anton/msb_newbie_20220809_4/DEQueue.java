package cn.anton.msb_newbie_20220809_4;

import cn.anton.factory.DoubleNode;

/**
 * <p>双端队列</p>
 *  头部加
 *  头部出
 *  尾部加
 *  尾部出
 * @author itanton
 * @create_date 2022/8/9 15:49
 */
public class DEQueue {

    public static DoubleNode head;
    public static DoubleNode last;
    public static int size = 1;

    public static boolean isEmpty(){
        return size == 0;
    }

    public static int size(){
        return size;
    }

    // 头部加
    public static void putHead(int num){
        DoubleNode node = new DoubleNode(num);
        if (head == null || size() == 0) {
            head = node;
            last = node;
        } else {
            node.next = head;
            head.pre = node;
            head = head.pre;
        }
        size++;
    }

    // 头部出
    public static int popHead(){
        int num = head.val;
        if (head == last) {
            head = null;
            last = null;
        } else {
            head.pre = head;
            head = head.next;
        }
        size--;
        return num;
    }

    // 尾部加
    public static void putLast(int num){
        DoubleNode node = new DoubleNode(num);
        if (last == null || size() == 0) {
            head = node;
            last = node;
        } else {
            last.next = node;
            node.pre = last;
            last = node;
        }
        size++;
    }

    // 尾部出
    public static int popLast(){
        int num = last.val;
        if (last == head) {
            last = null;
            head = null;
        } else {
            last = last.pre;
            last.next = null;
        }
        size--;
        return num;
    }

    public static void main(String[] args) {
        putLast(1);
        putLast(2);
        putLast(3);
        putLast(4);

//        System.out.println(popHead());
//        System.out.println(popHead());
//        System.out.println(popHead());
//        System.out.println(popHead());
//        System.out.println(popHead());
        System.out.println(popLast());
        System.out.println(popLast());
        System.out.println(popLast());
        System.out.println(popLast());
        System.out.println(popLast());
    }

}
