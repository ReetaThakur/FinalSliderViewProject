package com.example.swipcardprojexct;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CardStackAdapter extends RecyclerView.Adapter<CardStackAdapter.ViewHolder> {
    private List<ItemModel> items;

    public CardStackAdapter(List<ItemModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  CardStackAdapter.ViewHolder holder, int position) {
        holder.setData(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

     class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;
        TextView age;
        TextView place;
        TextView percentage;
        TextView description;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            name=itemView.findViewById(R.id.name);
            age=itemView.findViewById(R.id.age);
            place=itemView.findViewById(R.id.place);
            percentage=itemView.findViewById(R.id.percentage);
            description=itemView.findViewById(R.id.description);
        }

        void setData(ItemModel data) {
            image.setImageResource(data.getImage());
            name.setText(data.getName());
            age.setText(data.getAge()+"");
            place.setText(data.getPlace());
            percentage.setText(data.getPercentage());
            description.setText(data.getDescription());
        }
    }
}
