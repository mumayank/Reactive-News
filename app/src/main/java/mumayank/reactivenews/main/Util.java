package mumayank.reactivenews.main;

import android.content.Context;

import mumayank.reactivenews.util.Constants;
import mumayank.reactivenews.util.SpHelper;

/**
 * Created by Mayank on 09-11-2017.
 */

public class Util {

    public static boolean isCacheValid(Context context) {
        long lastDataStoredInDbTime = SpHelper.getInstance(context).get(Constants.LAST_DATA_STORED_IN_DB_TIME, 0L);
        long currentTime = System.currentTimeMillis();
        long cacheValidTime = currentTime + Constants.CACHE_VALID_DURATION;
        return (lastDataStoredInDbTime < cacheValidTime);
    }

}
