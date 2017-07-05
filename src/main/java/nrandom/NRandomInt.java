package nrandom;

import java.util.Random;

/**
 * Created by nguyenho on 7/5/2017.
 */
public class NRandomInt {
    public static int getBetween(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static int getWithLength(int length) {
        Random random = new Random();
        int num = (int) (Math.pow(10, length) - 1);
        int min = (int) (Math.pow(10, length - 1) - 1);
        int result = random.nextInt(num);
        while (min > result) {
            result = random.nextInt(num);
        }
        return result;
    }
}
