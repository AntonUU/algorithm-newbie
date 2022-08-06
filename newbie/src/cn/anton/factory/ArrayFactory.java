package cn.anton.factory;

import java.util.Arrays;
import java.util.Random;

/**
 * 对数器
 * @author itanton
 * @create_date 2022/8/6 上午9:45
 */
public class ArrayFactory {

    public static int[] randomArray(int len){

        Random r = new Random();
        int length = r.nextInt(len);
        int maxVal = r.nextInt(10000);

        int[] arr = new int[length];

        for (int i = 0; i < length; i++)
            arr[i] = r.nextInt(maxVal);

        System.out.println(Arrays.toString(arr));
        System.out.println("长度: " + arr.length);

        return arr;
    }

}
