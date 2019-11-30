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

public class PhrasesFragment extends Fragment {
    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private ArrayList<Module> data = new ArrayList<>();
    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        recyclerView = rootView.findViewById(R.id.recycler_view);
        rootView.setBackgroundColor(getResources().getColor(R.color.phrasesColor, null));

        imageView = rootView.findViewById(R.id.image_view);
        imageView.setVisibility(View.GONE);

        data.add(new Module("Where are you going?", "إلى أين تذهب؟"));
        data.add(new Module("What is your name?", "ما اسمك؟"));
        data.add(new Module("My name is...", "... اسمي هو"));
        data.add(new Module("How are you feeling?", "كيف تشعر؟"));
        data.add(new Module("I’m feeling good.", ".اشعر بشعور جيد"));
        data.add(new Module("Are you coming?", "هل انت قادم؟"));
        data.add(new Module("Yes, I’m coming.", ".نعم ، أنا قادم"));
        data.add(new Module("Let’s go.", ".لنذهب"));
        data.add(new Module("Come here.", ".تعال الى هنا"));



        adapter = new CustomAdapter(getContext(), data);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return rootView;
    }
}
