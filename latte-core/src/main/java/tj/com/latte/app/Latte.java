package tj.com.latte.app;

import android.content.Context;

import java.util.HashMap;

/**
 * Created by Jun on 17/7/13.
 */

public final class Latte {
    public static Configurator init(Context context){
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();
    }
    public static HashMap<String,Object> getConfigurations(){
        return Configurator.getInstance().getLatteConfigs();
    }

    public static Context getAppliaction(){
        return (Context) getConfigurations().get( ConfigType.APPLICATION_CONTEXT.name());
    }
}
