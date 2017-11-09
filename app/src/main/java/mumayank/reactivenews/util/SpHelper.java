package mumayank.reactivenews.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.Set;

/**
 * Created by Mayank on 09-11-2017.
 */

public class SpHelper {

    private static final boolean LOG = true;
    private static final String TAG = "SpHelper";

    private static SpHelper spHelper;

    private SpHelper() { }

    public static SpHelper getInstance(Context context) {
        if (spHelper == null) {
            spHelper = new SpHelper();
        }
        spHelper.sharedPreferences = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        return spHelper;
    }

    private SharedPreferences sharedPreferences;

    public <T> void put(String name, T val) {
        if (val instanceof Boolean) {
            sharedPreferences.edit().putBoolean(name, (boolean) (Object) val).apply();
        } else if (val instanceof Integer) {
            sharedPreferences.edit().putInt(name, (int) (Object) val).apply();
        } else if (val instanceof Long) {
            sharedPreferences.edit().putLong(name, (long) (Object) val).apply();
        } else if (val instanceof Float) {
            sharedPreferences.edit().putFloat(name, (float) (Object) val).apply();
        } if (val instanceof String) {
            sharedPreferences.edit().putString(name, (String) (Object) val).apply();
        } if (val instanceof Set) {
            sharedPreferences.edit().putStringSet(name, (Set) (Object) val).apply();
        } else {
            if (LOG) Log.e(TAG, "Type not recognized");
        }
    }

    public <T> T get(String name, T defaultVal) {
        if (defaultVal instanceof Boolean) {
            return (T) (Object) sharedPreferences.getBoolean(name, (boolean) defaultVal);
        } else if (defaultVal instanceof Integer) {
            return (T) (Object) sharedPreferences.getInt(name, (int) defaultVal);
        } else if (defaultVal instanceof Long) {
            return (T) (Object) sharedPreferences.getLong(name, (long) defaultVal);
        } else if (defaultVal instanceof Float) {
            return (T) (Object) sharedPreferences.getFloat(name, (float) defaultVal);
        } if (defaultVal instanceof String) {
            return (T) (Object) sharedPreferences.getString(name, (String) defaultVal);
        } if (defaultVal instanceof Set) {
            return (T) (Object) sharedPreferences.getStringSet(name, (Set) defaultVal);
        } else {
            if (LOG) Log.e(TAG, "Type not recognized");
        }

        return null;
    }

}
