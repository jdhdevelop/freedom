package com.joe.freedomlibrary.widget;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.widget.Toast;

public class JToast extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public JToast(Context context) {
        super(context);
    }




}
