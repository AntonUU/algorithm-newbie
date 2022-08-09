package cn.anton.msb_newbie_20220809_4;

import cn.anton.factory.Node;

/**
 * <p>单链表实现栈</p>
 *
 * @author itanton
 * @create_date 2022/8/9 15:44
 */
public class Stack {

    public static int val;
    public static Node head;

    public static void put(int num){
        Node node = new Node(num);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public static int pop() {
        if (head == null) throw new NullPointerException("栈为空");
        int num = head.val;
        head = head.next;
        return num;
    }

    public static void main(String[] args) {
        put(1);
        put(11);
        put(111);
        put(1111);

        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
    }

}
