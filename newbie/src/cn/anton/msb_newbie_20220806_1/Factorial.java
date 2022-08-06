package cn.anton.msb_newbie_20220806_1;

/**
 * - 阶乘
 * 给定一个参数N，返回1!+2!+3!.....N! 的结果
 * @author itanton
 * @create_date 2022/8/6 上午9:16
 */
public class Factorial {

    public static long process(int N){
        long ans = 0;
        long cur = 1;
        for (int i = 1; i <= N; i++) {
            ans += (cur = cur * i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 10;
        System.out.println(process(N));
    }

}
