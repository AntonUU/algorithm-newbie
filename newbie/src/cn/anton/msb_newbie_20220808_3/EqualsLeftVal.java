package cn.anton.msb_newbie_20220808_3;

/**
 * O(logN)
 * 有序数组中找到=num最左的位置
 * 题意： 找3最左
 * 123334578
 * 012345678
 * 输出： 3
 * 找6
 * 输出： 7
 *
 * @author itanton
 * @create_date 2022/8/8 上午11:19
 */
public class EqualsLeftVal {

    public static int mostLeftVal(int[] arr, int num) {
        if (arr == null || arr.length == 0) return -1;
        int t = -1;
        int L = 0;
        int R = arr.length - 1;

        while (L <= R) {
            // 取出mid
            int mid = (L + R) >>> 1;
            if (arr[mid] >= num) {
                t = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        return t;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 3, 4, 5, 6, 8, 9};
        int index = mostLeftVal(arr, 10);
        System.out.println(index);
    }

}
