package cn.anton.msb_newbie_20220808_3;

/**
 * O(logN)
 * 在有序数组中找到<=num最右的位置
 * 012345678
 * 找6
 * 输出5
 * @author itanton
 * @create_date 2022/8/8 上午11:39
 */
public class EqualsRightVal {

    public static int minRightNum(int[] arr, int num){
        if (arr == null || arr.length == 0) return -1;

        int t = -1;
        int L = 0;
        int R = arr.length - 1;

        while (L <= R) {
            int mid = (L + R) >> 1;
            if (arr[mid] <= num) {
                t = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        return t;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 3, 4, 5, 6, 8, 9};
        int index = minRightNum(arr, 2);
        System.out.println("索引：" + index + ", Val: " + arr[index]);
    }

}
