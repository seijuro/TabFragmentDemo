package com.github.seijuro78.tabfragmentdemo.adapter;

/**
 * Created by sogiro on 2017. 7. 9..
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.github.ksoichiro.android.observablescrollview.CacheFragmentStatePagerAdapter;
import com.github.seijuro78.tabfragmentdemo.base.ViewPagerTab2GridViewFragment;
import com.github.seijuro78.tabfragmentdemo.base.ViewPagerTab2ListViewFragment;
import com.github.seijuro78.tabfragmentdemo.base.ViewPagerTab2RecyclerViewFragment;
import com.github.seijuro78.tabfragmentdemo.base.ViewPagerTab2ScrollViewFragment;
import com.github.seijuro78.tabfragmentdemo.base.ViewPagerTab2WebViewFragment;

/**
 * This adapter provides two types of fragments as an example.
 * {@linkplain #createItem(int)} should be modified if you use this example for your app.
 */
public class NavigationAdapter extends CacheFragmentStatePagerAdapter {
    private static final String[] TITLES = new String[]{"Applepie", "Butter Cookie", "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop"};

    public NavigationAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    protected Fragment createItem(int position) {
        Fragment f;
        final int pattern = position % 5;
        switch (pattern) {
            case 0:
                f = new ViewPagerTab2ScrollViewFragment();
                break;
            case 1:
                f = new ViewPagerTab2ListViewFragment();
                break;
            case 2:
                f = new ViewPagerTab2RecyclerViewFragment();
                break;
            case 3:
                f = new ViewPagerTab2GridViewFragment();
                break;
            case 4:
            default:
                f = new ViewPagerTab2WebViewFragment();
                break;
        }
        return f;
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }
}
