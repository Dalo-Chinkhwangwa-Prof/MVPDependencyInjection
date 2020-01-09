package com.illicitintelligence.dagger2app.util;

        import android.util.Log;

public class MainLogger {

    private static final String ERROR_TAG = "TAG_ERROR";
    private static final String LOG_TAG = "TAG_LOG";


    public static void logError(Throwable throwable) {
        Log.d(ERROR_TAG, throwable.getMessage());
    }

    public static void logDebug(String message) {
        Log.d(LOG_TAG, message);
    }
}
