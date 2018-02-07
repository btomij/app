package com.joelin.userapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.joelin.userapp.Model.Product;
import com.joelin.userapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joelin on 2018/2/7.
 */

public class adt_product extends RecyclerView.Adapter<adt_product.itemViewHolder> {

    private ItemClickListener clickListener;
    private List<Product> dataset;

    public interface ItemClickListener {
        void onItemClick(int position);
    }

    static class itemViewHolder extends RecyclerView.ViewHolder {

        public TextView txvProductname;
        public TextView txvDescription;
        public TextView txvPrice;
        public TextView txvQty;


        public itemViewHolder(View itemView, final ItemClickListener clickListener) {
            super(itemView);
            txvProductname = (TextView) itemView.findViewById(R.id.txvProductname);
            txvDescription = (TextView) itemView.findViewById(R.id.txvDescription);
            txvPrice = (TextView) itemView.findViewById(R.id.txvPrice);
            txvQty = (TextView) itemView.findViewById(R.id.txvQty);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (clickListener != null) {
                        clickListener.onItemClick(getAdapterPosition());
                    }
                }
            });
        }
    }

    public adt_product(ItemClickListener clickListener) {
        this.clickListener = clickListener;
        this.dataset = new ArrayList<Product>();
    }

    public void setDatasource(@NonNull List<Product> products) {
        dataset = products;
        notifyDataSetChanged();
    }

    public Product getItem(int position) {
        return dataset.get(position);
    }

    @Override
    public adt_product.itemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product, parent, false);
        return new itemViewHolder(view, clickListener);
    }

    @Override
    public void onBindViewHolder(adt_product.itemViewHolder holder, int position) {
        Product item = dataset.get(position);
        holder.txvProductname.setText(item.getProductname());
        holder.txvDescription.setText(item.getDescription());
        holder.txvPrice.setText(String.valueOf(item.getPrice()));
        holder.txvQty.setText(String.valueOf(item.getQty()));
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
