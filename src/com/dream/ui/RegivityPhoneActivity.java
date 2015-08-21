package com.dream.ui;

import cn.bmob.v3.BmobSMS;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.RequestSMSCodeListener;

import com.dream.ui.utils.FontUtils;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegivityPhoneActivity extends BaseActivity implements
		OnClickListener {
	private TextView tv_back;
	private Button btn_back;
	private ViewGroup root;
	private Button btn_send;
	private EditText et_phone;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.as_registphone);
		root = (ViewGroup) findViewById(R.id.login_root);
		/**
		 * 全局的使用了字体
		 */
		FontUtils.applyFont(RegivityPhoneActivity.this, root,
				"fonts/custom.TTF");
		tv_back = (TextView) findViewById(R.id.header_tv);
		tv_back.setText("注册账号");
		btn_back = (Button) findViewById(R.id.headr_back);
		btn_send = (Button) findViewById(R.id.reigit_send);
		et_phone = (EditText) findViewById(R.id.regist_et_code);
		btn_back.setOnClickListener(this);
		btn_send.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.headr_back:
			finish();
			break;
		case R.id.reigit_send:
			reigist(et_phone.getText().toString());
			break;
		}

	}

	/**
	 * 给手机发送验证码
	 * 
	 * @param phone
	 * @return
	 */
	public boolean reigist(String phone) {
		BmobSMS.requestSMSCode(RegivityPhoneActivity.this, phone, "1",new RequestSMSCodeListener() {
			
			@Override
			public void done(Integer arg0, BmobException ex) {
			  if(ex==null){
				  Log.e(getPackageName(), "短信id"+arg0.toString());
			  }
			  Log.e(getPackageName(), "短信6"+arg0.toString());
			}
		});
			return false;
	}
}
