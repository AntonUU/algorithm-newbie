package cn.anton.msb_newbie_20220806_1;

import cn.anton.factory.ArrayFactory;

import java.util.Arrays;

/**
 * 冒泡排序
 * 谁大谁往后, 每一次交换都是相邻的
 * 7 3 4 1
 * 3 7 4 1
 * 3 4 7 1
 * 3 4 1 7
 * 3 4 1
 * 3 1 4
 * 1 3
 * @author itanton
 * @create_date 2022/8/6 上午10:49
 */
public class BubbleSort {

    public static void sortBubble(int[] arr){
        if (arr == null || arr.length < 2) return;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++)
                swap(arr, i, j-1);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        if (arr[i] < arr[j]) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = ArrayFactory.randomArray(30);
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }

}
