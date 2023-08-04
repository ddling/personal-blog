package org.ddling.common;

import java.sql.Timestamp;
import java.util.Date;

public class Utils {

    public static Timestamp getCurrentTimeStamp() {
        return new Timestamp(new Date().getTime());
    }

}
