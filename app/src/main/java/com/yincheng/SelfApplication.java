package com.yincheng;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

public class SelfApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		Log.i("lyxLog","SelfApplication.onCreate()");
	}

	@Override
	public void attachBaseContext(Context base) {
		super.attachBaseContext(base);
	}

	@Override
	public void registerComponentCallbacks(ComponentCallbacks callback) {
		Application application = (Application) getBaseContext().getApplicationContext();
		application.registerComponentCallbacks(callback);
	}
	@Override
	public void unregisterComponentCallbacks(ComponentCallbacks callback) {
		Application application = (Application) getBaseContext().getApplicationContext();
		application.unregisterComponentCallbacks(callback);
	}
	@Override
	public void registerActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
		Application application = (Application) getBaseContext().getApplicationContext();
		application.registerActivityLifecycleCallbacks(callback);
	}
	@Override
	public void unregisterActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
		Application application = (Application) getBaseContext().getApplicationContext();
		application.unregisterActivityLifecycleCallbacks(callback);
	}

	@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
	@Override
	public void registerOnProvideAssistDataListener(OnProvideAssistDataListener callback) {
		Application application = (Application) getBaseContext().getApplicationContext();
		application.registerOnProvideAssistDataListener(callback);
	}

	@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
	@Override
	public void unregisterOnProvideAssistDataListener(OnProvideAssistDataListener callback) {
		Application application = (Application) getBaseContext().getApplicationContext();
		application.unregisterOnProvideAssistDataListener(callback);
	}
}
