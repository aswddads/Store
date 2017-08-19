package tj.com.latte.ec.launcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;

import java.util.ArrayList;

import tj.com.latte.delegate.LatteDelegate;
import tj.com.latte.ec.R;
import tj.com.latte.ui.launcher.BannerLauncherTag;
import tj.com.latte.ui.launcher.LauncherHolderCreator;
import tj.com.latte.util.StorePref;

/**
 * Created by Jun on 17/8/19.
 */

public class LauncherBannerDelegate extends LatteDelegate implements OnItemClickListener{

    private ConvenientBanner<Integer> mConvenientBanner = null;
    private static final ArrayList<Integer> INTEGERS = new ArrayList<>();


    private void initBanner(){
        INTEGERS.add(R.mipmap.launcher_01);
        INTEGERS.add(R.mipmap.launcher_02);
        INTEGERS.add(R.mipmap.launcher_03);
        INTEGERS.add(R.mipmap.launcher_04);
        INTEGERS.add(R.mipmap.launcher_05);
        mConvenientBanner.setPages(new LauncherHolderCreator(),INTEGERS)
                .setPageIndicator(new int[]{R.drawable.dot_normal,R.drawable.dot_focus})
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL)
                .setOnItemClickListener(this)
                .setCanLoop(false);
    }


    @Override
    public Object setLayout() {
        mConvenientBanner = new ConvenientBanner<>(getContext());
        return mConvenientBanner;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        initBanner();
    }

    @Override
    public void onItemClick(int position) {
         //如果点击的是最后一个
        if (position == INTEGERS.size() - 1) {
            StorePref.setAppFlag(BannerLauncherTag.HAS_FIRST_LAUNCHER_APP.name(), true);
            //检查用户是否已经登录
//            AccountManager.checkAccount(new IUserChecker() {
//                @Override
//                public void onSignIn() {
//                    if (mILauncherListener != null) {
//                        mILauncherListener.onLauncherFinish(OnLauncherFinishTag.SIGNED);
//                    }
//                }
//
//                @Override
//                public void onNotSignIn() {
//                    if (mILauncherListener != null) {
//                        mILauncherListener.onLauncherFinish(OnLauncherFinishTag.NOT_SIGNED);
//                    }
//                }
//            });
        }

    }
}
