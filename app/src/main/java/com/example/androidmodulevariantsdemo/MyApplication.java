package com.example.androidmodulevariantsdemo;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.lib_common.utils.base.BaseApplication;
import com.example.lib_common.utils.utils.Utils;

// 按照这种做法，app主module下的代码可以不动（项目进行中）,其他子模块可以单独划分出来承担自己的模块
public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        if (Utils.isAppDebug()) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }

}
