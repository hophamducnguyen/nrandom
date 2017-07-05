package nrandom;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by nguyenho on 7/5/2017.
 */
public class NRandomString {
    public static String getWithLength(int length) {
        return RandomStringUtils.random(length);
    }
}
