package cn.anton.msb_newbie_20220806_1;

import cn.anton.factory.ArrayFactory;

import java.util.Arrays;

/**
 * 选择排序
 * 每一次都找到最小值到到前面
 * 4 2 1 5
 * 1 2 4 5
 * 1 2 4 5
 * 1 2 4 5
 *
 * @author itanton
 * @create_date 2022/8/6 上午9:31
 */
public class SelectSort {

    /**
     * 实现方式一
     * @param arr
     */
    public static void sortSelect1(int[] arr) {
        if (arr == null || arr.length < 2) return;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
    }

    /**
     * 实现方式二， 优化
     * @param arr
     */
    public static void sortSelect2(int[] arr) {
        if (arr == null || arr.length < 2) return;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
                minIndex = arr[minIndex] > arr[j] ? j : minIndex;
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }


    public static void main(String[] args) {

        int[] arr = ArrayFactory.randomArray(100);
        sortSelect2(arr);
        System.out.println(Arrays.toString(arr));

    }

}
