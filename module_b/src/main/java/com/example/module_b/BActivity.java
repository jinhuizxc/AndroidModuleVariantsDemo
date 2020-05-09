package com.example.module_b;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.lib_common.utils.base.BaseActivity;


@Route(path = "/b/main")
public class BActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_b);
    }


}
