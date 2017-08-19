package tj.com.latte.app;

import android.content.Context;

import java.util.HashMap;

/**
 * Created by Jun on 17/7/13.
 */

public final class Latte {
    public static Configurator init(Context context){
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT,context.getApplicationContext());
        return Configurator.getInstance();
    }
    public static HashMap<Object,Object> getConfigurations(){
        return Configurator.getInstance().getLatteConfigs();
    }
    public static Configurator getConfigurator() {
        return Configurator.getInstance();
    }

    public static <T> T getConfiguration(Object key) {
        return getConfigurator().getConfiguration(key);
    }
    public static Context getAppliaction(){
        return (Context) getConfigurations().get( ConfigType.APPLICATION_CONTEXT.name());
    }
}
