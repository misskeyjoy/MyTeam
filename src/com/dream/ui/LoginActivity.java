package com.dream.ui;

import com.dream.ui.utils.FontUtils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

public class LoginActivity extends BaseActivity implements OnClickListener {
	private ViewGroup root;
	private Button btn_regist;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.as_login);
		root = (ViewGroup) findViewById(R.id.login_root);
		/**
		 * 全局的使用了字体
		 */
		FontUtils.applyFont(LoginActivity.this, root, "fonts/custom.TTF");
		btn_regist = (Button) findViewById(R.id.login_sign_up_btn);
		btn_regist.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent;
		switch (v.getId()) {
		case R.id.login_sign_up_btn:
			intent = new Intent(LoginActivity.this, RegistDetailActivity.class);
			startActivity(intent);

			break;

		default:
			break;
		}

	}

}
