package tj.com.store;

import tj.com.latte.activities.ProxyActivity;
import tj.com.latte.delegate.LatteDelegate;
import tj.com.latte.ec.launcher.LauncherBannerDelegate;

public class MainActivity extends ProxyActivity {


    @Override
    public LatteDelegate setRootDelegate() {
        return new LauncherBannerDelegate();
    }
}
