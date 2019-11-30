package com.example.modifier1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NumbersFragment extends Fragment {
    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private ArrayList<Module> data = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        recyclerView = rootView.findViewById(R.id.recycler_view);
        rootView.setBackgroundColor(getResources().getColor(R.color.numbersColor, null));

        data.add(new Module("One", "واحد", R.drawable.number_one));
        data.add(new Module("Two", "اثنين", R.drawable.number_two));
        data.add(new Module("Three", "ثلاثة", R.drawable.number_three));
        data.add(new Module("Four", "أربعة", R.drawable.number_four));
        data.add(new Module("Five", "خمسة", R.drawable.number_five));
        data.add(new Module("Six", "ستة", R.drawable.number_six));
        data.add(new Module("Seven", "سبعة", R.drawable.number_seven));
        data.add(new Module("Eight", "ثمانية", R.drawable.number_eight));
        data.add(new Module("Nine", "تسعة", R.drawable.number_nine));
        data.add(new Module("Ten", "عشرة", R.drawable.number_ten));


        adapter = new CustomAdapter(getContext(), data);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return rootView;
    }
}
