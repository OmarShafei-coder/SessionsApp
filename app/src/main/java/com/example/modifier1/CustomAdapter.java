package com.example.modifier1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private Context context;
    private ArrayList<Module> data;
    private LayoutInflater layoutInflater;

    public CustomAdapter(Context context, ArrayList<Module> data) {
        this.context = context;
        this.data = data;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        CustomViewHolder customViewHolder = new CustomViewHolder(view);
        return customViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Module currentElement = data.get(position);
        holder.image.setImageDrawable(context.getResources().getDrawable(currentElement.getImage(),null));
        holder.englishWord.setText(currentElement.getEnglishWord());
        holder.arabicWord.setText(currentElement.getArabicWord());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView englishWord;
        private TextView arabicWord;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image_view);
            englishWord = itemView.findViewById(R.id.english_text);
            arabicWord = itemView.findViewById(R.id.arabic_text);
        }
    }
}
