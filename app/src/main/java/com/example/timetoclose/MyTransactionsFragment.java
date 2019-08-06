package com.example.timetoclose;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.timetoclose.Adapters.MyTransactionsAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyTransactionsFragment extends Fragment {


    public MyTransactionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_transactions, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rvMyTransactions = view.findViewById(R.id.rv_my_transactions);
        MyTransactionsAdapter myTransactionsAdapter = new MyTransactionsAdapter(getContext());
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getContext());
        rvMyTransactions.setLayoutManager(lm);
        rvMyTransactions.setAdapter(myTransactionsAdapter);



    }
}
