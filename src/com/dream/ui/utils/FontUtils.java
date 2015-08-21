package com.dream.ui.utils;

import android.R.string;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FontUtils {
	private static String TAG = "fontutils";

	/**
	 * 自定义字体控件
	 * 
	 * @param context
	 * @param root
	 * @param fontName
	 */
	public static void applyFont(final Context context, final View root,
			final String fontName) {
		try {
			if (root instanceof ViewGroup) {
				ViewGroup viewGroup = (ViewGroup) root;
				for (int i = 0; i < viewGroup.getChildCount(); i++)
					applyFont(context, viewGroup.getChildAt(i), fontName);
			}
			if (root instanceof TextView)
				((TextView) root).setTypeface(Typeface.createFromAsset(
						context.getAssets(), fontName));
			if(root instanceof Button){
				 ((Button)(root)).setTypeface(Typeface.createFromAsset(
							context.getAssets(), fontName));
			}
		} catch (Exception e) {
			Log.e(TAG, String.format(
					"Error occured when trying to apply %s font for %s view",
					fontName, root));
			e.printStackTrace();
		}
	}
}
