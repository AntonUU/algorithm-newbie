package cn.anton.msb_newbie_20220807_2;

import java.util.Arrays;

/**
 * Random随机数是等概率的
 * 题： 给你一个方法f1它的结果是0~5的等概率随机
 * 要求不能修改这个函数，将它编程0~7的随机
 * <p>此方法通用，先把随机部分变为2进制0|1, 再取几个进制位到达N, 超过重做，不够加N<p/>
 * 思路：将0~5分成两块区域  0|1 如果随机成12为0，45为1，3重新随机。这样01的出现也是等概率的。
 * 7的生成为三个二进制位 111， 每个位置调用一遍即可
 *
 * @author itanton
 * @create_date 2022/8/7 上午11:21
 */
public class RandomPobability {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int i;
        int c;
        int count = 1000000;
        for (i = 0; i < count; i++) {
            arr[f1() - 1]++;
        }
        // [1997, 2038, 1965, 2014, 1986]
        System.out.println(Arrays.toString(arr));
        System.out.println("==================");

        i=0;
        c=0;
        while (i < count) {
            i++;
            if (f2() == 0) c++;
        }
        // 0.500435   等概率
        System.out.println((double) c / (double) count);
        System.out.println("==================");

        arr = new int[7];
        i=0;
        c = 0;
        while (i++ < count) {
            int tmp = f3();
            c += tmp == 3 ? 1 : 0;
            arr[tmp-1]++;
        }
        // 0.143131 等概率
        System.out.println((double)c / (double)count);
        // 0.14285714285714285
        System.out.println((double)1 / (double)7);
        // [143019, 142818, 143340, 142826, 142623, 142642, 142732]
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 等0~5的等概率随机数
     * @return 0~5等概率随机数
     */
    public static int f1() {
        return (int) (Math.random() * 5 + 1);
    }

    /**
     * 0|1等概率随机数
     * @return
     */
    public static int f2() {
        int ans;
        while ((ans = f1()) == 3) ;
        return ans <= 2 ? 0 : 1;
    }

    /**
     * 1~7等概率随机数
     * @return
     */
    public static int f3() {
        int res;
        do {
            res = (f2() << 2) + (f2() << 1) + f2();
        } while (res == 0);
        return res;
    }


}
