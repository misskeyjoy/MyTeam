package com.dream.ui;

import com.bmob.BmobConfiguration;
import com.bmob.BmobPro;

import android.app.Application;
import android.content.Context;

public class CommunityApplication extends Application {
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		initConfig(getApplicationContext());
	}
	/**
	 * bmob 
	 * 初始化文件配置
	 * @param context
	 */
	public static void initConfig(Context context) {
		BmobConfiguration config = new BmobConfiguration.Builder(context).customExternalCacheDir("Smile").build();
		BmobPro.getInstance(context).initConfig(config);
	}
}
