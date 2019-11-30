package com.example.modifier1.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.modifier1.ColorsFragment;
import com.example.modifier1.FamilyFragment;
import com.example.modifier1.NumbersFragment;
import com.example.modifier1.PhrasesFragment;
import com.example.modifier1.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.numbers, R.string.colors, R.string.family, R.string.phrases};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        //returning the current tab
        switch (position){
            case 0:
                NumbersFragment tab1 = new NumbersFragment();
                return tab1;
            case 1:
                ColorsFragment tab2 = new ColorsFragment();
                return tab2;
            case 2:
                FamilyFragment tab3 = new FamilyFragment();
                return tab3;
            case 3:
                PhrasesFragment tab4 = new PhrasesFragment();
                return tab4;

            default: return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return TAB_TITLES.length;
    }
}