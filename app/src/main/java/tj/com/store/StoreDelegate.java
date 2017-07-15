package tj.com.store;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import tj.com.latte.delegate.LatteDelegate;

/**
 * Created by Jun on 17/7/15.
 */

public class StoreDelegate extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_store;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
