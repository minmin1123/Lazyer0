package com.gizwits.opensource.appkit.utils;

/**
 * Created by Thoma on 2017/10/21.
 */

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;


public class ActivityManager {


    public static List<Activity> activityList = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activityList.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activityList.remove(activity);
    }

    public static void finishaAll() {
        for (Activity activity : activityList) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }


}
