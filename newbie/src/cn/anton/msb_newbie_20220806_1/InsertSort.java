package cn.anton.msb_newbie_20220806_1;

import cn.anton.factory.ArrayFactory;

import java.util.Arrays;

/**
 * 插入排序
 * 先保证 0~N 位置上有序
 * 7 8 1 3 5 保证前面两位有序
 * 7 1 8 3 5
 * 1 7 8 3 5 保证前面三位有序
 * 1 7 3 8 5
 * 1 3 7 8 5 保证前面四位有序
 * 1 3 7 5 8
 * 1 3 5 7 8 全部有序
 *
 * @author itanton
 * @create_date 2022/8/6 上午11:04
 */
public class InsertSort {

    public static void sortInsert(int[] arr) {
        if (arr == null || arr.length < 2) return;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j);
            }
        }
    }

    private static void swap(int[] arr, int j) {
        int tmp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = ArrayFactory.randomArray(30);
        sortInsert(arr);
        System.out.println(Arrays.toString(arr));
    }


}
