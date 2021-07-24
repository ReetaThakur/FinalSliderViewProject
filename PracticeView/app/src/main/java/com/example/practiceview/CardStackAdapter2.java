package com.example.practiceview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CardStackAdapter2 extends RecyclerView.Adapter<CardStackAdapter2.ViewHolder> {
    private List<ItemModel> modelList2;
    public CardStackAdapter2(List<ItemModel> modelList){
        this.modelList2=modelList;
    }
    @NonNull
    @Override
    public CardStackAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item2_layout,parent,false);
        return new CardStackAdapter2.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardStackAdapter2.ViewHolder holder, int position) {
       holder.setData(modelList2.get(position));
    }

    @Override
    public int getItemCount() {
        return modelList2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        TextView age;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageonly);
            name=itemView.findViewById(R.id.name);
            age=itemView.findViewById(R.id.age);
        }
        void setData(ItemModel data){
            Picasso.get()
                    .load(data.getImage())
                    .fit()
                    .centerCrop()
                    .into(imageView);
            name.setText(data.getName());
            age.setText(data.getAge()+"");
        }
    }
}

