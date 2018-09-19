package com.zkx.bbs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2017/12/18.
 */

public abstract class BaseActivity extends AppCompatActivity {


    protected void switchToActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }

    protected void setOnClickListener(View.OnClickListener onClickListener) {
    }
}
