package com.example.modifier1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ColorsFragment extends Fragment {
    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private ArrayList<Module> data = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        recyclerView = rootView.findViewById(R.id.recycler_view);
        rootView.setBackgroundColor(getResources().getColor(R.color.colorsColor, null));

        data.add(new Module("red", "أحمر", R.drawable.color_red));
        data.add(new Module("green", "أخضر", R.drawable.color_green));
        data.add(new Module("blue", "أزرق", R.drawable.color_blue));
        data.add(new Module("yellow", "أصفر", R.drawable.color_yellow));
        data.add(new Module("gray", "رمادي", R.drawable.color_gray));
        data.add(new Module("black", "أسود", R.drawable.color_black));
        data.add(new Module("white", "أبيض", R.drawable.color_white));


        adapter = new CustomAdapter(getContext(), data);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return rootView;
    }
}
