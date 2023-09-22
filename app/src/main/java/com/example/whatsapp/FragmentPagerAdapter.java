package com.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class FragmentPagerAdapter extends FragmentStateAdapter {

    private ArrayList<ModelFragment> list;

    public FragmentPagerAdapter(@NonNull FragmentActivity fragmentActivity,ArrayList<ModelFragment> list) {
        super(fragmentActivity);
        this.list=list;
    }

    public void setList(ArrayList<ModelFragment> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return list.get(position).getFragment();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
