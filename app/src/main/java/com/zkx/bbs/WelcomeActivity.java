package com.zkx.bbs;

import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        setTitle(R.string.welcome);
        setOnClickListener(this);
    }

    @Override
    protected void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        findViewById(R.id.btn_login).setOnClickListener(onClickListener);
        findViewById(R.id.btn_register).setOnClickListener(onClickListener);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_register:
                switchToActivity(RegisterActivity.class);
                break;
            case R.id.btn_login:
                switchToActivity(LoginActivity.class);
                break;
        }
    }
}
