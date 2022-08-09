package cn.anton.msb_newbie_20220809_4;

import cn.anton.factory.Node;

/**
 * <p>用单链表实现队列</p>
 *
 * @author itanton
 * @create_date 2022/8/9 15:28
 */
public class Queue {

    public static Node head;
    public static Node last;
    public static int size;

    public static void put(int num){
        Node node = new Node(num);
        if (head == null) {
            head = node;
            last = node;
        } else {
            last.next = node;
            last = last.next;
        }
        size++;
    }

    public static int pop(){
        if (head == null || size() == 0) {
            head = null;
            last = null;
            throw new NullPointerException("队列为空");
        }
        int num = head.val;
        head = head.next;
        size--;
        return num;
    }

    public static boolean isEmpty(){
        return size == 0;
    }

    public static int size(){
        return size;
    }

    public static void main(String[] args) {
        put(4);
        put(2);
        put(1);
        put(47);
        System.out.println(size());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
    }

}
