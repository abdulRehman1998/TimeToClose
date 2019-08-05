package com.example.timetoclose.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.timetoclose.AddEvent;
import com.example.timetoclose.OnSwipeTouchListener;
import com.example.timetoclose.R;
import com.example.timetoclose.UpgradeAccount;

public class MyTransactionsAdapter extends RecyclerView.Adapter<MyTransactionsAdapter.ViewHolder> {

    Context context;

    public MyTransactionsAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {
        final View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.transection_card, parent, false);
        v.setOnTouchListener(new OnSwipeTouchListener(parent.getContext()) {

            Button btnEdit = v.findViewById(R.id.btn_edit);
            Button btnDelete = v.findViewById(R.id.btn_delete);

            public void onSwipeRight() {
                if (btnDelete.getVisibility() == View.VISIBLE) {
                    btnDelete.setVisibility(View.GONE);
                } else
                    btnEdit.setVisibility(View.VISIBLE);

            }

            public void onSwipeLeft() {
                if (btnEdit.getVisibility() == View.VISIBLE)
                    btnEdit.setVisibility(View.GONE);
                else {
                    btnDelete.setVisibility(View.VISIBLE);
                }
            }

        });
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvBuyerName.setText("Aniq Ur Rehman");
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvBuyerName;
        TextView tvSellerName;
        TextView tvBuyerPhone;
        TextView tvSellerPhone;
        TextView tvPropertyAddress;
        TextView tvPropertyType;
        TextView tvClosingDate;
        TextView tvShareTransaction;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvBuyerName = itemView.findViewById(R.id.tv_buyer_name);
            tvBuyerPhone = itemView.findViewById(R.id.tv_buyer_phone);
            tvSellerName = itemView.findViewById(R.id.tv_seller_name);
            tvSellerPhone = itemView.findViewById(R.id.tv_seller_phone);
            tvPropertyAddress = itemView.findViewById(R.id.tv_property_address);
            tvPropertyType = itemView.findViewById(R.id.tv_property_type);
            tvClosingDate = itemView.findViewById(R.id.tv_closing_date);
            tvShareTransaction = itemView.findViewById(R.id.tv_share_transaction);
        }
    }
}
