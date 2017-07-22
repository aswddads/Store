package tj.com.latte.ui;

import android.content.Context;

import com.wang.avi.AVLoadingIndicatorView;
import com.wang.avi.Indicator;

import java.util.WeakHashMap;

/**
 * Created by Jun on 17/7/22.
 */

public final class LoderCreator {
    private static final WeakHashMap<String,Indicator> LODING_MAP = new WeakHashMap<>();
    static AVLoadingIndicatorView create(String type , Context context){

        final AVLoadingIndicatorView avLoadingIndicatorView = new AVLoadingIndicatorView(context);
        if (LODING_MAP.get(type)==null){
            final Indicator indicator= getIndicator(type);
            LODING_MAP.put(type,indicator);
        }
        avLoadingIndicatorView.setIndicator(LODING_MAP.get(type));
        return avLoadingIndicatorView;
    }

    private static Indicator getIndicator(String name){
        if (name == null ||name.isEmpty()){
            return null;
        }
        final StringBuilder drawableClassName = new StringBuilder();
        if (!name.contains(".")){
            final String defaultPackageName = AVLoadingIndicatorView.class.getPackage().getName();
            drawableClassName.append(defaultPackageName)
            .append(".indicators")
            .append(".");
        }
        drawableClassName.append(name);
        try {
            final Class<?> drawableClass = Class.forName(drawableClassName.toString());
            return (Indicator) drawableClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
