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

public class FamilyFragment extends Fragment {
    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private ArrayList<Module> data = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        recyclerView = rootView.findViewById(R.id.recycler_view);
        rootView.setBackgroundColor(getResources().getColor(R.color.familyColor, null));

        data.add(new Module("father", "أب", R.drawable.family_father));
        data.add(new Module("mother", "أم", R.drawable.family_mother));
        data.add(new Module("son", "ابن", R.drawable.family_son));
        data.add(new Module("daughter", "ابنة", R.drawable.family_daughter));
        data.add(new Module("older brother", "الأخ الاكبر", R.drawable.family_older_brother));
        data.add(new Module("younger brother", "الأخ الاصغر", R.drawable.family_younger_brother));
        data.add(new Module("older sister", "الأخت الكبرى", R.drawable.family_older_sister));
        data.add(new Module("younger sister", "الأخت الصغرى", R.drawable.family_younger_sister));
        data.add(new Module("grandfather", "جد", R.drawable.family_grandfather));
        data.add(new Module("grandmother", "جدة", R.drawable.family_grandmother));



        adapter = new CustomAdapter(getContext(), data);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return rootView;
    }
}
