package com.lqr;

import android.app.Application;
import android.util.Log;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

public class SelfApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		Log.i("lyxLog","SelfApplication.onCreate()");
	}
}
