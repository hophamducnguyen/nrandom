package nrandom;

import nrandom.constant.DateTimeConst;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

/**
 * Created by nguyenho on 7/5/2017.
 */
public class NRandomKey {
    public static String randomWithDateTimeFormat(String formatString, String timeZone) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatString);
        if (StringUtils.isNotBlank(timeZone))
            dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
        return dateFormat.format(new Date());
    }

    public static String randomDateTimeKey() {
        return randomWithDateTimeFormat("yyyyMMddhhmmssSS", null);
    }

    public static String randomKeyWithDateTimeFormat(String formatString) {
        return randomWithDateTimeFormat(formatString, DateTimeConst.PACIFIC_TIME_ZONE);
    }

    public static String randomKeyWithESTDateTimeFormat(String formatString) {
        return randomWithDateTimeFormat(formatString, DateTimeConst.EST_TIME_ZONE);
    }

    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }
}
