package tj.com.store;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;

import tj.com.latte.activities.ProxyActivity;
import tj.com.latte.delegate.LatteDelegate;
import tj.com.latte.ec.sign.SignInDelegate;

public class MainActivity extends ProxyActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
    }

    @Override
    public LatteDelegate setRootDelegate() {
        return new SignInDelegate();
    }
}
