package com.tolstykh.textviewrichdrawable.example;

import android.content.Context;
import androidx.core.app.Fragment;
import androidx.core.app.FragmentManager;
import androidx.core.app.FragmentPagerAdapter;

public class DemoPagesAdapter extends FragmentPagerAdapter {

    private final DemoPage[] mDemoPages;
    private final Context mContext;

    public DemoPagesAdapter(Context context, FragmentManager fragmentManager, DemoPage[] demoPages) {
        super(fragmentManager);
        mContext = context;
        mDemoPages = demoPages;
    }

    @Override
    public int getCount() {
        return mDemoPages.length;
    }

    @Override
    public Fragment getItem(int position) {
        DemoPage demoPage = mDemoPages[position];
        return demoPage.instantiateFragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getString(mDemoPages[position].getTitleResId());
    }
}
