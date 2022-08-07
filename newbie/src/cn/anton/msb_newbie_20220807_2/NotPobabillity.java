package cn.anton.msb_newbie_20220807_2;

/**
 * 给你一个01出现不等概率的函数x， 不允许修改它。将他的结果编程一个等概率的0|1；
 *
 * <p>思路</p>
 * 遍历x， 只需要两种结果01 10不是则重新获取，直到是我才退出。
 * @author itanton
 * @create_date 2022/8/7 下午12:14
 */
public class NotPobabillity {

    public static void main(String[] args) {
        int i = 0;
        int count = 10000;
        int c = 0;

        for (;i < count; i++) {
            c += x() == 0 ? 1 : 0;
        }
        System.out.println((double)c / (double) count);


        System.out.println("============");

        for (i=0, c=0;i < count; i++) {
            c += f() == 0 ? 1 : 0;
        }
        System.out.println((double)c / (double) count);

    }

    /**
     * 不等概率出现0|1
     * @return
     */
    public static int x(){
        return Math.random() < 0.8 ? 0 : 1;
    }

    public static int f(){
        int res;
        do {
            res = x();
        } while(res == x());
        return res;
    }

}
