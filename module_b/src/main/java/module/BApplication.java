package module;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.lib_common.utils.base.BaseApplication;
import com.example.lib_common.utils.utils.Utils;


public class BApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        if (Utils.isAppDebug()) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
        login();
    }

    private void login() {

    }
}
