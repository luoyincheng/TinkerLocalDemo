package com.yincheng;

import android.app.Application;
import android.util.Log;

public class SelfApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		Log.i("lyxLog","SelfApplication.onCreate()");
	}
}
