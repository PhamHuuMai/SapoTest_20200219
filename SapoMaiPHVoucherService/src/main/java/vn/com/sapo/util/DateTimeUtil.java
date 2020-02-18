package vn.com.sapo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mai-PC
 */
public class DateTimeUtil {

    public static String formatyyyyMMddHHmm(Date date) {
        String pattern = "yyyyMMddHHmm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
}
