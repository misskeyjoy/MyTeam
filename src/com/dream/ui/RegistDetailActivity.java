package com.dream.ui;

import com.dream.ui.utils.FontUtils;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class RegistDetailActivity extends BaseActivity implements
		OnClickListener {
	private ViewGroup root;
	private TextView tv_back;
	private Button btn_back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.as_regist_detail);
		root = (ViewGroup) findViewById(R.id.login_root);
		/**
		 * 全局的使用了字体
		 */
		FontUtils
				.applyFont(RegistDetailActivity.this, root, "fonts/custom.TTF");
		tv_back = (TextView) findViewById(R.id.header_tv);
		tv_back.setText("注册账号");
		btn_back = (Button) findViewById(R.id.headr_back);
		btn_back.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.headr_back:
			finish();
			break;
	
		}

	}

}
