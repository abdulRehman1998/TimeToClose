package com.example.timetoclose.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.timetoclose.CreateTransaction;
import com.example.timetoclose.MyTransactions;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                Fragment createTransaction = new CreateTransaction();
                return createTransaction;
            case 1:
                Fragment myTransaction = new MyTransactions();
                return myTransaction;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

}
