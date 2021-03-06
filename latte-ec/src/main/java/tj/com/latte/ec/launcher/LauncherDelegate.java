package tj.com.latte.ec.launcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import java.text.MessageFormat;
import java.util.Timer;

import butterknife.BindView;
import butterknife.OnClick;
import tj.com.latte.delegate.LatteDelegate;
import tj.com.latte.ec.R;
import tj.com.latte.ec.R2;
import tj.com.latte.util.timer.BaseTimerTask;
import tj.com.latte.util.timer.ITimerListener;

/**
 * Created by Jun on 17/8/19.
 */

public class LauncherDelegate extends LatteDelegate implements ITimerListener {

    @BindView(R2.id.tv_launcher_timer)
    AppCompatTextView mTvTimer = null;

    private Timer mTimer = null;
    private int mCount = 5 ;

    @OnClick(R2.id.tv_launcher_timer)
    void onClickTimerView() {

    }

    private void initTimer() {
        mTimer = new Timer();
        final BaseTimerTask task = new BaseTimerTask(this);
        mTimer.schedule(task, 0, 1000);
    }

    @Override
    public Object setLayout() {
        return R.layout.delegate_launcher;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        initTimer();
    }

    @Override
    public void onTimer() {
        getProxyActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (mTvTimer != null) {
                    mTvTimer.setText(MessageFormat .format("跳过\n{0}s",mCount));
                    mCount--;
                    if (mCount<0) {
                        if (mTimer != null){
                            mTimer.cancel();
                            mTimer= null;
                        }
                    }
                }
            }
        });
    }
}
