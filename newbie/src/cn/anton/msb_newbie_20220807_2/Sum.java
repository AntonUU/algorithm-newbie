package cn.anton.msb_newbie_20220807_2;

/**
 * 给你一个数组，获取L-R上的累加和
 * 方案一：做一张表，记录每个LR相加的值， 获取时直接从表中获取这个坐标。
 * 方案二：做一个Help数组, 记录每一个位置的相加后。如果L等于0直接返回R位置， L不等0直接H[R]-H[L-1]
 * @author itanton
 * @create_date 2022/8/7 上午8:58
 */
public class Sum {

    private static int[] help;

    public static void init(int[] arr){
//        做一个Help数组, 记录每一个位置的相加后
        help = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            help[i] += i > 0 ? help[i-1] + arr[i] : arr[i];
        }
    }

    public static int sum(int L, int R) {
        if (help == null || help.length < R || R < L) return 0;
        return (L == 0 || L == R) ? help[R] : (help[R] - help[L - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        init(arr);
        int sum = sum(1 , 8);
        System.out.println("结果： " + sum);
    }

}
