package com.xyzlf.share.library.util;

import android.content.Context;
import android.support.annotation.IdRes;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Created by zhanglifeng
 */
public class ToastUtil {

    /**
     * 显示toast
     * @param context
     * @param resId
     * @param isShort
     */
    public static void showToast(Context context, @IdRes int resId, boolean isShort) {
        if (null == context) {
            return;
        }
        String msg = null;
        try {
            msg = context.getString(resId);
        } catch (Exception e) {
        }
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        showToast(context, msg, isShort);
    }

    /**
     * 显示toast
     * @param context
     * @param msg
     * @param isShort
     */
    public static void showToast(Context context, String msg, boolean isShort) {
        if (null == context) {
            return;
        }
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        Toast.makeText(context, msg, isShort ? Toast.LENGTH_SHORT : Toast.LENGTH_LONG).show();
    }
}
