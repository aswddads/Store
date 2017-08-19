package tj.com.store;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;

import tj.com.latte.app.Latte;
import tj.com.latte.ec.icon.FontEcModule;
import tj.com.latte.net.interceptors.DebugInterceptor;

/**
 * Created by Jun on 17/7/13.
 */

public class StoreApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withLoaderDelayed(1000)
                .withApiHost("http://127.0.0.1/")
                .withIntercaptor(new DebugInterceptor("index",R.raw.test))
                .configure();
    }
}
