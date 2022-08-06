package cn.anton.msb_newbie_20220806_1;

/**
 * - 位运算
 * @author itanton
 * @create_date 2022/8/6 上午8:28
 */
public class BitOperation {

    public static void println32Bit(int num){
        for (int i = 31; i >= 0; i--) {
            System.out.print( (num & (1 << i)) == 0 ? "0" : "1" );
        }
        System.out.println();
    }


    public static void main(String[] args) {
//        int num = 3;
//        println32Bit(num);

        /**
         * 任何一个数取反+1都等于相反数
         * 00000000000000000000000000000101   5
         * 11111111111111111111111111111011   -5
         * 00000000000000000000000000000101   5
         */
//        int a = 5;
//        int b = ~a + 1;
//        println32Bit(a);
//        println32Bit(b);
//        println32Bit(~b + 1);

        /**
         * 01111111111111111111111111111111
         * 10000000000000000000000000000000
         * 第32位为占位符, 1表示负, 0表示正
         */
//        int max = Integer.MAX_VALUE;
//        int min = Integer.MIN_VALUE;
//        println32Bit(max);
//        println32Bit(min);

        /**
         * 一个取反数的底层运算逻辑, 加减乘除在计算机中都会有一套逻辑
         * 在计算机底层中如果一个正数与一个负数相加，在底层都是用的一套逻辑。
         */
        int d = 8;
        //00000000000000000000000000001000
//        println32Bit(d);
        //11111111111111111111111111110111 + 1
        //11111111111111111111111111110110 ^
        //11111111111111111111111111111111
        //10000000000000000000000000001001 -5

        int e = 623846;
        int f = 126847;
        println32Bit(e);
        println32Bit(f);
        println32Bit(e | f); // 有1为1   或
        println32Bit(e ^ f); // 不同为1  异或
        println32Bit(e & f); // 全1为1   与
    }

}
