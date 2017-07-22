package tj.com.latte.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import tj.com.latte.app.Latte;

/**
 * Created by Jun on 17/7/22.
 */

public class DimenUtil {
    public static int getScreenWidth(){
        final Resources resources = Latte.getAppliaction().getResources();
        final DisplayMetrics dm =resources.getDisplayMetrics();
        return dm.widthPixels;
    }
    public static int getScreenHeight(){
        final Resources resources = Latte.getAppliaction().getResources();
        final DisplayMetrics dm =resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
