package com.example.timetoclose.Adapters;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.timetoclose.CreateTransactionFragment;
import com.example.timetoclose.MyTransactionsFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                Fragment createTransaction = new CreateTransactionFragment();
                return createTransaction;
            case 1:
                Fragment myTransaction = new MyTransactionsFragment();
                return myTransaction;
                default:
                    return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch(position){
            case 0:
                return "Create Transactions";
            case 1:
                return "My Transactions";
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

}
